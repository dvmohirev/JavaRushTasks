package com.javarush.task.task18.task1820;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.PrimitiveIterator;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String[] subStr = new String[1000];

        FileReader fileReader = new FileReader(file1);
        PrintWriter printWriter = new PrintWriter(file2);

        BufferedReader fileReaderNew = new BufferedReader(fileReader);
        while (fileReaderNew.ready()){
            String str = fileReaderNew.readLine();
            subStr = str.split(" ");
            for (String numberInString : subStr) {
                double number = Double.parseDouble(numberInString);
                long roundedNumber = Math.round(number);
                printWriter.print(roundedNumber + " ");
            }
        }

        fileReader.close();
        fileReaderNew.close();
        printWriter.close();
        reader.close();
    }
}
