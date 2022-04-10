package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }
        int shortestString = list.get(0).length();
        int longestString = list.get(0).length();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > longestString){
                longestString = list.get(i).length();
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < shortestString){
                shortestString = list.get(i).length();
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == shortestString){
                System.out.println(list.get(i));
                break;
            }
            if (list.get(i).length() == longestString){
                System.out.println(list.get(i));
                break;
            }
        }
    }
}
