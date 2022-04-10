package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        double value = 0.0;
        String name = null;
        String[] subStr;
        TreeMap<String, Double> map = new TreeMap<String, Double>();
        FileReader fileReader = new FileReader(args[0]);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        while (bufferedReader.ready()){
            subStr = (bufferedReader.readLine()).split(" ");
            name = subStr[0];
            value = Double.parseDouble(subStr[1]);
            if (map.containsKey(name)){
                double oldValue = map.get(name);
                map.put(name, value+oldValue);
            } else {
                map.put(name, value);
            }
        }

        fileReader.close();
        bufferedReader.close();
        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
