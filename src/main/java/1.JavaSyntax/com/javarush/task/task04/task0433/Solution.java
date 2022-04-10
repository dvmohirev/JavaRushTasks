package com.javarush.task.task04.task0433;

/* 
Гадание на долларовый счет
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int x = 0;
        int y = 0;
        while (x<10){
            while (y<10){
                y++;
                System.out.print("S");
            }
            System.out.println();
            x++;
            y=y-10;
        }
        
    }
}
