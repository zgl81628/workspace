package com.neusoft.synchronized01;

public class Test implements Runnable{

    Timer timer = new Timer();

    @Override
    public void run() {
        timer.add(Thread.currentThread().getName());
    }
}
