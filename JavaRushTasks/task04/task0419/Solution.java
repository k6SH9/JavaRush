package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        
        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());
        int z = Integer.parseInt(reader.readLine());
        int a = Integer.parseInt(reader.readLine());
        
        int b = 0;
        
        if (x >= y && x >= z && x >= a ){
            System.out.println(x);
        }
        else if (y >= x && y >= z && y >= a){
            System.out.println(y);
        }
        else if (z >= x && z >= y && z >= a){
            System.out.println(z);
        }
        else if (a >= z && a >= y && a >= x){
            System.out.println(a);
        }
        
    }
}
