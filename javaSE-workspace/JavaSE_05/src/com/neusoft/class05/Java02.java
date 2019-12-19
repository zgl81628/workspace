package com.neusoft.class05;

public class Java02 {

    public static void main(String[] args) {

        paly(3,2,"sss");
        int c = getNumber(2,3);
        //getNumber(33,67);
    }

    public static void paly(int a , int b,String str)
    {
        int c = a + b;
        System.out.println(c);
    }


    public static int getNumber(int a, int b)
    {
        return a + b;
    }
}
