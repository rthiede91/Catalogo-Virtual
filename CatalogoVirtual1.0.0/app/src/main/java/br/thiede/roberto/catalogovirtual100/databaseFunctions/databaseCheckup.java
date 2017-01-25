package br.thiede.roberto.catalogovirtual100.databaseFunctions;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import br.thiede.roberto.catalogovirtual100.configs.standardVars;
import br.thiede.roberto.catalogovirtual100.models.product;


/**
 * Created by thiedes on 18/01/17.
 */

public class databaseCheckup extends SQLiteOpenHelper
{
    standardVars stdVars = new standardVars();

    public databaseCheckup(Context context)
    {
        super(context, standardVars.databaseName, null, standardVars.databaseVersion);
    }

    @Override
    public  void onCreate(SQLiteDatabase db)
    {
        standardVars stdVars = new standardVars();
        Log.d("CheckupDB", "CREATE DATABASE");
        String sqlQuery = "";
        for (int a =0; a<stdVars.databaseTables.length; a++)
        {
            sqlQuery = "CREATE TABLE IF NOT EXISTS ";
            for(int b=0; b<stdVars.databaseTables[a].length; b++)
            {
                sqlQuery += stdVars.databaseTables[a][b];
            }
            db.execSQL(sqlQuery);

        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {

    }
}
