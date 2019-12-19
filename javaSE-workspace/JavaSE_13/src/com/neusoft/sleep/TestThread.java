package com.neusoft.sleep;

public class TestThread implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            System.out.println("线程11111继续执行");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
