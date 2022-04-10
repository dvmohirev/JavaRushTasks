package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        InputStream inputStream = new FileInputStream(file);
        while (inputStream.available() > 0){
            int data = inputStream.read();
            char i = (char) data;
            System.out.print(i);
        }
        inputStream.close();
        reader.close();
    }
}