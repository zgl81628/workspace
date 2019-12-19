package com.neusoft.Annaction;


import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
 @interface Hints {
    Hint[] value();
}

@Repeatable(Hints.class)
@interface Hint {

    String value();
    String age() ;
}