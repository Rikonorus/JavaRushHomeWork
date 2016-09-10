package com.javarush.test.level08.lesson08.task03;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> newMap = new HashMap<>();
        for (int i = 0; i < 10; i++)
        {
            String name = Integer.toString(i);
            String lastName = Integer.toString(i);

            newMap.put(name, lastName);
        }
        return newMap;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //напишите тут ваш код
        int count = 0;
        for (String mapItem : map.values())
        {
            if (mapItem.equals(name))
            {
                count++;
            }
        }
        return count;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        //напишите тут ваш код
        int count = 0;
        for (String mapItem : map.keySet())
        {
            if (mapItem.equals(lastName))
            {
                count++;
            }
        }
        return count;

    }

}
