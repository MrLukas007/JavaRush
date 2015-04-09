package com.javarush.test.level15.lesson09.task01;

import java.util.HashMap;
import java.util.Map;

/* Статики 1
В статическом блоке инициализировать labels 5 различными парами.
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static
    {
        Map labels = new HashMap<Object, Object>();
        labels = new HashMap<Integer, Integer>();
        labels = new HashMap<Byte, Integer>();
        labels = new HashMap<Short, Integer>();
        labels = new HashMap<Long, Integer>();

    }



    public static void main(String[] args) {
        System.out.println(labels);
    }
}
