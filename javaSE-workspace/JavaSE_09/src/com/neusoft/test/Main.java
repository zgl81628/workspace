package com.neusoft.test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入阿拉伯数字:");
//        String str = sc.next();
//        String string = MoneyUtils.PositiveIntegerToHanStr(str);
        double d = sc.nextDouble();
        String string = MoneyUtils.NumToRMBStr(d);
        System.out.println(string);
    }
}
