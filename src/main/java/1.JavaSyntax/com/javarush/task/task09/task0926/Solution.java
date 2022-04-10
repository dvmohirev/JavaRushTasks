package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> littleList = new ArrayList<>();
        littleList.add(new int[5]);
        littleList.add(new int[2]);
        littleList.add(new int[4]);
        littleList.add(new int[7]);
        littleList.add(new int[0]);
        return littleList;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
