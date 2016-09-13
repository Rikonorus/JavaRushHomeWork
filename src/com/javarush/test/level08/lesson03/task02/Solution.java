package com.javarush.test.level08.lesson03.task02;

/* HashMap из 10 пар
Создать коллекцию HashMap<String, String>, занести туда 10 пар строк:
арбуз - ягода, банан - трава, вишня - ягода, груша - фрукт, дыня - овощ, ежевика - куст, жень-шень - корень, земляника - ягода, ирис - цветок, картофель - клубень.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Пример вывода (тут показана только одна строка):
картофель - клубень
*/

import java.util.HashMap;
import java.util.Map;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        Map<String, String> hashMap = new HashMap<>();
        String str = "арбуз - ягода, банан - трава, вишня - ягода, груша - фрукт, дыня - овощ, ежевика - куст, жень-шень - корень, земляника - ягода, ирис - цветок, картофель - клубень";
        String[] sArr = str.split(", ");
        for (String item :
                sArr)
        {
            hashMap.put(item.split(" - ")[0], item.split(" - ")[1]);
        }
        for (Map.Entry<String, String> pair :
                hashMap.entrySet())
        {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }
}