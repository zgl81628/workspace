package com.neusoft.inner;

public class Outer01 {

    public void show(){

    }

    static class Inner{
        public void print(){
            System.out.println("看看非静态成员!!!!!");
        }

        public static void aaa(){
            System.out.println("静态成员");
        }
    }
}
