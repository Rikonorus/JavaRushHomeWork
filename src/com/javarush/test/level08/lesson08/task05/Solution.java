package com.javarush.test.level08.lesson08.task05;

import sun.font.CreatedFontTracker;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> newMap = new HashMap<>();
        for (int i = 0; i < 10; i++)
        {
            newMap.put(Integer.toString(i), Integer.toString(new Random().nextInt(i + 1)));
        }
        return newMap;
    }

    /*
        public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
        {
            //напишите тут ваш код
            HashMap<String, String> copy1 = new HashMap<>(map);
            HashMap<String, String> copy2 = new HashMap<>(map);
            for (Map.Entry<String, String> pair1 : copy1.entrySet())
            {
                for (Map.Entry<String, String> pair2 : copy2.entrySet())
                {
                    if (pair2.getValue().equals(pair1.getValue()))
                    {
                        removeItemFromMapByValue(map, pair1.getValue());
                        map.put(pair1.getKey(), pair1.getValue());
                    }
                }
            }

        }*/ //сука, я не правильно понял задание, я все пытался оставить одного с именем
    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (String value : copy.values())
            if (Collections.frequency(copy.values(), value) > 1)
                removeItemFromMapByValue(map, value);
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
    public static void main(String[] args)
    {
        HashMap<String, String> newHashMap1 = createMap();
        for (Map.Entry<String, String> mapItem : newHashMap1.entrySet())
        {
            System.out.println(mapItem);
        }
        System.out.println("=====================");
        removeTheFirstNameDuplicates(newHashMap1);
        for (Map.Entry<String, String> mapItem : newHashMap1.entrySet())
        {
            System.out.println(mapItem);
        }
    }
}
