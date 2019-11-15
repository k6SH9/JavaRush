package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //String s = reader.readLine();

        int count = 0;
        double sum = 1;

        while(true){
            int y = Integer.parseInt(reader.readLine());
            sum = sum + y;
            count = count + 1;
            if(y == -1){
                System.out.println(sum / (count - 1));
                break;
            }

        }

    }
}
