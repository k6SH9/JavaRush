package com.javarush.task.task03.task0304;

/* 
Задача на проценты
*/

public class Solution {
    public static double addTenPercent(int i) {
        //double c = i +((i / 100) * 10);
        return ((double) i +((i / 100) * 10));
    }

    public static void main(String[] args) {

        System.out.println(addTenPercent(9));
    }
}
