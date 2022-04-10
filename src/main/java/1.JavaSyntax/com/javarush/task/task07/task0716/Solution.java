package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("мера");
        strings.add("лоза");
        strings.add("лира");
        strings.add("вода");
        strings.add("упор");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        //напишите тут ваш код
        ArrayList<String> listRLL = new ArrayList<String>();
        int x = strings.size();
        for (int i = 0; i < x; i++) {
            if ((strings.get(i).indexOf("р") != -1)&&(strings.get(i).indexOf("л") != -1)){
                listRLL.add(strings.get(i));
            }
            else if (strings.get(i).indexOf("л") != -1) {
                for (int j = 0; j < 2; j++) {
                    listRLL.add(strings.get(i));
                }
            } else if ((strings.get(i).indexOf("р") == -1)&&(strings.get(i).indexOf("л") == -1)){
                listRLL.add(strings.get(i));
            }
        }
        return listRLL;
    }
}