package br.thiede.roberto.catalogovirtual100.fileFunctions;

/**
 * Created by thiedes on 18/01/17.
 */

import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.media.MediaScannerConnection;
import android.os.AsyncTask;
import android.os.Environment;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class imageDownload extends AsyncTask<String, String, String> {

    private Context context;
    private ProgressDialog pDialog;
    String image_url;
    URL ImageUrl;
    String myFileUrl1;
    Bitmap bmImg = null;

    public imageDownload(Context context) {
        this.context = context;
    }

    @Override
    protected void onPreExecute() {
        // TODO Auto-generated method stub

        super.onPreExecute();

        pDialog = new ProgressDialog(context);
        pDialog.setMessage("Please wait...");
        pDialog.setIndeterminate(false);
        pDialog.setCancelable(false);
        pDialog.show();

    }

    @Override
    protected String doInBackground(String... args) {
        // TODO Auto-generated method stub

        InputStream is = null;

        try {

            ImageUrl = new URL(args[0]);
            // myFileUrl1 = args[0];
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = Config.RGB_565;

            String path = ImageUrl.getPath();
            String idStr = path.substring(path.lastIndexOf('/') + 1);
            File filepath = Environment.getExternalStorageDirectory();
            File dir = new File(filepath.getAbsolutePath()
                    + "/akmos100/");
            dir.mkdirs();
            String fileName = idStr;
            File file = new File(dir, fileName);
            FileOutputStream fos = new FileOutputStream(file);

            File imageFile = file;

            HttpURLConnection conn = (HttpURLConnection) ImageUrl
                    .openConnection();
            conn.setDoInput(true);
            conn.connect();
            is = conn.getInputStream();

            bmImg = BitmapFactory.decodeStream(is, null, options);

            bmImg.compress(CompressFormat.JPEG, 50, fos);
            fos.flush();
            fos.close();

            MediaScannerConnection.scanFile(context,
                    new String[] { imageFile.getPath() },
                    new String[] { "image/jpeg" }, null);

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (is != null)
            {
                try
                {
                    is.close();
                }
                catch (Exception e)
                {
                }
            }
        }

        return null;
    }

    @Override
    protected void onPostExecute(String args) {
        // TODO Auto-generated method stub

        if (bmImg == null) {

            Toast.makeText(context, "Image still loading...",
                    Toast.LENGTH_SHORT).show();

            pDialog.dismiss();

        }

        else {

            if (pDialog!=null) {
                if (pDialog.isShowing())
                {
                    pDialog.dismiss();
                }
            }

            Toast.makeText(context, " Successfully Saved",
                    Toast.LENGTH_SHORT).show();

        }
    }

}
