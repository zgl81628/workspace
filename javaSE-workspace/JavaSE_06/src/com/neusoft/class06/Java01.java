package com.neusoft.class06;

public class Java01 {

    public static void main(String[] args) {

//        Demo demo = new Demo();
//        demo.show();

//        XiYou xiYou = new XiYou("孙悟空","胫骨帮","五星","五星");
//        System.out.println(xiYou);
        Demo demo =null;
        for (int i = 0; i <2 ; i++) {
            demo = new Demo();
        }

        demo.show();

        Demo02 demo02 = new Demo02();
    }
}
