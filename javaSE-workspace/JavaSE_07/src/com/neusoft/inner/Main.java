package com.neusoft.inner;

import static javafx.scene.input.KeyCode.O;

public class Main {

    public static void main(String[] args) {

//        Outer.Inner inner = new Outer().new Inner();
//        inner.show();

//        Outer01.Inner inner1 = new Outer01.Inner();
//        inner1.print();
//        Outer01.Inner.aaa();

//         Outer02 outer02 = new Outer02();
//         outer02.myFun();

//        Outer03 outer03 = new Outer03();
//        outer03.print(new Inner01() {
//            @Override
//            public void show() {
//                System.out.println("撒的发生水电费水电费水电费");
//            }
//        });

        //函数接口
//        Outer03 outer03 = new Outer03();
//        outer03.print(()->{
//            System.out.println("第三方的方式");
//        });

//        Inner02 inner02 = param -> param + "world!";
//        System.out.println(inner02.show("hello"));



        Inner03 inner021 = (string -> {
            System.out.println(string);
        });
        inner021.show("你好!!!!!");
    }

}
