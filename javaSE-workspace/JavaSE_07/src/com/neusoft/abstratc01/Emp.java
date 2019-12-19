package com.neusoft.abstratc01;

public abstract class Emp {

    static{
        System.out.println("静态台代码块");
    }

    public Emp(){
        System.out.println("抽象类构造器");
    }

    public abstract void show();  //定义规则
    public abstract void show01();
    public abstract void show02();
    public abstract void show03();
    public abstract void show04();

    public void pint(){

    }
}
