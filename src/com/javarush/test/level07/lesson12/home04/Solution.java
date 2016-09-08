package com.javarush.test.level07.lesson12.home04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Вводить с клавиатуры строки, пока пользователь не введёт строку 'end'
Создать список строк.
Ввести строки с клавиатуры и добавить их в список.
Вводить с клавиатуры строки, пока пользователь не введёт строку "end".  "end" не учитывать.
Вывести строки на экран, каждую с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String frow = reader.readLine();
        List<String> list = new ArrayList<>();
        while (!frow.equals("end"))
        {
            list.add(frow);
            frow = reader.readLine();
        }
        for (String listItem :
                list)
        {
            System.out.println(listItem);
        }
        //напишите тут ваш код
    }
}
