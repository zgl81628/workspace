package com.neusoft.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test03 {

    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);

        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        System.out.println(year);
        System.out.println(month);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd E a HH:mm:ss SSS");
        String str = sdf.format(date);
        System.out.println(str);

    }
}
