package com.neusoft.class06;

public class Emplyoee {

    //构造器 初始化对象
    public Emplyoee(){

    }

    String name;
    int age;
    double salary;

    public String showName(){
        System.out.println(name);
        return name;
    }
    public int showAge(){
        System.out.println(age);
        return age;
    }
    public void updateName(String name2){
        name = name2;
    }
    public void getSalary(){
        System.out.println("The salary of this month is 2000");
    }

}
