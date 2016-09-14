package com.javarush.test.level09.lesson11.home05;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Гласные и согласные буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.

Пример ввода:
Мама мыла раму.
Пример вывода:
а а ы а а у
М м м л р м .
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        final String innerStr = reader.readLine();
        ArrayList<Character> Arrvowels = new ArrayList<>();
        ArrayList<Character> ArrNotvowels = new ArrayList<>();
        for (Character ch : innerStr.toCharArray())
        {
            if (isVowel(ch))
            {
                Arrvowels.add(ch);
            }else{
                ArrNotvowels.add(ch);
            }
        }
        System.out.println(Join(Arrvowels, " "));
        System.out.println(Join(ArrNotvowels, " "));

    }


    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    //метод проверяет, гласная ли буква

    public static boolean isVowel(char c)
    {
        c = Character.toLowerCase(c);  //приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   //ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }

    public static StringBuffer Join(ArrayList<Character> list,String delimiter){
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < list.size(); i++)
        {
           result.append(list.get(i)+ delimiter);
        }
        return result;
    }
}
