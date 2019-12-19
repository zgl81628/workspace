package com.neusoft.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TrestMap {

    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("sdfsdf",1);
        map.put("asd",1);
        map.put("ffg",1);
        map.put("ghg",1);
        map.put(null,1);
        map.put("sdf",2);

        System.out.println(map);

        System.out.println(map.containsKey(null));

        Set keys =map.keySet();
        for (Object o:keys) {
            Object v = map.get(o);
            System.out.println("key: "+o+"****value: "+v);
        }

        for (Map.Entry ss:map.entrySet()) {
            //Map.Entry aa = (Map.Entry)ss;
            System.out.println(ss.getKey()+"*********"+ss.getValue());
        }

    }
}
