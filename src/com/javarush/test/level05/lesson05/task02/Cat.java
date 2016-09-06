package com.javarush.test.level05.lesson05.task02;

/* Реализовать метод fight
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Зависимость придумать самому. Метод должен определять, выиграли ли мы (this) бой или нет,
т.е. возвращать true, если выиграли и false - если нет.
Должно выполняться условие:
если cat1.fight(cat2) = true , то cat2.fight(cat1) = false
*/

public class Cat
{
    public String name;
    private int age;
    private int weight;
    private int strength;

    public Cat()
    {
    }

    public boolean fight(Cat anotherCat)
    {
        //напишите тут ваш код
        if (this.name.length()> anotherCat.name.length())
        {
            return true;
        }else if(this.age>anotherCat.age){
            return true;
        }else if(this.weight>anotherCat.weight){
            return true;
        }else if(this.strength>anotherCat.strength){
            return true;
        }else{
            return this.name.equals(anotherCat.name);
        }

    }
}
