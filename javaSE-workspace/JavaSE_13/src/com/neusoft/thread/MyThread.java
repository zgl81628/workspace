package com.neusoft.thread;

public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("继承thread类的线程"+this.getName());
        }
    }
}
