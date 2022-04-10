package com.javarush.task.task10.task1019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        while(true){
            try{
                Integer id = Integer.parseInt(reader.readLine());
                String name = reader.readLine();
                map.put(name, id);
            } catch (Exception e){
                for (Map.Entry<String, Integer> pair: map.entrySet()
                ) {
                    int id = pair.getValue();
                    String name = pair.getKey();
                    System.out.println(id + " " + name);
                }
                break;
            }
        }
    }
}
