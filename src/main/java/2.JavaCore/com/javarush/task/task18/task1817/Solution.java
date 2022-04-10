package com.javarush.task.task18.task1817;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        int countSym = 0;
        int countSpace = 0;
        FileReader reader = new FileReader(args[0]);
        while (reader.ready()){
            countSym++;
            char tempSym = (char) reader.read();
            if (tempSym == ' ') {
                countSpace++;
            }
        }
        if (countSym != 0) {
            double result = (double) countSpace / countSym * 100;
            System.out.printf("%.2f", result);
        }
        reader.close();
    }
}
