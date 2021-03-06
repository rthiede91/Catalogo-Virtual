package br.thiede.roberto.catalogovirtual100.configs;

import android.os.Environment;

import java.io.File;

/**
 * Created by thiedes on 21/01/17.
 */

public class standardVars
{
    public static final  int appVersion = 100;

    public static final  String imagesPath = Environment.getExternalStorageDirectory()+"/CatalogoVirtual/";
    public static final  String imagesType = "image/jpeg";
    public static final  int imagesQuality = 50;

    public static final  String urlPhpUpdateDB = "http://octaltech.com.br/catalogovirtual/php/update.php";
    public static final  String urlPhpUpgradeDB = "http://octaltech.com.br/catalogovirtual/php/upgrade.php";
    public static final  String urlImages = "http://octaltech.com.br/catalogovirtual/images/";

    public static final  String spacer1 = "#@#";
    public static final  String spacer2 = "!*!";
    public static final  String spacer3 = "$%$";

    public static final  String databaseUser = "octal238_catalog";
    public static final  String databasePass = "c2t2l0g0v1rtual";

    public static final  String databaseName = "catalogovirtual";
    public static final  int databaseVersion = 100;

    public static final int businessTable = 0;
    public static final int categoryTable = 1;
    public static final int productTable = 2;
    public static final String[][] databaseTables = {
            {
                    "business(",
                    "id INTEGER PRIMARY KEY AUTOINCREMENT,",
                    "date timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,",
                    "name varchar(200) NOT NULL,",
                    "description text NOT NULL,",
                    "images text NOT NULL,",
                    "keywords text NOT NULL,",
                    "category varchar(150) NOT NULL,",
                    "ref varchar(50)",
                    ")"
            },
            {
                    "category(",
                    "id INTEGER PRIMARY KEY AUTOINCREMENT,",
                    "date timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,",
                    "name varchar(200) NOT NULL,",
                    "description text NOT NULL,",
                    "images text NOT NULL,",
                    "business_ref text NOT NULL,",
                    "ref varchar(50)",
                    ")"
            },
            {
                    "product(",
                    "id INTEGER PRIMARY KEY AUTOINCREMENT,",
                    "date timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,",
                    "name varchar(200) NOT NULL,",
                    "price int(15) NOT NULL,",
                    "description text NOT NULL,",
                    "images text NOT NULL,",
                    "keywords text NOT NULL,",
                    "business_ref varchar(50) NOT NULL,",
                    "category_ref varchar(50) NOT NULL,",
                    "sub_category varchar(50) NOT NULL,",
                    "ref varchar(50)",
                    ")"
            },
    };

}
