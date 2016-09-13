package com.javarush.test.level09.lesson11.home01;

/* Деление на ноль
Создай метод public static void divisionByZero, в котором подели любое число на ноль и выведи на экран результат деления.
Оберни вызов метода divisionByZero в try..catch. Выведи стек-трейс исключения используя метод exception.printStackTrace()
*/

public class Solution
{

    public static void main(String[] args)
    {
        try
        {
            divisionByZero();
        }
        catch (Throwable e)
        {
            //for (StackTraceElement st : e.getStackTrace()) System.out.println(st);
            e.printStackTrace();
        }
    }

    public static void divisionByZero()
    {
        System.out.println(42 / 0);
    }
}
