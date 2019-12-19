package com.neusoft.optional;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        Optional<String> optional = Optional.ofNullable(null);
        System.out.println(optional.isPresent());

        System.out.println(optional.orElseGet(()->"你还好麻烦!!!"));
        System.out.println(optional.map(s->"发的广东省").orElse("水电费水电费"));
    }
}
