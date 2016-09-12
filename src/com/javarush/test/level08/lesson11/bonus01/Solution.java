package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        //напишите тут ваш код
/*     3   BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map =  new HashMap<String, Integer>();
        map.put("January", 1);
        map.put("February", 2);
        map.put("March", 3);
        map.put("April", 4);
        map.put("May", 5);
        map.put("June", 6);
        map.put("July", 7);
        map.put("August", 8);
        map.put("September", 9);
        map.put("October", 10);
        map.put("November", 11);
        map.put("December", 12);
        String month = reader.readLine();
        System.out.println(month + " is " + map.get(month) + " month");*/
/*     2   HashMap<String,String> newHashMap1 = new HashMap<>();
        newHashMap1.put("January", "January is 1 month");
        newHashMap1.put("February", "February is 2 month");
        newHashMap1.put("March", "March is 3 month");
        newHashMap1.put("April", "April is 4 month");
        newHashMap1.put("May", "May is 5 month");
        newHashMap1.put("June", "June is 6 month");
        newHashMap1.put("July", "July is 7 month");
        newHashMap1.put("August", "August is 8 month");
        newHashMap1.put("September", "September is 9 month");
        newHashMap1.put("October", "October is 10 month");
        newHashMap1.put("November", "November is 11 month");
        newHashMap1.put("December", "December is 12 month");
        String inputMonth = reader.readLine();
        System.out.println(newHashMap1.get(inputMonth));*/
        /* 1 Date asd = new Date(inputMonth + " 1" + " 2000");
        System.out.println(inputMonth + " is " + (asd.getMonth()+1) + " month");*/
        /* 4 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();
        Date resultDate = new Date(month + " 1 1");
        System.out.println(month + " is " + (resultDate.getMonth()+1) + " month");*/
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();
        for (int i = 1; i <= 12; i++)
            if (months[i - 1].equalsIgnoreCase(month)) System.out.println(months[i - 1] + " is " + i + " month");
    }

}
