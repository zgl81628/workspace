package com.neusoft.synchronized01;

public class Main {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Test());
        Thread t2 = new Thread(new Test());

        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
    }
}
