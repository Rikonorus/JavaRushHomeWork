package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static HashSet<Integer> createSet()
    {
        HashSet<Integer> iHashSet = new HashSet<>();
        for (int i = 0; i < 20; i++)
        {
            iHashSet.add(i);
        }
        return iHashSet;
        //напишите тут ваш код

    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        //напишите тут ваш код
/*        for (Integer hsetItem : set)
        {
            if (hsetItem > 10)
            {
                System.out.println("removing" + hsetItem);
                set.remove(hsetItem);
            }
        } //ConcurentModificationException*/
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext())
        {
            int i = iterator.next();
            if (i > 10)
            {
                System.out.println("removing" + iterator);
                iterator.remove();
            }
        }
        return set;
    }

}
