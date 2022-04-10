package com.javarush.task.task18.task1822;


import java.io.*;

/* 
Поиск данных внутри файла
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        String result = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        //считываем данные из файла
        FileReader fileReader = new FileReader(file);
        BufferedReader strReader = new BufferedReader(fileReader);

        while (strReader.ready()){
            int id = Integer.parseInt(args[0]);
            String str = strReader.readLine();
            if (str.contains(args[0])){
                result = str;
            }
        }
        System.out.println(result);
        reader.close();
        fileReader.close();
        strReader.close();
    }
}
