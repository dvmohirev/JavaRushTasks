package com.javarush.task.task04.task0416;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переходим дорогу вслепую
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double a = Double.parseDouble(reader.readLine())%5;
        if (a < 3) System.out.println("зелёный");
        if (3 <= a && a < 4) System.out.println("жёлтый");
        if (4 <= a && a < 5) System.out.println("красный");
    }
}