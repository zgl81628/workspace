package com.neusoft;

public class MP3 implements USB {
    @Override
    public void read() {
        System.out.println("听音乐");
    }

    @Override
    public void write() {
        System.out.println("拷贝音乐");
    }
}
