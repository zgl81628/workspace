package com.neusoft.synchronized01;

import java.sql.Time;

public class Timer {

    private static int num = 0;

//    public synchronized void add(String name)
//    {
//        for (int i = 0; i <10 ; i++) {
//            num++;
//            System.out.println("线程"+name+"数据收集:"+num);
//
//        }
//
//    }

    public void add(String name)
    {
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                num++;
                System.out.println("线程" + name + "数据收集:" + num);

            }
        }
    }
}
