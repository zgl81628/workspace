package com.neusoft.class09;

public class Main01 {

    public static void main(String[] args) {
        Product p = new Product("辣条",4);
        Product p1 = new Product("辣条",4);

        //String str = p==p1?"相等":"不相等";
        String str = p.equals(p1)?"相等":"不相等";
        System.out.println(str);
    }
}
