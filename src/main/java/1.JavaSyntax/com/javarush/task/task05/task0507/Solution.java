package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double sum = 0.0;
        int a;
        int count = 0;
        double abc;
        while ((a = Integer.parseInt(reader.readLine()))!=-1){
                sum = sum + a;
                count++;
        }
        abc = sum/count;
        System.out.println(abc);

    }
}

