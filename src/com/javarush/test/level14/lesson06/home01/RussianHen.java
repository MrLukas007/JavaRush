package com.javarush.test.level14.lesson06.home01;

/**
 * Created by user on 01.04.15.
 */
public class RussianHen extends Hen
{
    @Override
    public int getCountOfEggsPerMonth()
    {
        return 10;
    }

    public String getDescription(){
        return super.getDescription()+" Моя страна - "+ Country.RUSSIA +". Я несу " +this.getCountOfEggsPerMonth() +" яиц в месяц.";
    }
}
