package com.javarush.task.task18.task1826;

import java.io.*;

/* 
Шифровка
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        switch (args[0]){
            case "-e":
                FileInputStream fr = new FileInputStream(args[1]); // прочитать файл
                while(fr.available()>0){
                    //Процесс зашифровки
                    FileOutputStream fw = new FileOutputStream(args[2]); // записать в новый файл
                    fw.write(fr.read()+32);
                    fw.close();
                }
                fr.close();
                break;
            case "-d":
                FileInputStream fr1 = new FileInputStream(args[1]); // прочитать файл
                while(fr1.available()>0){
                    //Процесс зашифровки
                    FileOutputStream fw1 = new FileOutputStream(args[2]); // записать в новый файл
                    fw1.write(fr1.read()-32);
                    fw1.close();
                }
                fr1.close();
                break;
        }
    }

}
