package com.neusoft.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class TestArrayList {

    public static void main(String[] args) {
        List<Object> list = new ArrayList();
        list.add(1);
        list.add(1);
        list.add("大大大");
        list.add(" ");

        list.set(1,"我靠");
        System.out.println(list.toString());

        Object object = list.get(0);

        int index = list.indexOf("大大大");
        System.out.println(index);

//        for (Object o:list) {
//            System.out.println(o);
//        }

        ListIterator iterator = list.listIterator();

        while(iterator.hasNext())
        {
            Object obj = iterator.next();
            System.out.println(obj);
        }
    }
}
