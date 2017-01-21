package br.thiede.roberto.catalogovirtual100.phpFunctions;

import android.os.AsyncTask;
import android.util.Log;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class updateDatabase extends AsyncTask
{
    @Override
    protected Object doInBackground(Object... params)
    {
        Log.d("app-log-php", "Start Script (Variables)");
        String link = "http://octaltech.com.br/akmos100/php/select.php";

        try
        {
            Log.d("app-log-php", "Start Connection (Variables)");
            URL url = new URL(link);
            HttpClient client = new DefaultHttpClient();
            HttpGet request = new HttpGet();
            request.setURI(new URI(link));
            HttpResponse response = client.execute(request);
            BufferedReader in = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
            StringBuffer sb = new StringBuffer("");
            String line="";
            Log.d("app-log-php", "Get Values (php return)");
            Log.d("app-log-php", "----------------------------------");
            int pos =0;
            while ((line = in.readLine()) != null)
            {
                sb.append(line);
                Log.d("app-log-php", "Value ("+ pos++ +")  [  " + sb.toString() + " ]\n");
                break;
            }
            Log.d("app-log-php", "----------------------------------");
            in.close();
           return new String(sb.toString());

        }
        catch (MalformedURLException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (URISyntaxException e)
        {
            e.printStackTrace();
        }
        return new Object();
    }
}
