package com.javarush.test.level04.lesson04.task10;

/* Три числа
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.
Пример для чисел 1 2 2:
2 2
Пример для чисел 2 2 2:
2 2 2
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
/*        String[] str = reader.readLine().split(" ");
        String result = "";
        if(Integer.parseInt(str[0])==Integer.parseInt(str[1])){
            result+=Integer.parseInt(str[0])+" "+Integer.parseInt(str[1]);
            if(Integer.parseInt(str[0])==Integer.parseInt(str[2]))
            {
            result+=" " + Integer.parseInt(str[2]);
            }
        }else{
            if(Integer.parseInt(str[1])==Integer.parseInt(str[2])){
                result+=Integer.parseInt(str[1])+" "+Integer.parseInt(str[2]);
            }
        }*/
        int num0 = Integer.parseInt(reader.readLine());
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        String result;
        if (num0 == num1 && num0 == num2)
        {
            result = num0 + " " + num1 + " " + num2;
        } else if (num0 == num1)
        {
            result = num0 + " " + num1;
        } else if (num0 == num2)
        {
            result = num0 + " " + num2;
        }else if(num1==num2){
            result = num1 + " " + num2;
        }else{
            result = " ";
        }
        System.out.println(result);
    }
}