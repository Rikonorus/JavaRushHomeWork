package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(min(reader.readLine(),reader.readLine()));

    }
    public static String min(String a, String b)
    {
    int a1 = Integer.parseInt(a);
    int b1 = Integer.parseInt(b);
    if(a1>b1){
        return b;
    }else{
        return a;
    }
    }
}