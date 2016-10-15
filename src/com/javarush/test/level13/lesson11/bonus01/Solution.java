package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution
{
    public static void main(String[] args)
    {
        try
        {
            // напишите тут ваш код
            BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader fileReader = new BufferedReader(new FileReader(consoleReader.readLine()));
            try
            {
                List<Integer> iList = new ArrayList<Integer>();
                while (true)
                {
                    String fileRow = fileReader.readLine();
                    try
                    {
                        if (Integer.parseInt(fileRow) % 2 == 0)
                        {
                            iList.add(Integer.parseInt(fileRow));
                        }
                    }
                    catch (Exception e)
                    {

                    }
                    if (!fileReader.ready())
                    {
                        break;
                    }
                }
                Integer[] iArray = new Integer[iList.size()];
                for (int i = 0; i < iList.size(); i++)
                {
                    iArray[i] = iList.get(i);
                }
                Arrays.sort(iArray);
                for (Integer num : iArray)
                {
                    System.out.println(num);
                }

            }
            finally
            {
                consoleReader.close();
                fileReader.close();
            }

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());

        }
    }
}
