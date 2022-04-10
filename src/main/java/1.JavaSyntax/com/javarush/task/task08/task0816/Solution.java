package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("AUGUST 1 2012"));

        //напишите тут ваш код
        map.put("Петров", dateFormat.parse("MAY 1 1995"));
        map.put("Иванов", dateFormat.parse("APRIL 1 1996"));
        map.put("Рудаков", dateFormat.parse("JUNE 1 1997"));
        map.put("Мудаков", dateFormat.parse("JULY 1 1998"));
        map.put("Орлов", dateFormat.parse("JULY 10 1995"));
        map.put("Воронин", dateFormat.parse("APRIL 1 1996"));
        map.put("Листов", dateFormat.parse("NOVEMBER 1 1997"));
        map.put("Шестаков", dateFormat.parse("DECEMBER 1 1998"));
        map.put("Бех", dateFormat.parse("MARCH 1 1998"));
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        Map<String, Date> copyMap = new HashMap<>(map);
        for (Map.Entry<String, Date> pair:copyMap.entrySet()
             ) {
            String key = pair.getKey();
            Date value = pair.getValue();
            if ((value.getMonth()+1 == 6) || (value.getMonth()+1 == 7) || (value.getMonth()+1 == 8)){
                map.remove(key);
            }
        }
        //System.out.println(map);

        /*ArrayList<Date> listDate = new ArrayList<Date>(map.values());
        System.out.println(listDate);*/
    }

    public static void main(String[] args) throws ParseException {
        removeAllSummerPeople(createMap());
    }
}
