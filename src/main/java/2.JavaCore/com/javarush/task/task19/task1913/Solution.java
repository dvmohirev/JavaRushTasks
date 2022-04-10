package com.javarush.task.task19.task1913;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Выводим только цифры
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream printStream = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream outStream = new PrintStream(byteArrayOutputStream);

        System.setOut(outStream);
        testString.printSomething();

        String result = byteArrayOutputStream.toString();

        System.setOut(printStream);

        String newResult = result.replaceAll("\\D", "");
        System.out.println(newResult);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's 1 a 23 text 4 f5-6or7 tes8ting");
        }
    }
}
