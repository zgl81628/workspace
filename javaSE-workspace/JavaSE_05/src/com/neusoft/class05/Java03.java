package com.neusoft.class05;

public class Java03 {

    public static void main(String[] args) {

        int a = 10;
        System.out.println("int值类型调用之前的值:  "+a);
        getX(a);
        System.out.println("int值类型调用之后的值:  "+a);

        int[] b = {10};
        System.out.println("int[]引用类型调用之前的值:  "+b[0]);
        getY(b);
        System.out.println("int[]引用类型调用之后的值:  "+b[0]);

    }
    //10
    public static void getX(int a)
    {
        a *= 10;
    }

    //b[0] 地址
    public static void getY(int[] a)
    {
        a[0]*=10;
    }
}
