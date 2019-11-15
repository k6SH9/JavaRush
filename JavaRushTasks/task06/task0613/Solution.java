package com.javarush.task.task06.task0613;

/* 
Кот и статика
*/

public class Solution {
    public static void main(String[] args) {
        Cat barsik = new Cat();
        Cat fenya = new Cat();
        Cat sasha = new Cat();
        Cat dasha = new Cat();
        Cat ksusha = new Cat();
        Cat adnrey = new Cat();
        Cat kolya = new Cat();
        Cat x = new Cat();
        Cat andton = new Cat();
        Cat sergey = new Cat();


        System.out.println(Cat.catCount);

        // Выведи значение переменной catCount
    }

    public static class Cat {
        public static int catCount = 0;

        public Cat(){

            catCount++;
        }
    }
}
