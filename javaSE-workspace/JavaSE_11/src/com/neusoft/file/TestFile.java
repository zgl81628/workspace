package com.neusoft.file;

import java.io.File;
import java.io.IOException;

public class TestFile {

    //File 可以是目录页可以是文件
    public static void main(String[] args) {
        File file = new File("e://aaa//ccc");
        try {
            if(file.exists())
            {
                file.delete();
            }else{
                file.mkdirs();
                File file1 = new File(file.getAbsolutePath(),"aaa.txt");
                file1.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
