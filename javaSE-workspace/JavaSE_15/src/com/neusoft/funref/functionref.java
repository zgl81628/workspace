package com.neusoft.funref;

public class functionref {

    private String test;

    public functionref(){

    }

    public functionref(String name){

        System.out.println("构造器");
    }

    public functionref(String name,int age){

        System.out.println("构造器");
    }



    @SuppressWarnings("asdasd")
    public void fun02(){
        System.out.println("实例方法");
    }

    public static void fun01(){
        System.out.println("静态方法!!!");
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
}
