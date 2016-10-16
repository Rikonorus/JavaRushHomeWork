package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Rustam on 16.10.2016.
 */
public class UkrainianHen extends Hen
{
    public int getCountOfEggsPerMonth()
    {
        return 25;
    }

    String getDescription()
    {
        return super.getDescription() + String.format(" Моя страна - %s. Я несу %d яиц в месяц.", Country.UKRAINE, this.getCountOfEggsPerMonth());
    }
}
