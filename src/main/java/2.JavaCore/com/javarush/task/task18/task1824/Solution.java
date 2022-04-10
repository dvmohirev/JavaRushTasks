package com.javarush.task.task18.task1824;

import java.io.*;

/* 
Файлы и исключения
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = null;
        try {
            while ((file = reader.readLine()) != ""){
                FileInputStream fileInputStream = new FileInputStream(file);
                fileInputStream.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println(file);
        }
        reader.close();
    }
}
