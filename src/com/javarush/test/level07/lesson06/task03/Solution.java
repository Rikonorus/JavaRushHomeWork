package com.javarush.test.level07.lesson06.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая короткая строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> Arr1 = new ArrayList<String>();
        int[] Arr2 = new int[5];
        Arr1.add(reader.readLine());
        int min = Arr1.get(0).length();
        Arr2[0] = min;
        for (int i = 1; i < 5; i++)
        {
            Arr1.add(reader.readLine());
            int currLength = Arr1.get(i).length();
            if (min> currLength)
            {
                min = currLength;
            }
            Arr2[i] = currLength;
        }
        for (int i = 0; i < Arr2.length; i++)
        {
            if (Arr2[i] == min)
            {
                System.out.println(Arr1.get(i));
            }
        }


    }
}
