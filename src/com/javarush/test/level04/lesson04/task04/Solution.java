package com.javarush.test.level04.lesson04.task04;

/* Время года
Реализовать метод checkSeason. По номеру месяца, метод должен определить время года (зима, весна, лето, осень) и вывести на экран.
Пример для номера месяца 2:
зима
Пример для номера месяца 5:
весна
*/

public class Solution
{
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int mounth){
        //::CODE:
        if(checkInterval(mounth, 1,2) || mounth == 12){
            System.out.println("зима");
        }else if(checkInterval(mounth, 3,5)){
            System.out.println("весна");
        }else if(checkInterval(mounth, 6,8)){
            System.out.println("лето");
        }else{
            System.out.println("осень");
        }

    }
    public static boolean checkInterval(int number, int lb, int rb){
        if(number>=lb && number <= rb){
            return true;
        }else{
            return false;
        }
    }
}