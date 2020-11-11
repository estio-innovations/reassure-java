package com.estio.week3;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;


public class TimeExamples
{
    public static void main(String[] args) {
        LocalTime timeNow = LocalTime.now();
        LocalTime timeAtNine = LocalTime.of(23, 59);

        System.out.println(timeAtNine.plusSeconds(61));

        LocalDate conception = LocalDate.now();
        Period jestation = Period.ofMonths(9);

        System.out.println("Date of conception: "+ conception);
        System.out.println("Expected Date: "+ conception.plus(jestation));

        DateTimeFormatter df = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        DateTimeFormatter df1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        DateTimeFormatter df2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);

        System.out.println(df.format(conception));
        System.out.println(df1.format(conception));
        System.out.println(df2.format(conception));

        DateTimeFormatter df3 = DateTimeFormatter.ofPattern("dd * MMM - yyyy");
        System.out.println(df3.format(conception));


    }
}
