package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        
        //напишите тут ваш код
        int[] list = getInts();
        int maximum = list[0];
        int minimum = list[0];
        for (int i = 0; i < list.length; i++) {
            if (list[i] < minimum){
                minimum = list[i];
            } else if (list[i] > maximum){
                maximum = list[i];
            }
        }
        System.out.print(maximum + " " + minimum);
    }

    //напишите тут ваш код
    public static int[] getInts() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] mass = new int[20];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = Integer.parseInt(reader.readLine());
        }
        return mass;
    }
}
