package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Выражаемся покороче
*/
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> string = new ArrayList<>(5);

        for (int i = 0; i < 5; i++) {
            string.add(bf.readLine());
        }
        int shortest = string.get(0).length();

        for (int i = 0; i < string.size(); i++) {
            if (string.get(i).length() < shortest) {
                shortest = string.get(i).length();
            }
        }
        for (int i = 0; i < string.size(); i++) {
            if (string.get(i).length() == shortest) {
                System.out.println(string.get(i));
            }
        }
    }
}