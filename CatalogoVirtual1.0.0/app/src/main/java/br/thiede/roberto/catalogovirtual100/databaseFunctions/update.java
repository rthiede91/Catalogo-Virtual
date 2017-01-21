package br.thiede.roberto.catalogovirtual100.databaseFunctions;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import br.thiede.roberto.catalogovirtual100.models.product;

/**
 * Created by thiedes on 21/01/17.
 */

public class update extends SQLiteOpenHelper
{
    private static final String DBName = "catalogs";
    private static final int DBVersion = 100;

    public update(Context context)
    {
        super(context, DBName, null, DBVersion);
    }

    public void product(product prouct)
    {
        SQLiteDatabase db = getWritableDatabase();

        ContentValues content = new ContentValues();
        content.put("name", prouct.getName());
        content.put("price", prouct.getPrice());
        content.put("description", prouct.getDescription());
        content.put("images", prouct.getImages());
        content.put("category", prouct.getCategory());
        content.put("sub_category", prouct.getSub_category());
        content.put("ref", prouct.getRef());

        db.insert("catalog",null, content);
        db.close();
    }

    public void category(product prouct)
    {
        SQLiteDatabase db = getWritableDatabase();

        ContentValues content = new ContentValues();
        content.put("name", prouct.getName());
        content.put("price", prouct.getPrice());
        content.put("description", prouct.getDescription());
        content.put("images", prouct.getImages());
        content.put("category", prouct.getCategory());
        content.put("sub_category", prouct.getSub_category());
        content.put("ref", prouct.getRef());

        db.insert("catalog",null, content);
        db.close();
    }

    public void business(product prouct)
    {
        SQLiteDatabase db = getWritableDatabase();

        ContentValues content = new ContentValues();
        content.put("name", prouct.getName());
        content.put("price", prouct.getPrice());
        content.put("description", prouct.getDescription());
        content.put("images", prouct.getImages());
        content.put("category", prouct.getCategory());
        content.put("sub_category", prouct.getSub_category());
        content.put("ref", prouct.getRef());

        db.insert("catalog",null, content);
        db.close();
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
