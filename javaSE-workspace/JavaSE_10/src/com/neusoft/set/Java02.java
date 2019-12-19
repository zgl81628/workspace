package com.neusoft.set;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Java02 {
    public static void main(String[] args) {

        Random r = new Random();
        Set c = new HashSet();
        for (;;)
        {
           c.add(r.nextInt(24)+1);
           if(c.size()==7)
               break;
        }

        for (Object o:c) {
            System.out.println(o);
        }
    }
}
