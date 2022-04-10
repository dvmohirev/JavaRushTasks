package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Решаем пример
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
        String newResult = null;
        String[] resultArray = result.split(" ");
        Integer A = Integer.parseInt(resultArray[0]);
        Integer B = Integer.parseInt(resultArray[2]);
        int arithmeticResult = 0;
        switch (resultArray[1]){
            case "+":
                arithmeticResult = A+B;
                break;
            case "-":
                arithmeticResult = A-B;
                break;
            case "*":
                arithmeticResult = A*B;
                break;
        }

        System.out.println(A + " " + resultArray[1] + " " + B + " = " + arithmeticResult);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

