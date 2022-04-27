package com.javarush.task.task19.task1923;

import java.io.*;

/* 
Слова с цифрами
*/

public class Solution {
    public static void main(String[] args) {
        String checkNumbers = "";
        StringBuilder sb = new StringBuilder();
        try(BufferedReader br = new BufferedReader(new FileReader(args[0]));
        BufferedWriter bw = new BufferedWriter(new FileWriter(args[1]))){
            while (br.ready()){
                checkNumbers = br.readLine();
                String[] mStr = checkNumbers.split(" ");
                //bw.write(checkNumbers);
                for(String s : mStr){
                    if (s.matches(".*[0-9].*")){
                        bw.write(s + " ");
                    }
                }
            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
