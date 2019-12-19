package com.neusoft.class06;

public class Demo02 {

    int age;
    int sex;
    public Demo02() {

    }

    public Demo02(int age) {
        this.age = age;
        System.out.println("构造1");
    }

    public Demo02(int age, int sex) {
        this(age);
        this.sex = sex;
        System.out.println("构造2");
    }


    public void demo02(){
      String str = null;
    }
}
