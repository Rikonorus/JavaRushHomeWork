package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        //создай по два объекта каждого класса тут
        Man man1 = new Man("man1", "dom", 10);
        Man man2 = new Man("man2", "dom");
        Woman woman1 = new Woman("woman1", 10);
        Woman woman2 = new Woman("woman2");
        System.out.println(man1);
        System.out.println(man2);
        System.out.println(woman1);
        System.out.println(woman2);
        //выведи их на экран тут

    }

    public static class Man
    {
        private String name, address;
        private int age;

        private Man(String name, String address, int age)
        {
            this.name = name;
            this.address = address;
            this.age = age;
        }

        private Man(String name, String address)
        {
            this.name = name;
            this.address = address;
            this.age = 0;
        }

        private Man(String name, int age)
        {
            this.name = name;
            this.age = age;
            this.address = "";
        }

        private Man(String name)
        {
            this.name = name;
            this.age = 0;
            this.address = "";
        }

        public String toString()
        {
            return this.name + " " + this.age + " " + this.address;
        }
    }


    public static class Woman
    {
        String name, address;
        int age;

        private Woman(String name, String address, int age)
        {
            this.name = name;
            this.address = address;
            this.age = age;
        }

        private Woman(String name, String address)
        {
            this.name = name;
            this.address = address;
            this.age = 0;
        }

        private Woman(String name, int age)
        {
            this.name = name;
            this.age = age;
            this.address = "";
        }

        private Woman(String name)
        {
            this.name = name;
            this.age = 0;
            this.address = "";
        }

        public String toString()
        {
            return this.name + " " + this.age + " " + this.address;
        }
    }
    //добавьте тут ваши классы
}
