package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());
        int min = Math.min(Math.min(num1, num2), num3);
        int max = Math.max(Math.max(num1, num2), num3);
        if (num1 != min && num1 != max)
        {
            System.out.println(num1);
        }
        if (num2 != min && num2 != max)
        {
            System.out.println(num2);
        }
        if (num3 != min && num3 != max)
        {
            System.out.println(num3);
        }
    }
}
