package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Cамая длинная последовательность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        List<Integer> list = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        int x = list.get(0);
        int lengthX = 1;
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 1; i < list.size(); i++) {
            if (x == list.get(i)){
                lengthX++;
                result.add(lengthX);
            } else {
                lengthX = 1;
                x = list.get(i);
                //result.set(1, list.get(0));
            }
        }
        if (result.isEmpty()){
            result.add(lengthX);
        }
        Collections.sort(result);
        System.out.println(result.get(result.size()-1));
        //System.out.println(result);
    }
}
