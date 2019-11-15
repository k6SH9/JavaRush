package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] massiv = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < massiv.length ; i++) {
            massiv[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = massiv.length; i >= 0; i--) {
            System.out.println(massiv[i]);

        }

    }
}

