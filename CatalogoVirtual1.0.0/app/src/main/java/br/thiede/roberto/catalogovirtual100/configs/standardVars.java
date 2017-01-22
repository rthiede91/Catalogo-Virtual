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
                    "name varchar(100) NOT NULL,",
                    "description text NOT NULL,",
                    "images text NOT NULL,",
                    "keywords text NOT NULL,",
                    "category varchar(150) NOT NULL,",
                    "ref varchar(50) DEFAULT NULL",
                    ")"
            },
            {
                    "category(",
                    "id INTEGER PRIMARY KEY AUTOINCREMENT,",
                    "date timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,",
                    "name varchar(100) NOT NULL,",
                    "description text NOT NULL,",
                    "images text NOT NULL,",
                    "business_id text NOT NULL,",
                    "category varchar(150) NOT NULL,",
                    "ref varchar(50) DEFAULT NULL",
                    ")"
            },
            {
                    "product(",
                    "id INTEGER PRIMARY KEY AUTOINCREMENT,",
                    "date timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,",
                    "name varchar(100) NOT NULL,",
                    "price int(10) NOT NULL,",
                    "description text NOT NULL,",
                    "images text NOT NULL,",
                    "category_id varchar(15) NOT NULL,",
                    "business_id varchar(15) NOT NULL,",
                    "keywords text NOT NULL,",
                    "ref varchar(50) DEFAULT NULL",
                    ")"
            },
    };

}
