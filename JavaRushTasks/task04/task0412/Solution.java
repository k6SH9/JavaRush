package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String r = reader.readLine();
        int chislo = Integer.parseInt(r);

        if (chislo < 0){
            chislo = chislo + 1;
        }
        if (chislo > 0){
            chislo = chislo * 2;
        }
        if (chislo == 0){
            chislo = 0;
        }
        System.out.println(chislo);
    }

}