package com.javarush.test.level09.lesson08.task05;

/* Перехват unchecked исключений
В методе processExceptions обработайте все unchecked исключения.
Нужно вывести стек-трейс каждого возникшего исключения используя метод printStack.
Можно использовать только один блок try..
*/

public class Solution
{
    public static void main(String[] args)
    {
        processExceptions(new Solution());
    }

    public static void processExceptions(Solution obj)
    {
        try
        {
            obj.method1();
            obj.method2();
            obj.method3();
        }
        catch (NullPointerException e)
        {
            Solution.printStack(e);
        }
        catch (IndexOutOfBoundsException e)
        {
            Solution.printStack(e);
        }
        catch (NumberFormatException e)
        {
            Solution.printStack(e);
        }
    }

    public static void printStack(Throwable throwable)
    {
        System.out.println(throwable);
        for (StackTraceElement element : throwable.getStackTrace())
        {
            System.out.println(element);
        }
    }

    public void method1()
    {
        throw new NullPointerException(); //unchecked
    }

    public void method2()
    {
        throw new IndexOutOfBoundsException(); //unchecked
    }

    public void method3()
    {
        throw new NumberFormatException();//unchecked
    }
}
