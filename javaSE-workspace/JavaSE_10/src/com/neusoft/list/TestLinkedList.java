package com.neusoft.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
        linkedList.add("4");

       linkedList.addFirst("这是头");
       linkedList.addLast("sdfsd");
        System.out.println(linkedList);

       Iterator iterator = linkedList.iterator();
       while(iterator.hasNext())
       {
           Object object = iterator.next();
           System.out.println(object);
       }
    }
}
