package com.javarush.task.task16.task1630;

import java.io.*;

/*
Последовательный вывод файлов
*/

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //add your code here - добавьте код тут
    static{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface{
        String newFileName;
        String fileContent = "";

        public void setFileName(String fullFileName){
            this.newFileName = fullFileName;
        }
        public void run(){
            String line;
            try {
                BufferedReader inputReader = new BufferedReader(new FileReader(newFileName));
                while ((line = inputReader.readLine()) != null){
                    fileContent += line + " ";
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public String getFileContent(){
            return fileContent;
        }


    }
    //add your code here - добавьте код тут
}
