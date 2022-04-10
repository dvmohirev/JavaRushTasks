package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        int minValue = 255;
        int dataValue = 0;
        while (inputStream.available() > 0){
            dataValue = inputStream.read();
            if (dataValue < minValue) minValue = dataValue;
        }
        System.out.println(minValue);
        inputStream.close();
    }
}
