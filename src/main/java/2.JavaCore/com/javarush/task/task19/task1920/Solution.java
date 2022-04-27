package com.javarush.task.task19.task1920;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.TreeMap;
import java.util.TreeSet;

/* 
Самый богатый
*/

public class Solution {

    static TreeMap<String, Double> treeMap = new TreeMap<>(Collections.reverseOrder());

    public static void main(String[] args) {
        try(FileReader fileReader = new FileReader(args[0])){
            BufferedReader br = new BufferedReader(fileReader);
            while(br.ready()){
                String[] buff = br.readLine().split(" ");
                for (int i = 1; i < buff.length; i++) {
                    if (!(treeMap.containsKey(buff[i-1]))){
                        treeMap.put(buff[i-1], Double.parseDouble(buff[i]));
                    } else {
                        double valueName = treeMap.get(buff[i-1]);
                        treeMap.put(buff[i-1], valueName + Double.parseDouble(buff[i]));
                    }
                }
            }

            double maxSalary = treeMap.firstEntry().getValue();
            for (double value : treeMap.values()) {
                if (value > maxSalary) {
                    maxSalary = value;
                }
            }

            TreeSet<String> names = new TreeSet<>();
            for (String name : treeMap.keySet()) {
                if (maxSalary == treeMap.get(name)) {
                    names.add(name);
                }
            }

            for (String name : names) {
                System.out.println(name);
            }
        }catch (IOException e){
        }

    }
}
