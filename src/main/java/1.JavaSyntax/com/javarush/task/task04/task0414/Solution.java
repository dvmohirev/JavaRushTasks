package com.javarush.task.task04.task0414;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Количество дней в году
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int x = 0;
        if (a%400 == 0) {
            x = 366;
            System.out.println("количество дней в году: " + x);
        } else if (a%400%100 == 0){
            x = 365;
            System.out.println("количество дней в году: " + x);
        } else if (a%400%100%4 == 0){
            x = 366;
            System.out.println("количество дней в году: " + x);
        } else if (a%400%100%4 != 0){
            x = 365;
            System.out.println("количество дней в году: " + x);
        }
    }
}
/*x = 365;
System.out.println("количество дней в году: " + x);*/