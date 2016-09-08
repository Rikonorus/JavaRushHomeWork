package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human granpa1 = new Human("granpa1", true, 81);
        Human granpa2 = new Human("granpa2", true, 79);
        Human granma1 = new Human("granma1", false, 82);
        Human granma2 = new Human("granma2", false, 78);
        Human father = new Human("father", true, 25, granpa1, granma1);
        Human mother = new Human("mother", false, 24, granpa2, granma2);
        Human child1 = new Human("child1", true, 2, father, mother);
        Human child2 = new Human("child2", false, 4, father, mother);
        Human child3 = new Human("child3", false, 6, father, mother);
        System.out.println(granpa1);
        System.out.println(granpa2);
        System.out.println(granma1);
        System.out.println(granma2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human
    {
        //напишите тут ваш код
        String name;
        Boolean sex;
        int age;
        Human father, mother;

        public Human(String name, Boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human(String name, Boolean sex, int age, Human father, Human mother)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
