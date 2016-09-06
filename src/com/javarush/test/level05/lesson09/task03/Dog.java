package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    //напишите тут ваш код
    private String name, color;
    private int grow;

    public Dog(String name)
    {
        this.name = name;
    }

    public Dog(String name, int grow)
    {
        this.name = name;
        this.grow = grow;

    }

    public Dog(String name, int grow, String color)
    {
        this.name = name;
        this.grow = grow;
        this.color = color;
    }

}
