package com.estio.week3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class FabDates
{
    public static void main(String[] args)
    {
        LocalDate today = LocalDate.now();
        LocalTime timeNow = LocalTime.now();
        LocalDateTime rightNow = LocalDateTime.now();

        System.out.println(today);
        System.out.println(timeNow);
        System.out.println(rightNow);

        LocalDate wedsDate = LocalDate.of(2020, Month.MAY, 11);
        System.out.println(wedsDate.getDayOfYear());
        // print of todays date
        // Date we were born
        // the day of the week we were born
        // and the day of the year

    }
}
