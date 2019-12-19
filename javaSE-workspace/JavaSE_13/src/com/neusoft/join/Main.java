package com.neusoft.join;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Run01());
        Thread t2 = new Thread(new Run02());
        Thread t3 = new Thread(new Run03());

        t1.start();
        t2.start();
        t2.join();
        t3.start();
    }
}
