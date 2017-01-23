package br.thiede.roberto.catalogovirtual100.configs;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.io.File;

import br.thiede.roberto.catalogovirtual100.databaseFunctions.databaseCheckup;

import static android.R.attr.name;

/**
 * Created by roberto on 21/01/17.
 */

public class checkupApp
{
    Context context;
    public checkupApp(Context context)
    {
        this.context = context;
    }

    standardVars stdVars = new standardVars();

    public  boolean imagesPath()
    {
        boolean start = false;

        Log.d("CheckupApp", "verificando diretorio das imagens");
        File imagesPath = new File(stdVars.imagesPath);
        if (imagesPath.exists())
            start=true;
        else
        {
            Log.d("CheckupApp", "Diretorio não existe, criando " + stdVars.imagesPath);
            if (imagesPath.mkdirs())
            {
                Log.d("CheckupApp", "Diretorio criado.");
                start = true;
            }

        }
        if(start)
            Log.d("CheckupApp", "Diretorio ok..");
        return start;
    }

    public  boolean database()
    {
        boolean start = false;
        Log.d("CheckupApp", "Verificando banco de dados");
        File database = context.getDatabasePath(stdVars.databaseName);
        if (!database.exists())
        {
            Log.d("CheckupApp", "Banco de dados não existe, criando " + stdVars.databaseName + " | " +  database.getPath());

            databaseCheckup dbcheck = new databaseCheckup(context);
            if (!database.exists())
            {
                Log.d("CheckupApp", "Banco de dados criado. " + dbcheck.getDatabaseName() + " | " + dbcheck.getReadableDatabase().getPath());
                start = true;
            }
            dbcheck.close();
        }
        else
        {
            Log.d("CheckupApp", "Banco de dados encontrado");
        }
        if(start)
            Log.d("CheckupApp", "Banco de dados ok..");
        return start;
    }
}
