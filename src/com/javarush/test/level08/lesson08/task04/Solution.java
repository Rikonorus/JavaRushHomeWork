package com.javarush.test.level08.lesson08.task04;

import java.util.*;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();

        for (int i = 0; i < 10; i++)
        {
            Date date = new Date();
            date.setDate(new Random().nextInt(27));
            date.setMonth(new Random().nextInt(11));
            date.setYear(new Random().nextInt());
            map.put(Integer.toHexString(i) + Integer.toBinaryString(i) + Integer.toOctalString(i), date);
        }
        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //напишите тут ваш код

        List<String> needToRemove = new ArrayList<>();
        for (Map.Entry<String, Date> mapValue : map.entrySet())
        {
            if (mapValue.getValue().getMonth() > 4 && mapValue.getValue().getMonth() < 8)
            {
                needToRemove.add(mapValue.getKey());
            }
        }
        for (String str : needToRemove)
        {
            map.remove(str);
        }

    }
/*    public static void main(String[] args)
    {
        HashMap<String, Date> newMap = new HashMap<>();
        newMap = createMap();
        for (Map.Entry<String, Date> pair : newMap.entrySet())
        {
            System.out.println(pair.getKey() + " - " + pair.getValue().getDate() + " " + pair.getValue().getMonth() + " " + pair.getValue().getTime());
        }
        removeAllSummerPeople(newMap);
        System.out.println("                          ");
        for (Map.Entry<String, Date> pair : newMap.entrySet())
        {
            System.out.println(pair.getKey() + " - " + pair.getValue().getDate() + " " + pair.getValue().getMonth() + " " + pair.getValue().getTime());
        }

    }*/
}
