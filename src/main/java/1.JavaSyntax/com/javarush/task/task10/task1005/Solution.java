package com.javarush.task.task10.task1005;

/* 
Задача №5 на преобразование целых типов
*/

public class Solution {
    public static void main(String[] args) {
        int a = (byte) 44; //44
        int b = (short) 300; //128
        short c = (short) (b - a); // 128 - 44 = 84
        System.out.println(c);
    }
}