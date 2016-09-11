package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;
import java.util.Random;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        final ArrayList<Human> children = new ArrayList<>();
        final ArrayList<Human> papents = new ArrayList<>();
        final ArrayList<Human> grands = new ArrayList<>();
        children.add(new Human("chi1", new Random().nextBoolean(), new Random().nextInt(10) + 10, null));
        children.add(new Human("chi2", new Random().nextBoolean(), new Random().nextInt(10) + 10, null));
        children.add(new Human("chi3", new Random().nextBoolean(), new Random().nextInt(10) + 10, null));
        final Human mother = new Human("moth", false, new Random().nextInt(20) + 10, children);
        final Human father = new Human("fath", true, new Random().nextInt(20) + 10, children);
        papents.add(mother);
        papents.add(father);
        grands.add(new Human("gp1", true, new Random().nextInt(20) + 10, new ArrayList<Human>()
        {{
            add(0, mother);
        }}));
        grands.add(new Human("gp2", true, new Random().nextInt(20) + 10, new ArrayList<Human>()
        {{
            add(0, father);
        }}));
        grands.add(new Human("gm2", false, new Random().nextInt(20) + 10, new ArrayList<Human>()
        {{
            add(0, father);
        }}));
        grands.add(new Human("gp1", false, new Random().nextInt(20) + 10, new ArrayList<Human>()
        {{
            add(0, mother);
        }}));
        for (Human human :
                new ArrayList<Human>()
                {{
                    addAll(children);
                    addAll(papents);
                    addAll(grands);
                }})
        {


            System.out.println(human);
        }


    }

    public static class Human
    {
        //напишите тут ваш код
        private String name;
        private Boolean sex;
        private Integer age;
        private ArrayList<Human> children;

        public Human(String name, Boolean sex, Integer age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children == null ? 0 : this.children.size();
            if (childCount > 0)
            {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }

            return text;
        }
    }

}
