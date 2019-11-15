package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int a = number / 100;
        int sot = number - a * 100;
        int b = sot / 10;
        int des = sot -  b * 10;
        int edin = des  * 1;
        return sot + des + edin;
    }
}