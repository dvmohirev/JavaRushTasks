package com.javarush.task.task04.task0421;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Настя или Настя?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        String b = reader.readLine();
        if (a.equals(b)){
            System.out.println("Имена идентичны");
        } else if ((a != b) && (a.length() == b.length())){
            System.out.println("Длины имен равны");
        }
    }
}
