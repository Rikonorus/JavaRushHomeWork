package com.javarush.test.level05.lesson05.task04;

/* Создать три объекта типа Cat
В методе main создать три объекта типа Cat и заполнить их данными.
Использовать класс Cat из первой задачи. Класс Cat создавать не надо.
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Cat cat1 = new Cat("cat1",10,10,10);
        Cat cat2 = new Cat("cat2",10,10,1);
        Cat cat3 = new Cat("cat3",10,10,19);
    }

    private static class Cat {

        private static int count = 0;
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
    }
}
