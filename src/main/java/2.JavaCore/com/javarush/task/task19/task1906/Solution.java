package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();

        FileReader fileReader = new FileReader(file1);
        FileWriter fileWriter = new FileWriter(file2);
        while (fileReader.ready()){
            int elem1 = fileReader.read();
            int elem2 = fileReader.read();
            fileWriter.write(elem2);
        }
        fileReader.close();
        fileWriter.close();
        reader.close();
    }
}
