package br.thiede.roberto.catalogovirtual100.databaseFunctions;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

import br.thiede.roberto.catalogovirtual100.configs.standardVars;
import br.thiede.roberto.catalogovirtual100.models.business;
import br.thiede.roberto.catalogovirtual100.models.category;
import br.thiede.roberto.catalogovirtual100.models.product;

/**
 * Created by thiedes on 21/01/17.
 */

public class insert extends SQLiteOpenHelper
{
    public insert(Context context)
    {
        super(context, standardVars.databaseName, null, standardVars.databaseVersion);
    }

    public void product(product prouct)
    {
        SQLiteDatabase db = getWritableDatabase();

        ContentValues content = new ContentValues();
        content.put("name", prouct.getName());
        content.put("price", prouct.getPrice());
        content.put("description", prouct.getDescription());
        content.put("images", prouct.getImages());
        content.put("business_id", prouct.getBusiness_id());
        content.put("category_id", prouct.getCategory_id());
        content.put("keywords", prouct.getKeywords());
        content.put("ref", prouct.getRef());

        db.insert(standardVars.databaseTables[standardVars.productTable][0],null, content);
        db.close();
    }

    public void category(category category)
    {
        SQLiteDatabase db = getWritableDatabase();

        ContentValues content = new ContentValues();
        content.put("name", category.getName());
        content.put("description", category.getDescription());
        content.put("images", category.getImages());
        content.put("business_id", category.getBusiness_id());
        content.put("category", category.getCategory());
        content.put("ref", category.getRef());

        db.insert(standardVars.databaseTables[standardVars.categoryTable][0],null, content);
        db.close();
    }

    public void business(business business)
    {
        SQLiteDatabase db = getWritableDatabase();

        ContentValues content = new ContentValues();
        content.put("name", business.getName());
        content.put("description", business.getDescription());
        content.put("images", business.getImages());
        content.put("keywords", business.getKeywords());
        content.put("category", business.getCategory());
        content.put("ref", business.getRef());

        db.insert(standardVars.databaseTables[standardVars.businessTable][0],null, content);
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
