package com.neusoft.class02;

public class Java02 {
    public static void main(String[] args) {
//        int a = 0;
//        a++;// a= a+1
//        System.out.println(a);

        int i=0;
        int a = i++;
        System.out.println(a + ", " + i);
        a = ++i;
        System.out.println(a + ", " + i);
        i=i++;
        System.out.println(i);

        int a1 = 10;
        double a2 = 10.0D;
        double c1 = a1+a2;
        int k = (int)a2;
    }
}
