package com.javarush.task.task02.task0216;

/* 
Минимум трёх чисел
*/

public class Solution {
    public static int min(int a, int b, int c) {
        //напишите тут ваш код
        int x;
        if (a < b){
            if (a < c)
                x = a;
            else
                x = c;
        }
        else{
            if (b < c)
                x = b;
            else
                x = c;
        }
        return x;
    }

    public static void main(String[] args) {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }
}
