package com.kdv.taxis.config;

import java.io.FileWriter;
import java.io.IOException;


/*
Class for exports files, such as *.json and *.xml
 */

public class Writer {

    public static void write2File(FileWriter file, String s) throws IOException {
        try{
            file.write(s);
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            file.flush();
            file.close();
        }
    }
}
