package com.javarush.task.task04.task0420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Сортировка трех чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        if (a < b){
            if (c < a){
                System.out.println(b + " " + a + " " + c);
            } else if (c < b) System.out.println(b + " " + c + " " + a);
            else System.out.println(c + " " + b + " " + a);
        } else {
            if (b>c){
                System.out.println(a + " " + b + " " + c);
            } else if (a<c) System.out.println(c + " " + a + " " + b);
            else System.out.println(a + " " + c + " " + b);
        }
    }
}
