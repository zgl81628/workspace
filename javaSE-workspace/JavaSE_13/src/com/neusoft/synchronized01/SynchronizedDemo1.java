package com.neusoft.synchronized01;

import javafx.scene.input.DataFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SynchronizedDemo1 implements Runnable {

    private static int counter = 1;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Override
    public void run() {
        Date startDate = new Date();
        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println("线程 ：" + Thread.currentThread().getName() + " 当前计数器 ：" + (counter++));
                    System.out.println("开始时间 ：" + startDate + " 当前时间 ：" +sdf.format(startDate));
                    System.out.println();
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        SynchronizedDemo1 syncThread = new SynchronizedDemo1();
        Thread thread1 = new Thread(syncThread, "sync-thread-1");
        Thread thread2 = new Thread(syncThread, "sync-thread-2");
        thread1.start();
        thread2.start();
    }

}
