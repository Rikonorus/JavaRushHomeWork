package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int delimiter = Math.min(a, b);
        while (true)
        {
            if (delimiter <= 1)
            {
                break;
            }
            if (a % delimiter == 0 && b % delimiter == 0)
            {
                break;
            }
            delimiter--;
        }
        System.out.println(delimiter);
    }
}
