package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Wert", 300);
        map.put("Hurt", 500);
        map.put("jurt", 100);
        map.put("kurt", 200);
        map.put("lurt", 400);
        map.put("ourt", 800);
        map.put("purt", 900);
        map.put("yurt", 1000);
        map.put("turt", 250);
        map.put("rurt", 470);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<String, Integer> pair = iterator.next();
            String key = pair.getKey();
            int value = pair.getValue();
            if (value < 500)
                iterator.remove();
        }
    }

    public static void main(String[] args) {

    }
}