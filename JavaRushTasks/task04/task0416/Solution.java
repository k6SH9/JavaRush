package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //int min = Integer.parseInt(reader.readLine());

        Scanner sc = new Scanner(System.in);
        double min = sc.nextDouble();


        for (int i = 0; i <= 11; i++){
            if (min >= 5*i & min < 5*i + 3) {
                System.out.println("зелёный");
            }
            if (min >= 5*i + 3 & min < 5*i + 4) {
                System.out.println("жёлтый");
            }
            if (min >= 5*i + 4 & min < 5*i + 5) {
                System.out.println("красный");
            }
        }


    }
}