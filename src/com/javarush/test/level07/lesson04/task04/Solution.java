package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] iArr = new int[10];
        for (int i = 0; i < 10; i++)
        {
            iArr[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i <5; i++)
        {
            int swap = iArr[i];
            iArr[i] = iArr[9-i];
            iArr[9-i] = swap;
        }
        for (int i = 0; i < 10; i++)
        {
            System.out.println(iArr[i]);
        }
    }
}
