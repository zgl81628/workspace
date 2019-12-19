package com.neusoft.interface01;

public interface USB extends USB01,USB02  {

    public static final String STR="asda";

    void show();

    default void print(){
        System.out.println("水电费水电费");
    }
}
