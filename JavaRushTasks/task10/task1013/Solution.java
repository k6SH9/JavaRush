package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private int age;
        private String name;
        private char sex;
        private int weight;
        private int heigt;
        private float growth;

        public Human(int age){
            this.age = age;
        }

        public Human(String name){

            this.name = name;
        }

        public Human(char sex){
            this.sex = sex;
        }

        public Human(int age, int weight){
            this.age = age;
            this.weight = weight;
        }

        public Human(int age, int weight, String name){
            this.age = age;
            this.weight = weight;
            this.name = name;
        }

        public Human(String name, int heigt){
            this.name = name;
            this.heigt = heigt;
        }

        public Human(char sex, String name){
            this.sex = sex;
            this.name = name;
        }
        public Human(int heigt, int weight, float growth){
            this.heigt = heigt;
            this.weight = weight;
            this.growth = growth;
        }
        public Human(int age, int heigt, String name, int weight){
            this.age = age;
            this.heigt = heigt;
            this.name = name;
            this.weight = weight;
        }
        public Human(int age, String name, int weight, int heigt, char sex){
            this.age = age;
            this.name = name;
            this.weight = weight;
            this.heigt = heigt;
            this.sex = sex;
        }


    }
}
