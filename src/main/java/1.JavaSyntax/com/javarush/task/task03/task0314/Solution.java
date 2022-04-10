package com.javarush.task.task03.task0314;

/* 
Таблица умножения Ӏ Java Syntax: 3 уровень, 6 лекция
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 1; i < 11; i++){
            for (int k = 1; k < 11; k++){
                System.out.print(k*i + " ");
            }
            System.out.println();
        }
    }
}
