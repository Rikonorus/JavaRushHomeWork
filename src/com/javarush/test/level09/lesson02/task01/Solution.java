package com.javarush.test.level09.lesson02.task01;

/* Каждый метод должен возвращать свой StackTrace
Написать пять методов, которые вызывают друг друга. Каждый метод должен возвращать свой StackTrace.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        method1();
        for (StackTraceElement st : method1()) System.out.println(st);
        System.out.println("                                        ");
        for (StackTraceElement st : method2()) System.out.println(st);
        System.out.println("                                        ");
        for (StackTraceElement st : method3()) System.out.println(st);
        System.out.println("                                        ");
        for (StackTraceElement st : method4()) System.out.println(st);
        System.out.println("                                        ");
        for (StackTraceElement st : method5()) System.out.println(st);
    }

    public static StackTraceElement[] method1()
    {
        method2();
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return stackTraceElements;

    }

    public static StackTraceElement[] method2()
    {
        method3();
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return stackTraceElements;

    }

    public static StackTraceElement[] method3()
    {
        method4();
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return stackTraceElements;

    }

    public static StackTraceElement[] method4()
    {
        method5();
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return stackTraceElements;

    }

    public static StackTraceElement[] method5()
    {
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return stackTraceElements;
    }
}
