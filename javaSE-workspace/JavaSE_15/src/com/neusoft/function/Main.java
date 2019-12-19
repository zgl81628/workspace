package com.neusoft.function;

public class Main {

    public static void main(String[] args) {
        int a1=10,b1=20;
        HeiHei heiHei = (a,b)->{
            System.out.println(a);
            System.out.println(b);
            return a+b;
        };

       int a = heiHei.show(a1,b1);
        System.out.println(a);
    }
}
