package com.javarush.task.task08.task0827;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) throws ParseException {
        Date currentDate = new Date(date);
        Date startDate = new Date(date);
        startDate.setDate(1);
        startDate.setMonth(0);
        long time = currentDate.getTime() - startDate.getTime();
        long days = time / 24 / 60 / 60000 + 1;
        return days % 2 == 1;
    }
}
