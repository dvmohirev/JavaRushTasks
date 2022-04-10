package com.javarush.task.task04.task0419;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Максимум четырех чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        Max(a, b, c, d);

    }
    public static void Max(int a, int b, int c, int d){
        if (a < b){
            if (c < d) {
                if (b < c) {
                    System.out.println(d);
                } else if (b < d) {
                    System.out.println(d);
                } else System.out.println(b);
            } else if (b < d){
                System.out.println(c);
            } else if (b<c){
                System.out.println(c);
            } else System.out.println(b);
        } else if (c < d) {
                if (a < c) {
                    System.out.println(d);
                } else if (a < d) {
                    System.out.println(d);
                } else System.out.println(a);
        } else if (a < d){
            System.out.println(c);
        } else if (a<c){
            System.out.println(c);
        } else System.out.println(a);
    }
}
