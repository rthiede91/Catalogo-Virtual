package br.thiede.roberto.catalogovirtual100.databaseFunctions;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import br.thiede.roberto.catalogovirtual100.models.business;
import br.thiede.roberto.catalogovirtual100.models.category;
import br.thiede.roberto.catalogovirtual100.models.product;

/**
 * Created by thiedes on 21/01/17.
 */

public class inserts extends SQLiteOpenHelper
{
    private static final String DBName = "catalogs";
    private static final int DBVersion = 100;

    public inserts(Context context)
    {
        super(context, DBName, null, DBVersion);
    }

    public void business(business business)
    {
        SQLiteDatabase db = getWritableDatabase();

        ContentValues content = new ContentValues();
        content.put("name", business.getName());
        content.put("price", business.getPrice());
        content.put("description", business.getDescription());
        content.put("images", business.getImages());
        content.put("category", business.getCategory());
        content.put("sub_category", business.getSub_category());
        content.put("ref", business.getRef());

        db.insert("business",null, content);
        db.close();
    }

    public void category(category category)
    {
        SQLiteDatabase db = getWritableDatabase();

        ContentValues content = new ContentValues();
        content.put("name", category.getName());
        content.put("price", category.getPrice());
        content.put("description", category.getDescription());
        content.put("images", category.getImages());
        content.put("category", category.getCategory());
        content.put("sub_category", category.getSub_category());
        content.put("ref", category.getRef());

        db.insert("category",null, content);
        db.close();
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

        db.insert("product",null, content);
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
