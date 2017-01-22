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

public class checkupDatabase extends SQLiteOpenHelper
{
    standardVars stdVars = new standardVars();

    public checkupDatabase(Context context)
    {
        super(context, standardVars.databaseName, null, standardVars.databaseVersion);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {

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

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void insertProduct(product prouct)
    {
        SQLiteDatabase db = getWritableDatabase();

        ContentValues content = new ContentValues();
            content.put("name", prouct.getName());
            content.put("price", prouct.getPrice());
            content.put("description", prouct.getDescription());
            content.put("images", prouct.getImages());
            content.put("category", prouct.getCategory_id());
            content.put("sub_category", prouct.getBusiness_id());
            content.put("sub_category", prouct.getKeywords());
            content.put("ref", prouct.getRef());

        db.insert(stdVars.databaseTables[stdVars.productTable][0],null, content);
        db.close();
    }



}
