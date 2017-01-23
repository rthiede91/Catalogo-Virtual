package br.thiede.roberto.catalogovirtual100.databaseFunctions;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import br.thiede.roberto.catalogovirtual100.configs.standardVars;
import br.thiede.roberto.catalogovirtual100.models.product;

/**
 * Created by thiedes on 21/01/17.
 */

public class update extends SQLiteOpenHelper
{
    public update(Context context)
    {
        super(context, standardVars.databaseName, null, standardVars.databaseVersion);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
