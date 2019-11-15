package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] chisla = new int[20];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < chisla.length ; i++) {
            chisla[i] = Integer.parseInt(reader.readLine());
        }

        int[] first = new int[10];
        for (int i = 0; i < first.length ; i++) {
            first[i] = chisla[i];
        }

        int[] second = new int[10];
        for (int i = 0; i < first.length ; i++) {
            second[i] = chisla[i + 10];
        }

        for (int i = 0; i < 10 ; i++) {
            System.out.println(second[i]);
        }
    }
}
