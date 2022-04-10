package com.javarush.task.task19.task1916;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String file1 = reader.readLine();
            String file2 = reader.readLine();

            FileReader fileReader1 = new FileReader(file1);
            BufferedReader bufferedReader1 = new BufferedReader(fileReader1);

            FileReader fileReader2 = new FileReader(file2);
            BufferedReader bufferedReader2 = new BufferedReader(fileReader2);
            String str1 = bufferedReader1.readLine();
            String str2 = bufferedReader2.readLine();
            while (bufferedReader1.ready() && bufferedReader2.ready()){
                String strTemp1 = str1;
                String strTemp2 = str2;
                if (strTemp1.equals(strTemp2)){
                    lines.add(new LineItem(Type.SAME, strTemp1));
                    strTemp1 = bufferedReader1.readLine();
                    strTemp2 = bufferedReader2.readLine();
                } else if(!(strTemp1.equals(strTemp2))){
                    lines.add(new LineItem(Type.REMOVED, strTemp1));
                    strTemp1 = bufferedReader2.readLine();
                    //подумать как сделать так, чтобы str2 получило новое значение из файла
                } else if(!(strTemp2.equals(strTemp1))){
                    lines.add(new LineItem(Type.ADDED, strTemp2));
                }
            }
            reader.close();
            fileReader1.close();
            bufferedReader1.close();
            fileReader2.close();
            bufferedReader2.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
