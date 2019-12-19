package com.neusoft.yeild;

public class Run01 implements  Runnable {

    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            System.out.println("继承thread类的线程11111111111");
            Thread.yield();
        }
    }
}
