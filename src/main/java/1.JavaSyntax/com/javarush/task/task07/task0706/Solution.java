package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        int[] mass = new int[15];
        int leftSide = 0;
        int rightSide = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < mass.length; i++) {
            mass[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < mass.length; i++) {
            if (i%2==0){
                rightSide += mass[i];
            } else leftSide += mass[i];
        }
        if (leftSide>rightSide) System.out.println("В домах с нечетными номерами проживает больше жителей.");
        else if (leftSide<rightSide) System.out.println("В домах с четными номерами проживает больше жителей.");
    }
}
