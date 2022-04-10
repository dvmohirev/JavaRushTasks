package com.javarush.task.task18.task1810;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/* 
DownloadException
*/

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = "";
        while((file = reader.readLine()) != ""){
            FileInputStream inputStream = new FileInputStream(file);
            if (inputStream.available() < 1000){
                reader.close();
                inputStream.close();
                file = "";
                throw new DownloadException();
            }
        }

    }

    public static class DownloadException extends Exception {
    }
}
