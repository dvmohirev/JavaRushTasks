package com.javarush.task.task06.task0612;

/* 
Калькулятор
*/

public class Calculator {
    public static int plus(int a, int b) {
        //напишите тут ваш код
        return a+b;
    }

    public static int minus(int a, int b) {
        //напишите тут ваш код
        return a-b;
    }

    public static int multiply(int a, int b) {
        //напишите тут ваш код
        return a*b;
    }

    public static double division(int a, int b) {
        //напишите тут ваш код
        double s = (double)a/(double)b;
        return s;
    }

    public static double percent(int a, int b) {
        //напишите тут ваш код
        double procent = (double)b / 100;
        double s = (double)a*procent;
        return s;
    }

    public static void main(String[] args) {

    }
}