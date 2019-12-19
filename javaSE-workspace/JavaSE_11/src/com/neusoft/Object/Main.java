package com.neusoft.Object;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String path = "object.txt";
        File file = new File(path);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            objectWrite(file);
            objectRead(file);
        }
        catch (FileNotFoundException e1)
        {
            e1.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void objectWrite(File file) throws FileNotFoundException,IOException {
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file));
        List<Product> list = new ArrayList<>();
        Product p1 = new Product("辣条1",4.5f);
        Product p2 = new Product("辣条2",4.5f);
        list.add(p1);
        list.add(p2);
        outputStream.writeObject(list);
        outputStream.close();
    }

    public static void objectRead(File file) throws FileNotFoundException,IOException {
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file));

        try {
               Object object  = inputStream.readObject();
               List<Product> list = (List<Product>) object;
               list.forEach(p-> System.out.println(p));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            inputStream.close();
        }

    }
}
