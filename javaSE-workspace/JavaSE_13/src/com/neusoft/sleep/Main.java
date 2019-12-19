package com.neusoft.sleep;

public class Main {

    public static void main(String[] args) {
        Thread t = new Thread(new TestThread());
        Thread t1 = new Thread(new TestThread01());

        t.setPriority(7);
        t1.setPriority(10);


        t.start();
        t1.start();

//        if(t.isAlive())
//            System.out.println("活着");
//        else
//            System.out.println("死翘翘");
    }
}
