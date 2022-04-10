package com.javarush.task.task04.task0434;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int x = 0;
        int y = 0;
        while (x < 10){
            x++;
            while (y<10){
                y++;
                System.out.print(x*y + " ");
            }
            System.out.println();
            y = y-10;
        }
    }
}
