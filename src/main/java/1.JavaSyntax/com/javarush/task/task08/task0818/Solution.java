package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Луг", 1010);
        map.put("Иванов", 1020);
        map.put("Мохирев", 1030);
        map.put("Лес", 1040);
        map.put("Петров", 300);
        map.put("Хуев", 200);
        map.put("Тук", 1070);
        map.put("Мудаков", 400);
        map.put("Бех", 1090);
        map.put("Кук", 1100);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        Map<String, Integer> mapCopy = new HashMap<String, Integer>(map);
        for (Map.Entry<String, Integer> pair: mapCopy.entrySet()) {
            Integer value = pair.getValue();
            if (value < 500){
                map.remove(pair.getKey());
            }
        }
        //System.out.println(map);
    }

    public static void main(String[] args) {
        removeItemFromMap(createMap());
    }
}