package com.javarush.task.task06.task0606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        int manyNum = number.length();
        int num = Integer.parseInt(number);
        int a = 0, b = 0;
        int k = 1;
        //int numX = num%2;
        //int numXX = num/10%2;
        //int numXXX = num/100%2;
        //int numXXXX = num/1000%2;
        for (int i = 0; i < manyNum; i++){
            if (num/k%2 == 0) a++;
            else b++;
            k = k*10;
        }
        Solution.even = a;
        Solution.odd = b;
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
