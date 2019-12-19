package com.neusoft.buufer;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        String path = "buffer.txt";
        File file = new File(path);
        try {
            if(!file.exists())
            {
                file.createNewFile();
            }
            writeFile(file);
            readFile(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFile(File file) throws IOException{

        BufferedReader reader = new BufferedReader(new FileReader(file));
        StringBuilder sb = new StringBuilder();
        while(reader.ready()) {
            sb.append("\r\n");
            sb.append(reader.readLine());
        }
        System.out.println(sb.toString());
    }

    public static void writeFile(File file) throws IOException{

        BufferedWriter writer = new BufferedWriter(new FileWriter(file,true));
        writer.write("哈哈哈哈哈!!!!\r\n");
        writer.flush();

        writer.write("嘿嘿嘿嘿嘿嘿!!!!\r\n");
        writer.flush();

        writer.write("嘻嘻嘻嘻嘻嘻嘻嘻!!!!\r\n");
        writer.close();
    }
}
