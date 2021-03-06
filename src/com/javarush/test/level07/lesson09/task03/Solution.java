package com.javarush.test.level07.lesson09.task03;

import javax.xml.bind.SchemaOutputResolver;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* Слово «именно»
1. Создай список из слов «мама», «мыла», «раму».
2. После каждого слова вставь в список строку, содержащую слово «именно».
3. Используя цикл for вывести результат на экран, каждый элемент списка с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        List<String> list = new ArrayList<>();
        list.add("мама");
        list.add("мыла");
        list.add("раму");
        for (int i = 0; i < list.size(); i += 2)
        {
            list.add(i + 1, "именно");
        }
        for (String listItem :
                list)
        {
            System.out.println(listItem);
        }
    }
}
