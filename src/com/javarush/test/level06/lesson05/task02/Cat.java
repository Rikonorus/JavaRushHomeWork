package com.javarush.test.level06.lesson05.task02;

/* Классы Cat и Dog и метод finalize для каждого
В каждом классе Cat и Dog написать метод finalize, который выводит на экран текст о том, что такой-то объект уничтожен.
*/

public class Cat
{
    //напишите тут ваш код
    protected void finalize() throws Throwable
    {
        System.out.println("Object Cat has been destroyed");

    }
}

class Dog
{
    //напишите тут ваш код
    protected void finalize() throws Throwable
    {
        System.out.println("Object Dog has been destroyed");

    }
}