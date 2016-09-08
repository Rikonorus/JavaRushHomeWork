package com.javarush.test.level07.lesson09.task01;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Три массива
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        List<Integer> mainList = new ArrayList<>();
        List<Integer> mod3 = new ArrayList<>();
        List<Integer> mod2 = new ArrayList<>();
        List<Integer> other = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++)
        {
            int curNum = Integer.parseInt(reader.readLine());
            mainList.add(curNum);
            if (curNum % 3 == 0)
            {
                mod3.add(curNum);
            }

            if (curNum % 2 == 0)
            {
                mod2.add(curNum);
            }
            if (curNum % 3 != 0 && curNum % 2 != 0)
            {
                other.add(curNum);
            }

        }
        printList(mod3);
        printList(mod2);
        printList(other);
        //напишите тут ваш код
    }

    public static void printList(List<Integer> list)
    {
        //напишите тут ваш код
        for (Integer a : list)
        {
            System.out.println(a);
        }
    }
}
