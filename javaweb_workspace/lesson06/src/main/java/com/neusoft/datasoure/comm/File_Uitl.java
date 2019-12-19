package com.neusoft.datasoure.comm;

import java.io.*;

public class File_Uitl {

    public static String readFile(String path) {
        File file = new File(path);
        BufferedReader reader = null;
        String str = "";
        try {
            reader = new BufferedReader(new FileReader(file));
            str = reader.readLine();
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return str;
    }

    public static void writeFile(String path) {
        File file = new File(path);
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(file,false));
            writer.write("Y");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
