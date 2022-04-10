package com.javarush.task.task04.task0425;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Цель установлена!
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());
        int quater = 0;
        if ((x>0)&&(y>0)){
            quater = 1;
            System.out.println(quater);
        } else if ((x<0)&&(y>0)){
            quater = 2;
            System.out.println(quater);
        } else if ((x<0)&&(y<0)){
            quater = 3;
            System.out.println(quater);
        } else if ((x>0)&&(y<0)){
            quater = 4;
            System.out.println(quater);
        }
    }
}
