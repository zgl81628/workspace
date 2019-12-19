package com.neusoft.funref;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        //System.out.println(Class::new);
        functionref fun = new functionref();
        Supplier s = ()->fun.getTest();
        Supplier supplier1 = fun::getTest;
        //Supplier kk = fun::fun02;

        Function<String,functionref> fun01 = functionref::new;
        BiFunction<String,Integer,functionref> fun02 = functionref::new;

        Arrays.asList(1,2,3,45).forEach(System.out::println);

    }
}
