package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] stroki = new String[10];
        int[] chisla = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < stroki.length ; i++) {
            stroki[i] = reader.readLine();

        }
        for (int j = 0; j < chisla.length ; j++) {
            chisla[j] = stroki[0].length();
        }

        for (int i = 0; i <= 9 ; i++) {
            System.out.println(chisla[i]);
        }

    }
}
