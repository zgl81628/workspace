package com.neusoft.lambda;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        final String str = "aaaa";

       Arrays.asList(1,2,3).forEach((e)-> {
           System.out.println(e);
           System.out.println(e);
           System.out.println(e);
           System.out.println(str);
//           str = "sdfsdfsdf";
       });

       //Arrays.asList("11","2","33").sort((a,b)-> a.compareTo(b) );
        Arrays.asList("11","2","33").sort((a,b)-> {
            System.out.println(a);
            a.compareTo(b);
            return 10;
        });
    }
}
