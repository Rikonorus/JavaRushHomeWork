package com.javarush.test.level08.lesson11.home09;

import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(isDateOdd("JANUARY 1 2000"));
        System.out.println(isDateOdd("JANUARY 2 2020"));
    }

    public static boolean isDateOdd(String date)
    {
        Date curDate = new Date(date);
        Date begYear = new Date(date);
        begYear.setDate(0);
        begYear.setMonth(0);
        long daysCount = (curDate.getTime() - begYear.getTime()) / (24 * 60 * 60 * 1000);
        return daysCount % 2 != 0;
    }
}
