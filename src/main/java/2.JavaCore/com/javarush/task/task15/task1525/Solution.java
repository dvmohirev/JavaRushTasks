package com.javarush.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();
    static{
        String line;
        try{
            FileReader fr = new FileReader(Statics.FILE_NAME);
            BufferedReader br = new BufferedReader(fr);
            while ((line = br.readLine()) != null){
                lines.add(line);
            }
            br.close();
            fr.close();
        } catch (Exception e){
            e.printStackTrace();
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        System.out.println(lines);
    }
}
