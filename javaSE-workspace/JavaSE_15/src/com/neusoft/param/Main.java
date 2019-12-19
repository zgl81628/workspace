package com.neusoft.param;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException {
        Method method = Main.class.getMethod("main", String[].class);
        for (final Parameter paramater:method.getParameters()) {
            System.out.println(paramater.getName());
        }

        for (String str:args) {
            System.out.println(str);
        }
    }

}
