package br.thiede.roberto.catalogovirtual100.configs;

import android.os.Environment;

import java.io.File;

/**
 * Created by roberto on 21/01/17.
 */

public class checkupApp
{
    standardVars stdVars = new standardVars();

    public  boolean init()
    {
        boolean start = true;

        //Criar Diretorios necessarios
        File imagesPath = new File(stdVars.imagesPath);
        if (!imagesPath.mkdirs())
            start=false;

    return start;
    }
}
