package com.javarush.task.task08.task0815;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<String, String>();
        map.put("Лох","Дима");
        map.put("Бычик","Рома");
        map.put("Косяков","Сергей");
        map.put("Суп","Паша");
        map.put("Пушка","Слава");
        map.put("Ложка","Вова");
        map.put("Вилка","Леша");
        map.put("Сафронов","Паша");
        map.put("Петров","Влад");
        map.put("Иванов","Сергей");

        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int copyName = 0;
        /*for (Map.Entry<String, String> pair:map.entrySet()) {
            String value = pair.getValue();
            System.out.println(value);
            if (map.containsValue(value)){
                copyName++;
            }
        }*/
        ArrayList<String> listNames = new ArrayList<String>(map.values());
        if (listNames.contains(name)){
            for (int i = 0; i < listNames.size(); i++) {
                if(listNames.get(i) == name){
                    copyName++;
                }
            }
        }
        return copyName;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int copyLastName = 0;
        ArrayList<String> listLastN = new ArrayList<String>(map.keySet());
        if (listLastN.contains(lastName)){
            for (int i = 0; i < listLastN.size(); i++) {
                if(listLastN.get(i) == lastName){
                    copyLastName++;
                }
            }
        }
        return copyLastName;
    }

    public static void main(String[] args) {
        getCountTheSameFirstName(createMap(), "Паша");
        getCountTheSameLastName(createMap(), "Сафронов");
    }
}
