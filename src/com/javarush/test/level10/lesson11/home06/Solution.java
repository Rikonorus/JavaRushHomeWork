package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/




public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {

        private String fName;
        private String sName;
        private boolean sex;
        private int age;
        private Human parent;
        private Human child;


        public Human()
        {

            this.fName = "defaultUser";
            this.sName = "defaultUser";
            this.sex = true;
            this.age = 0;
        }

        public Human(String fName)
        {

            this.fName = fName;
        }

        public Human(String fName, String sName)
        {

            this.fName = fName;
            this.sName = sName;
        }

        public Human(String fName, String sName, boolean sex)
        {

            this.fName = fName;
            this.sName = sName;
            this.sex = sex;
        }

        public Human(String fName, String sName, boolean sex, int age)
        {

            this.fName = fName;
            this.sName = sName;
            this.sex = sex;
            this.age = age;
        }

        public Human(String fName, String sName, boolean sex, int age, Human parent)
        {

            this.fName = fName;
            this.sName = sName;
            this.sex = sex;
            this.age = age;
            this.parent = parent;
        }

        public Human(String fName, String sName, boolean sex, int age, Human parent, Human child)
        {

            this.fName = fName;
            this.sName = sName;
            this.sex = sex;
            this.age = age;
            this.parent = parent;
            this.child = child;
        }

        public Human(String fName, boolean sex)
        {

            this.fName = fName;
            this.sex = sex;
        }

        public Human(String fName, boolean sex, int age)
        {
            this.fName = fName;
            this.sex = sex;
            this.age = age;
        }
    }
}
