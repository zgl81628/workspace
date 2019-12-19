package com.neusoft.static01;

public class Factory {

    private static Factory factory = new Factory();

    private Factory(){

    }

    public static Factory getFactory(){
        return factory;
    }
}
