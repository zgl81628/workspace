package com.neusoft.stram;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args){

        String path = "kk.txt";
        File file = new File(path);
        try {
        if(!file.exists())
        {
            file.createNewFile();
        }
        //writeFile(file);
           // readFile(file);
            readFile01(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void readFile(File file) throws IOException{
        FileInputStream inputStream = new FileInputStream(file);
        byte[] bytes = new byte[inputStream.available()];
        inputStream.read(bytes);
        String str = new String(bytes);
        System.out.println(str);
        inputStream.close();
    }

    public static void readFile01(File file) throws IOException{
        FileInputStream inputStream = new FileInputStream(file);
        int b;
        while((b=inputStream.read())!=-1)
        {
            System.out.print((char)b);
        }
        inputStream.close();
    }

    public static void writeFile(File file) throws IOException{

        System.out.println("文件找到了...");
        FileOutputStream outputStream = new FileOutputStream(file,true);
        String str = "水电费水电费方式大是大非水电费水电费水电费!!!";
        outputStream.write(str.getBytes(),0,str.getBytes().length);
        outputStream.flush();
        String str1 = "\r\n我考试网盘又写了一段!!!";
        outputStream.write(str1.getBytes(),0,str1.getBytes().length);
        outputStream.close();
    }

}
