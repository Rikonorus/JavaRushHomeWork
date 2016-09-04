package com.javarush.test.level04.lesson04.task06;

/* День недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название «понедельник», «вторник», «среда»
, «четверг», «пятница», «суббота», «воскресенье»,
если введен номер больше или меньше 7 – вывести «такого дня недели не существует».
Пример для номера 5:
пятница
Пример для номера 10:
такого дня недели не существует
*/

import java.io.*;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        ArrayList<String> weak = new ArrayList<>();
        weak.add("понедельник");
        weak.add("вторник");
        weak.add("среда");
        weak.add("четверг");
        weak.add("пятница");
        weak.add("суббота");
        weak.add("воскресенье");
        int number = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        if (number >= 1 && number <= 7)
        {
            System.out.println(weak.get(number-1));
        } else
        {
            System.out.println("такого дня недели не существует");
        }
    }


}

