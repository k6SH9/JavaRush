package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        return this.age + this.weight + this.strength > anotherCat.age + anotherCat.weight + anotherCat.strength;
    }
    public static void main(String[] args) {

    }
}
