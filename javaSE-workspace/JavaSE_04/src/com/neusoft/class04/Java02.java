package com.neusoft.class04;

import java.util.Random;

public class Java02 {

    public static void main(String[] args) {

        int[] a = new int[5];
        for (int i = 0; i <a.length ; i++) {
            a[i] = new Random().nextInt(10);
        }

        for (int i:a) {
            System.out.println(i);
        }


    }
}
