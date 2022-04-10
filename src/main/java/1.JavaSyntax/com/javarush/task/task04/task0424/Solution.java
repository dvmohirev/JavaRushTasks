package com.javarush.task.task04.task0424;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int count = 0;
        if ((a != b) && (a != c) && (b != c)) {

        } else if (a != b) {
            if (a != c) {
                count = 1;
                System.out.println(count);
            } else {
                count = 2;
                System.out.println(count);
            }
        } else if (a == b) {
            count = 3;
            System.out.println(count);
        }
    }
}
