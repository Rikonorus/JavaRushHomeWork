package com.javarush.test.level05.lesson12.home03;

/* Создай классы Dog, Cat, Mouse
Создай классы Dog, Cat, Mouse. Добавь по три поля в каждый класс, на твой выбор. Создай объекты для героев мультика Том и Джерри. Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse(“Jerry”, 12 , 5), где 12 - высота в см, 5 - длина хвоста в см.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Dog DogGrey = new Dog("Grey", 20, 80);
        Cat TomCat = new Cat("Tom", 15, 70);
        //напишите тут ваш код
    }

    public static class Mouse
    {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Dog
    {
        String name;
        int fang;
        int strength;

        public Dog(String name, int fang, int strength)
        {
            this.name = name;
            this.fang = fang;
            this.strength = strength;
        }
    }

    public static class Cat
    {
        String name;
        int claw;
        int agility;

        public Cat(String name, int claw, int agility)
        {
            this.name = name;
            this.claw = claw;
            this.agility = agility;
        }
    }

    //добавьте тут ваши классы

}
