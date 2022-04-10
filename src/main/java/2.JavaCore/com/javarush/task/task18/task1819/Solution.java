package com.javarush.task.task18.task1819;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();

        FileReader fileReader1 = new FileReader(file1);
        FileWriter fileWriter = new FileWriter(file1);
        FileReader fileReader2 = new FileReader(file2);

        List<Integer> listFileNew = new ArrayList<>();
        while(fileReader2.ready()){
            listFileNew.add(fileReader2.read());
        }
        while (fileReader1.ready()){
            listFileNew.add(fileReader1.read());
        }
        for (int i = 0; i < listFileNew.size(); i++) {
            fileWriter.write(listFileNew.get(i));
        }

        fileReader1.close();
        fileWriter.close();
        fileReader2.close();
        reader.close();
    }
}
