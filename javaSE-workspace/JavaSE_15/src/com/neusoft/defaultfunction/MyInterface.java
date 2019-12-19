package com.neusoft.defaultfunction;

public interface MyInterface {

    default  void show(){
        System.out.println("嗷嗷所大所多");
    }

    static void print(){
        System.out.println("对方水电费水电费");
    }
}
