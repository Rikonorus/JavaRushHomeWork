package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;
import java.util.Random;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        //напишите тут ваш код
        ArrayList<String> arr1 = new ArrayList<String>();
        ArrayList<String> arr2 = new ArrayList<String>();
        for (int i = 0; i < 10; i++)
        {
            arr1.add(Integer.toString(new Random().nextInt()));
            arr2.add(Integer.toString(new Random().nextInt()));
        }
        ArrayList<String>[] resArr = new ArrayList[2];
        resArr[0] = arr1;
        resArr[1] = arr2;

        return resArr;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list : arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}