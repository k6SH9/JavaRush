package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int massiv[] = new int[3];
        int countp = 0;
        int counto = 0;

        for(int i = 0; i < 3; i++){
            massiv[i] = Integer.parseInt(reader.readLine());
            if(massiv[i] > 0){
                countp++;
            }
            else if (massiv[i] < 0){
                counto++;
            }
        }
        System.out.println("количество отрицательных чисел: " + counto);
        System.out.println("количество положительных чисел: " + countp);

    }
}