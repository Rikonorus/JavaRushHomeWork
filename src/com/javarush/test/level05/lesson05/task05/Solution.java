package com.javarush.test.level05.lesson05.task05;

/* Провести три боя  попарно между котами
Создать три кота используя класс Cat.
Провести три боя попарно между котами.
Класс Cat создавать не надо. Для боя использовать метод boolean fight(Cat anotherCat).
Результат каждого боя вывести на экран.
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Cat cat1 = new Cat("cat1",10,10,110);
        Cat cat2 = new Cat("cat2",10,110,10);
        Cat cat3 = new Cat("cat3",15,10,230);
        System.out.println(cat1.fight(cat2));
        System.out.println(cat1.fight(cat3));
        System.out.println(cat2.fight(cat3));

    }

    public static class Cat {

        private static int count = 0;
        private static int fightCount = 0;

        private String name;
        private int age;
        private int weight;
        private int strength;

        private Cat(String name, int age, int weight, int strength) {
            count++;

            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            fightCount++;

            int agePlus = this.age > anotherCat.age ? 1 : 0;
            int weightPlus = this.weight > anotherCat.weight ? 1 : 0;
            int strengthPlus = this.strength > anotherCat.strength ? 1 : 0;

            int score = agePlus + weightPlus + strengthPlus;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}
