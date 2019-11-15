package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        int count = 0;
        int finalCount = 1;
        int compare = 0;

        for (int i = 0; i < 10; i++){
            if (compare != list.get(i)){
                compare = list.get(i);
            } else {
                count++;
            }
        }

        if (count > finalCount){
            System.out.println(count);;
        } else {
            System.out.println(finalCount);
        }



    }
}


