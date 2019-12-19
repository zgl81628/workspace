package com.neusoft.class09;

public class Main {

    //22307196
    public static void main(String[] args) {

        MyObject object = new MyObject();
        MyObject object1 = new MyObject();
        int k = object.hashCode();
        System.out.println(k);

        System.out.println(object);

        Integer a = new Integer(1);
        Integer b = new Integer(1);

        boolean c = a.equals(b);
        boolean d = a==b;
        System.out.println(c+"****"+d);
    }
}
