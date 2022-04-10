package com.javarush.task.task19.task1904;


import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner{
        private final Scanner fileScanner;

        public PersonScannerAdapter (Scanner scanner){
            this.fileScanner = scanner;
        }

        @Override
        public Person read() throws IOException {
            String str = fileScanner.nextLine();
            String[] buffer = str.split(" ");
            Calendar birthday = new GregorianCalendar(Integer.parseInt(buffer[5]), Integer.parseInt(buffer[4])-1, Integer.parseInt(buffer[3]));
            Date resBirth = birthday.getTime();
            Person person = new Person(buffer[1], buffer[2], buffer[0], resBirth);
            return person;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
