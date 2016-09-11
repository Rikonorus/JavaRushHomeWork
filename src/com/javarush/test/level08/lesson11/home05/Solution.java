package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.channels.Pipe;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = reader.readLine().split(" ");
        String[] snew = new String[s.length];
        for (int i = 0; i < s.length; i++)
        {
            snew[i] = s[i].length() > 0 ? s[i].length() > 1 ? s[i].substring(0, 1).toUpperCase() + s[i].substring(1) : s[i].substring(0, 1) : "";
        }
        StringBuffer resulr = new StringBuffer();
        for (int i = 0; i < snew.length; i++)
        {
            resulr.append(snew[i] + " ");
        }

        System.out.println(resulr.toString().replaceAll(" $",""));
    }


}
