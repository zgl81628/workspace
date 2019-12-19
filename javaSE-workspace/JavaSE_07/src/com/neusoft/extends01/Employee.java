package com.neusoft.extends01;

public class Employee {

    String nane;
    String birth;
    double salary;

    public Employee(){

    }

    public Employee(String name){
        System.out.println("2父类构造器");
    }

    void getDetail(){

        System.out.println("员工信息");
    }

    void getSalary(){
        System.out.println("发工资了!!!!!!");
    }
}
