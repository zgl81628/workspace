package com.neusoft.class08;

public class MyExecption extends Exception {

    private String message;

    public MyExecption() {
    }

    public MyExecption(String message) {
        super(message);
        this.message = message;
    }

}
