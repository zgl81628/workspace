package com.neusoft.charset;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        String path = "sss.txt";
        File file = new File(path);
        try {
            if(!file.exists())
            {
                file.createNewFile();
            }
            //writeFile(file);
            readFile(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFile(File file) throws IOException
    {
        FileReader reader = new FileReader(file);
        char[] chars = new char[reader.read()];
        reader.read(chars);
        System.out.println(chars);
    }

    public static void writeFile(File file) throws IOException
    {
        FileWriter fileWriter = new FileWriter(file,true);
        String str = "水电费水电费水电费水电费水电费";
        fileWriter.write(str);
        fileWriter.close();


        try(FileWriter fileWriter01 = new FileWriter(file,true);){

        }catch (IOException EX)
        {

        }finally {

        }
    }
}
