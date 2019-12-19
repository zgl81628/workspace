package com.neusoft.test;

public class Plays  {

    private static int num = 1;

    private Plays(){
        num++;
    }

    public static Plays getPlays(){

        if(num<=11)
        {
            System.out.println("创建一个对象"+num);
            return new Plays();
        }else
        {
            System.out.println("不能创建对象!!!");
            return null;
        }

    }
}
