package com.javarush.test.level09.lesson11.home07;

/* Расставь модификаторы static
Расставь модификаторы static так, чтобы пример скомпилировался.
*/

public class Solution
{
    public static int A = 5;
    public static int B = 2 * A;
    public int C = A * B;
    public static int D = A * B;

    public static void main(String[] args)
    {
        Solution room = new Solution();
        room.A = 5;
        Solution room2 = new Solution();
        room2.A = 6;

        Solution.D = 5;
        System.out.println(room.A);
        System.out.println(room2.A);
        System.out.println(Solution.A);
    }

    public int getA()
    {
        return A;
    }

}
