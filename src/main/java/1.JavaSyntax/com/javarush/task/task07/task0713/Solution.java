package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        ArrayList<Integer> mass3 = new ArrayList<Integer>();
        ArrayList<Integer> mass2 = new ArrayList<Integer>();
        ArrayList<Integer> massOst = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            if ((list.get(i) % 3 == 0) &&  (list.get(i) % 2 == 0)){
                mass3.add(list.get(i));
                mass2.add(list.get(i));
            } else if (list.get(i) % 3 == 0){
                mass3.add(list.get(i));
            } else if (list.get(i) % 2 == 0){
                mass2.add(list.get(i));
            } else if ((list.get(i) % 3 != 0) || (list.get(i) % 2 != 0)){
                massOst.add(list.get(i));
            }
        }
        printList(mass3);
        printList(mass2);
        printList(massOst);
    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for (Integer x : list){
            System.out.println(x);
        }
    }
}
