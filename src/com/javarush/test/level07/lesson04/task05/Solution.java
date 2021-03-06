package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] iArr1 = new int[20], iArr2 = new int[10], iArr3 = new int[10];
        for (int i = 0; i < 20; i++)
        {
            iArr1[i] = Integer.parseInt(reader.readLine());
            iArr2[i % 10] = iArr1[i % 10];
            iArr3[i % 10] = iArr1[10 + i % 10];
        }
        for (int arrCell : iArr3)
        {
            System.out.println(arrCell);
        }
    }
}
