package com.neusoft.join;

public class Run02 implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i <5 ; i++) {
            System.out.println("继承thread类的线程2222222222222222");
        }
    }
}
