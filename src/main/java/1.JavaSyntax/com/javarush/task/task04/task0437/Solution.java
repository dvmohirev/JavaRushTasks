package com.javarush.task.task04.task0437;

/* 
Треугольник из восьмерок
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 0; i < 10; i++){
            for (int x = 0; x < i; x++){
                System.out.print(8);
            }
            System.out.println(8);
        }
    }
}
