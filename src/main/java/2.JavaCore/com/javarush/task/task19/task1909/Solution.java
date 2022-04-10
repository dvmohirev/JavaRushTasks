package com.javarush.task.task19.task1909;

import java.io.*;
import java.util.ArrayList;

/*
Замена знаков
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();

        FileReader fileReader = new FileReader(file1);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        FileWriter fileWriter = new FileWriter(file2);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        while (bufferedReader.ready()){
            String str = bufferedReader.readLine();
            String newStr = str.replaceAll("\\.", "!");
            bufferedWriter.write(newStr);
        }
        reader.close();
        fileReader.close();
        bufferedReader.close();
        fileWriter.close();
        bufferedWriter.close();
    }
}
