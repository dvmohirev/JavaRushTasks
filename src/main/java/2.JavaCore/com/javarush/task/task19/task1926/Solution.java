package com.javarush.task.task19.task1926;

import java.io.*;

/* 
Перевертыши
*/

public class Solution {
    public static void main(String[] args) {
        String fileName = "";

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            fileName = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
            while(br.ready()){
                String str = br.readLine();
                StringBuilder sb = new StringBuilder(str);
                System.out.println(sb.reverse());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
/*
* Решение валидатора
* public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fileIn = new BufferedReader(new FileReader(reader.readLine()))) {
            while (fileIn.ready()) {
                String line = fileIn.readLine();
                System.out.println(new StringBuffer(line).reverse().toString());
            }
        } catch (IOException ignore) {

        }
    }
}*/
