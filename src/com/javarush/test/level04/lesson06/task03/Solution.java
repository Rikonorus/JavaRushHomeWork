package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int biggest = max(max(a, b), c);
        int medium;
        if (biggest == a)
        {
            medium = max(b, c);
        } else if (biggest == b)
        {
            medium = max(a, c);
        } else
        {
            medium = max(a, b);
        }
        int smaller;
        if (c != biggest && c != medium)
        {
            smaller = c;
        } else if (b != biggest && b != medium)
        {
            smaller = b;
        } else
        {
            smaller = a;
        }
        System.out.println(biggest);
        System.out.println(medium);
        System.out.println(smaller);
    }



    public static int max(int a, int b)
    {
        return a > b ? a : b;
    }
}
