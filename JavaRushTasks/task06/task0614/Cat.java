package com.javarush.task.task06.task0614;

import java.lang.reflect.Array;
import java.util.ArrayList;

/* 
Статические коты
*/

public class Cat {
    public static ArrayList<Cat> cats = new ArrayList<>();

    public Cat() {
        cats.add(this);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10 ; i++) {
            Cat cat = new Cat();
            cats.add(cat);
        }
        printCats();
    }

    public static void printCats() {
        for (Cat cat : cats){
            System.out.println(cat);
        }
    }
}
