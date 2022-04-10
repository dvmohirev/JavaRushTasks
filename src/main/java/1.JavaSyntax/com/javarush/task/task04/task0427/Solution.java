package com.javarush.task.task04.task0427;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Описываем числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        if ((a < 1)||(a > 999)){
            
        } else if (((a/100) >= 1) && (a%2 == 0)){
            System.out.println("четное трехзначное число");
        } else if (((a/100) >= 1) && (a%100%10%2 != 0)){
            System.out.println("нечетное трехзначное число");
        } else if (((a%100/10) >= 1) && (a%100%10%2 != 0)){
            System.out.println("нечетное двузначное число");
        } else if (((a%100/10) >= 1) && (a%2 == 0)){
            System.out.println("четное двузначное число");
        } else if (((a%100/10) == 0) && (a%2 == 0)){
            System.out.println("четное однозначное число");
        } else if (((a%100/10) == 0) && (a%2 != 0)){
            System.out.println("нечетное однозначное число");
        }
    }
}
