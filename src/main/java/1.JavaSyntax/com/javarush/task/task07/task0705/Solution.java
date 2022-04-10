package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] mass = new int[20];
        int[] mass1 = new int[10];
        int[] mass2 = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < mass.length; i++) {
            mass[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < mass1.length; i++) {
            mass1[i] = mass[i];
        }
        for (int i = 0; i < mass2.length; i++) {
            mass2[i] = mass[i+10];
            System.out.println(mass2[i]);
        }
    }
}
