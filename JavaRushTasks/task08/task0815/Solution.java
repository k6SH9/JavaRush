package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Андрей", "Иванов");
        map.put("Николай","Андреев");
        map.put("Алексей","Антонов");
        map.put("Антон","Алексеев");
        map.put("Дмитрий","Алексеев");
        map.put("Игорь","Дивеев");
        map.put("Владислав","Петров");
        map.put("Аркадий","Иванов");
        map.put("Сергей","Жуков");
        map.put("Александр","Пушкин");

        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count = 0;
        for (String i:map.values()) {
            if(name.equals(i)){
                count++;
            }
        }
return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int count = 0;
        for (String i:map.keySet()
             ) {
            if(lastName.equals(i)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
