package com.neusoft.class08;

import java.io.IOException;

public class Main02 {

    public static void main(String[] args) throws NullPointerException{
        Java02 java02 = new Java02();

        try {
            java02.runLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        java02.runLine01();
    }
}
