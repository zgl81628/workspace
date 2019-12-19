package com.neusoft.extends01;

public class Worker extends Employee {

    static{
        System.out.println("1静态代码块!!!");
    }

    public Worker(){
        //super(); 编译器默认加入super()
        System.out.println("3子类构造器");
    }
    public Worker(String name){
        //this();
        super("name");
    }
     void drassAll(){
        System.out.println("什么鬼!!!!");
    }
}
