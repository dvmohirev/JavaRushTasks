package com.javarush.task.task07.task0703;

//import jdk.internal.util.xml.impl.Input;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String[] massS = new String[10];
        int[] massI = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < massS.length; i++){
            massS[i] = reader.readLine();
        }
        for(int x = 0; x < massS.length; x++){
            massI[x] = massS[x].length();
            System.out.println(massI[x]);
        }
    }
}
