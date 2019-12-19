package com.neusoft.thread;

public class MyRunAble implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("继承thread类的线程"+Thread.currentThread().getName());
        }
    }
}
