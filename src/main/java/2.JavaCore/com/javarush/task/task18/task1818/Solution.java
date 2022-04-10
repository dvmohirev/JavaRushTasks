package com.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();

        FileWriter fileWriter = new FileWriter(file1);

        FileReader fileReader2 = new FileReader(file2);
        while(fileReader2.ready()){
            fileWriter.write(fileReader2.read());
        }

        FileReader fileReader3 = new FileReader(file3);
        while(fileReader3.ready()){
            fileWriter.write(fileReader3.read());
        }

        fileReader2.close();
        fileReader3.close();
        reader.close();
        fileWriter.close();
    }
}
