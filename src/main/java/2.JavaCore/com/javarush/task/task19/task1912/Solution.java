package com.javarush.task.task19.task1912;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Ридер обертка 2
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleOut = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream outStream = new PrintStream(byteArrayOutputStream);

        System.setOut(outStream);
        testString.printSomething();

        String result = byteArrayOutputStream.toString();
        System.setOut(consoleOut);

        String newResult = result.replaceAll("te", "??");
        System.out.println(newResult);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
