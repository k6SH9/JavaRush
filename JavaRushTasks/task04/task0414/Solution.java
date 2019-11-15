package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int years = Integer.parseInt(reader.readLine());

        int x = 0;

     if (years % 400 == 0 || years % 4 == 0 && years % 100 != 0){
         x = 366;
         System.out.println("количество дней в году: " + x);
     } else {
         x = 365;
         System.out.println("количество дней в году: " + x);
     }





    }
}