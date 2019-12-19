package com.neusoft.class05;

public class Java01 {

    public static void main(String[] args) {
        aaa();
    }

    public static int aaa(){
        System.out.println("无参数!!!");

        return 1;
    }


    public static void ccc(int a, int b,int c){
        int z = a + b + c;
        System.out.println("有参数参数!!!");
    }

    public static void bbb(){
        System.out.println("无返回值");
    }

    public static int ddd(int a)
    {
//        if(a>0)
//        {
//            return 12;
//        }else
//        {
//            return 11;
//        }
        return 0;
    }

}
