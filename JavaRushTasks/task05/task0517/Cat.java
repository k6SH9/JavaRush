package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    String name;
    int age;
    int weight;
    String address;
    String color;

    public Cat(String name){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }
    public Cat(String name, int weight, int age){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }
    public Cat(int weight, String color){
        this.age = age;
        this.weight = weight;
        this.color = color;
    }
    public Cat(int weight, String color, String address){
        this.age = age;
        this.weight = weight;
        this.color = color;
    }
    public static void main(String[] args) {

    }
}
