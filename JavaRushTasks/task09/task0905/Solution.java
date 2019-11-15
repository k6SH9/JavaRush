package com.javarush.task.task09.task0905;

/* 
Там, в синих глубинах стек-трейса…
*/

public class Solution {
    public static void main(String[] args) {
        int deep = getStackTraceDeep();
    }

    public static int getStackTraceDeep() {
        StackTraceElement[] stacktraceelement = Thread.currentThread().getStackTrace();
        System.out.println(stacktraceelement.length);
        return stacktraceelement.length;
    }
}

