package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name1 = new String();
        String name2 = new String();

        name1 = reader.readLine();
        name2 = reader.readLine();

        if(name1.equalsIgnoreCase(name2)){
            System.out.println("Имена идентичны");
        }
        if(name1.length() == name2.length()){
            System.out.println("Длины имен равны");
        }


    }
}
