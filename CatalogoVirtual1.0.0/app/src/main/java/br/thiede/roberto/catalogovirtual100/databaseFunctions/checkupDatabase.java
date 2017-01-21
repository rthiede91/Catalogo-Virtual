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

        for (int a =0; a<stdVars.databaseTables.length; a++)
        {
            for(int b=0; b<stdVars.databaseTables[a].length; b++)
            {
                Log.d("CeckDB", "Table: " + stdVars.databaseTables[a][b]);
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
            content.put("category", prouct.getCategory());
            content.put("sub_category", prouct.getSub_category());
            content.put("ref", prouct.getRef());

        db.insert("catalog",null, content);
        db.close();
    }

    public List<product> selectAll()
    {
        List<product> products = new ArrayList<product>();

        SQLiteDatabase db = getWritableDatabase();

        String sqlQuery = "SELECT * FROM catalog";

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
                thisProduct.setCategory(cursor.getString(6));
                thisProduct.setSub_category(cursor.getString(7));
                thisProduct.setRef(cursor.getString(8));

                products.add(thisProduct);
            }
            while(cursor.moveToNext());

        }

        return products;

    }

}
