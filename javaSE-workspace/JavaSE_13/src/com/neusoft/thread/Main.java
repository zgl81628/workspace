package com.neusoft.thread;

public class Main {

    public static void main(String[] args) {
        Thread t = new MyThread();
        t.start();


        Thread t1 = new Thread(new MyRunAble());
        t1.start();

       String tnamer = Thread.currentThread().getName();
       System.out.println(tnamer);
    }
}
