package com.neusoft.thread;

public class Java8Thread {

    public static void main(String[] args) {

        Thread t = new Thread(
                ()-> System.out.println("线程的名字:"+Thread.currentThread().getName())
        );
        t.start();
    }
}
