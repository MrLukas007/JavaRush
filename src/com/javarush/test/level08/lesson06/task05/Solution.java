package com.javarush.test.level08.lesson06.task05;

import java.util.*;

/* Четыре метода
Реализовать 4 метода. Они должны возвращать список, который лучше всего подходит для выполнения данных операций (быстрее всего справится с большим количеством операций). Ничего измерять не нужно.
*/

public class Solution
{
    public static List getListForGet()
    {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        return arrayList;
    }

    public static List getListForSet()
    {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        return arrayList;

    }

    public static List getListForAddOrInsert()
    {
        LinkedList<Object> linkedList = new LinkedList<Object>();
        return linkedList;
    }

    public static List getListForRemove()
    {
        LinkedList<Object> linkedList = new LinkedList<Object>();
        return linkedList;
    }
}
