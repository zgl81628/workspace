package com.neusoft;

public class Iphone implements USB {
    @Override
    public void read() {
        System.out.println("充电");
    }

    @Override
    public void write() {
        System.out.println("充电");
    }
}
