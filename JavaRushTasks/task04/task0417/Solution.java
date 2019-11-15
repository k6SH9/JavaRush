package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int chislo1 = Integer.parseInt(reader.readLine());
        int chislo2 = Integer.parseInt(reader.readLine());
        int chislo3 = Integer.parseInt(reader.readLine());


        if (chislo1 == chislo2 && chislo2 == chislo3 && chislo1 == chislo3){
            System.out.println(chislo1 + " " + chislo2 + " " + chislo3);
        }
        else if (chislo2 == chislo3){
            System.out.print(chislo2 + " " + chislo3);
        }
        else if (chislo1 == chislo3){
            System.out.print(chislo1 + " " + chislo3);
        }
        else if (chislo1 == chislo2){
            System.out.print(chislo1 + " " + chislo2);
        }

    }
}