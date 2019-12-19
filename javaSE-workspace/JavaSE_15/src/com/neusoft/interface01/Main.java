package com.neusoft.interface01;

public class Main {

    public static void main(String[] args) {

        //匿名内部类
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("接口");
            }
        }).start();

        new Thread(()-> System.out.println("lamdba表达式")).start();

        Factory fc = new Factory();
        fc.Print(new USB() {
            @Override
            public void listen(int a) {

            }
        });

        fc.Print((a -> System.out.println(a)));
    }
}
