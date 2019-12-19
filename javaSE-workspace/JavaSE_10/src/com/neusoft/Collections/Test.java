package com.neusoft.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(12);
        list.add(121);
        list.add(1521);
        list.add(331);
        list.add(134);
        //list.add("34534534");
        Object aaa =  Collections.max(list);
        System.out.println(aaa);


        Collections.reverse(list);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Object object = Collections.binarySearch(list,444);
        System.out.println(object);
    }
}
