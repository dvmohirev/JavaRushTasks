package com.javarush.task.task19.task1915;

import java.awt.*;
import java.io.*;

/* 
Дублируем текст
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();

        PrintStream printStream = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream outStream = new PrintStream(byteArrayOutputStream);

        System.setOut(outStream);

        testString.printSomething();

        String result = byteArrayOutputStream.toString();
        System.setOut(printStream);

        FileOutputStream fileOutputStream = new FileOutputStream(file);

        System.out.println(result);
        fileOutputStream.write(byteArrayOutputStream.toByteArray());

        reader.close();
        fileOutputStream.close();
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

