package com.javarush.task.task19.task1922;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) {
        String fileName = "";

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            fileName = br.readLine();
        } catch (IOException e){
            e.printStackTrace();
        }

        try(FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr)){
            String checkWords = "";
            while (br.ready()){
                int containsWord = 0;
                checkWords = br.readLine();
                String[] mStr = checkWords.split(" ");
                for (String s : mStr) {
                    if (words.contains(s)){
                        containsWord++;
                    }
                }
                if (containsWord == 2){
                    System.out.println(checkWords);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
