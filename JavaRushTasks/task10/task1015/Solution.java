package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Dada");
        list.add("netnet");

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("ili tak");
        list1.add("ili net");

        ArrayList<String>[] list2 = new ArrayList[2];
        list2[0] = list;
        list2[1] = list1;
        return list2;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}