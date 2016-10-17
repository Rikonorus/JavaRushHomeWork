package com.javarush.test.level13.lesson11.bonus02;

class Person implements RepkaItem
{
    private String name;
    private String namePadezh;

     Person(String name, String namePadezh)
    {
        this.name = name;
        this.namePadezh = namePadezh;
    }

    void pull(Person person)
    {
        System.out.println(this.name + " за " + person.getNamePadezh());
    }

    public String getNamePadezh()
    {
        return this.namePadezh;
    }
}
