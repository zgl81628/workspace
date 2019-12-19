package com.neusoft.static01;

public class Demo {

    static{
        System.out.println("静态代码块");
    }

    public Demo(){
        System.out.println("构造器执行");
    }
    static int a = 0;
    public void show(){

        System.out.println("成员方法执行");
    }
}
