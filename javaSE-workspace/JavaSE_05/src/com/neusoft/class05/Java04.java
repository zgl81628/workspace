package com.neusoft.class05;

import java.util.Random;

public class Java04 {

    public static void main(String[] args) {

        int a = getSale(23333,15000);

    }

    public static int getSale(int base){
        return base;
    }

    public static int getSale(int base,int reward){
        return base+reward;
    }

    public static float getSale(int base ,float kou){
        return base - kou;
    }
}
