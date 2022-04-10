package com.javarush.task.task03.task0318;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
План по захвату мира
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String number = reader.readLine(); //читаем строку с клавиатуры
        String name = reader.readLine(); //читаем строку с клавиатуры

        //Scanner scanner = new Scanner(System.in);
        //String name = scanner.nextLine();
        //int number = scanner.nextLine();
        
        System.out.println(name + " захватит мир через " + number + " лет. Му-ха-ха!");

    }
}
