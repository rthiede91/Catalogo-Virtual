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

public class select extends SQLiteOpenHelper
{

    public select(Context context)
    {
        super(context, standardVars.databaseName, null, standardVars.databaseVersion);
    }

    public List<product> product()
    {
        List<product> products = new ArrayList<product>();

        SQLiteDatabase db = getWritableDatabase();

        String sqlQuery = "SELECT * FROM "+ standardVars.databaseTables[standardVars.productTable][0];

        Cursor cursor = db.rawQuery(sqlQuery, null);

        if(cursor.moveToFirst())
        {
            product thisProduct = new product();
            do
            {
                thisProduct.setId(cursor.getInt(0));
                thisProduct.setDate(cursor.getString(1));
                thisProduct.setName(cursor.getString(2));
                thisProduct.setPrice(cursor.getString(3));
                thisProduct.setDescription(cursor.getString(4));
                thisProduct.setImages(cursor.getString(5));
                thisProduct.setCategory_id(cursor.getString(6));
                thisProduct.setBusiness_id(cursor.getString(7));
                thisProduct.setKeywords(cursor.getString(8));
                thisProduct.setRef(cursor.getString(9));

                products.add(thisProduct);
            }
            while(cursor.moveToNext());

        }
        return products;

    }


    public List<category> category()
    {
        List<category> category = new ArrayList<category>();

        SQLiteDatabase db = getWritableDatabase();

        String sqlQuery = "SELECT * FROM "+ standardVars.databaseTables[standardVars.categoryTable][0];

        Cursor cursor = db.rawQuery(sqlQuery, null);

        if(cursor.moveToFirst())
        {
            category thisCategory = new category();
            do
            {
                thisCategory.setId(cursor.getInt(0));
                thisCategory.setDate(cursor.getString(1));
                thisCategory.setName(cursor.getString(2));
                thisCategory.setDescription(cursor.getString(3));
                thisCategory.setImages(cursor.getString(4));
                thisCategory.setBusiness_id(cursor.getString(5));
                thisCategory.setCategory(cursor.getString(6));
                thisCategory.setRef(cursor.getString(7));

                category.add(thisCategory);
            }
            while(cursor.moveToNext());

        }
        return category;

    }

    public List<business> business()
    {
        List<business> business = new ArrayList<business>();

        SQLiteDatabase db = getWritableDatabase();

        String sqlQuery = "SELECT * FROM "+ standardVars.databaseTables[standardVars.businessTable][0];

        Cursor cursor = db.rawQuery(sqlQuery, null);

        if(cursor.moveToFirst())
        {
            business thisBusiness= new business();
            do
            {
                thisBusiness.setId(cursor.getInt(0));
                thisBusiness.setDate(cursor.getString(1));
                thisBusiness.setName(cursor.getString(2));
                thisBusiness.setDescription(cursor.getString(3));
                thisBusiness.setImages(cursor.getString(4));
                thisBusiness.setCategory(cursor.getString(5));
                thisBusiness.setKeywords(cursor.getString(6));
                thisBusiness.setRef(cursor.getString(7));

                business.add(thisBusiness);
            }
            while(cursor.moveToNext());

        }
        return business;

    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
