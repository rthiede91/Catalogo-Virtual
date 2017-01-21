package br.thiede.roberto.catalogovirtual100;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import br.thiede.roberto.catalogovirtual100.configs.standardVars;

public class MainActivity extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        standardVars stdVars = new standardVars();
        for (int a =0; a<stdVars.databaseTables.length; a++)
        {
            Log.d("CHECKDB", "CREATE TABLE ");
            for(int b=0; b<stdVars.databaseTables[a].length; b++)
            {
                Log.d("CHECKDB", " " + stdVars.databaseTables[a][b]);
            }
        }

    }

    public void showBusiness()
    {

    }
    public void showCategories(String businessId)
    {

    }
    public void showProducts(String businessId, String categoriId)
    {

    }

}
