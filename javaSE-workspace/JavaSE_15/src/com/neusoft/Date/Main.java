package com.neusoft.Date;

import java.time.Clock;
import java.time.LocalDate;


public class Main {

    public static void main(String[] args) {
//        LocalDate localDate = LocalDate.now();
//        LocalTime localTime = LocalTime.now();
//        System.out.println(localDate);
//        System.out.println(localTime);

        LocalDate localDate = LocalDate.of(2015,3,25);
        System.out.println(localDate);

        LocalDate localDate01 = LocalDate.parse("2029-11-03");
        System.out.println(localDate01);

        LocalDate localDate2 = localDate01.plusMonths(5);
        System.out.println(localDate2);


        Clock clock = Clock.systemUTC();
        System.out.println(clock.instant());
        System.out.println(clock.millis());
    }
}
