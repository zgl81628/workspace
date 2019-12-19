package com.neusoft;

public class Main {

    public static void main(String[] args) {
        MP3 mp3 = new MP3();
        Iphone iphone = new Iphone();
        Person p = new Person();

        p.listen(mp3);
        p.listen(iphone);
    }
}
