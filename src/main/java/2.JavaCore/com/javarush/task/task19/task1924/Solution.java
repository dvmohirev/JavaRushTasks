package com.javarush.task.task19.task1924;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(0, "ноль"); map.put(1, "один"); map.put(2, "два");
        map.put(3, "три"); map.put(4, "четыре"); map.put(5, "пять");
        map.put(6, "шесть"); map.put(7, "семь"); map.put(8, "восемь");
        map.put(9, "девять"); map.put(10, "десять"); map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }

    public static void main(String[] args) {
        String numFromFile = "";
        String fileName = "";
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            fileName = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
            while(br.ready()){
                numFromFile = br.readLine();
                String newStr = "";
                    for(Map.Entry<Integer, String> pair: map.entrySet()){
                        numFromFile = numFromFile.replaceAll("\\b" + pair.getKey() + "\\b", pair.getValue());
                    }
                System.out.println(numFromFile);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
