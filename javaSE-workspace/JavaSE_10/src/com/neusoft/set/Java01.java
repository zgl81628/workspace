package com.neusoft.set;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Java01 {

    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("撒的发生");
        set.add("电饭锅");
        set.add("就看看");

        Collection collection = new HashSet();
        collection.add(1);
        collection.add(1);

        collection.addAll(set);

        System.out.println(collection.size());
        System.out.println(collection.isEmpty());
        System.out.println(collection.contains("就看看"));
        Object[] objects = collection.toArray();

        System.out.println(collection.remove("电饭锅"));

        boolean bol = collection.containsAll(set);
        System.out.println(bol);

        Collection collection01 = new HashSet();
        collection01.addAll(set);

        boolean bol01 = collection.retainAll(collection01);

        collection.clear();

        for (Object c:collection) {
            System.out.println(c);
        }


    }
}
