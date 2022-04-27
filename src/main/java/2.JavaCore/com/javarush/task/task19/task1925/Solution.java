package com.javarush.task.task19.task1925;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Длинные слова
*/

public class Solution {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(args[0]));
            BufferedWriter bw = new BufferedWriter(new FileWriter(args[1]))){
            while (br.ready()){
                String str = br.readLine();
                String[] mStr = str.split(" ");
                for(String s : mStr){
                    if (s.length() > 6){
                        //bw.write(s + ",");
                        list.add(s);
                    }
                }
            }
            for (int i = 0; i < list.size(); i++) {
                if (i == list.size() - 1){
                    bw.write(list.get(i));
                } else bw.write(list.get(i) + ",");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/*Решение валидатора
*
public class Solution {
    public static void main(String[] args) {
        String fileName1 = args[0];
        String fileName2 = args[1];
        String input;

        ArrayList<String> fileContent = new ArrayList<String>();

        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName1))) {
            while ((input = fileReader.readLine()) != null)
                fileContent.add(input);
        } catch (IOException ignore) {

        }

        StringBuffer sbLine = new StringBuffer();
        for (String line : fileContent) {
            String[] splitedLine = line.split(" ");
            for (String word : splitedLine) {
                if (word.length() > 6)

                    sbLine.append(word).append(" ");
            }
        }

        String resultLine = sbLine.toString().trim().replaceAll(" ", ",");
        try (FileWriter fileWriter = new FileWriter(fileName2)) {
            fileWriter.write(resultLine);
        } catch (IOException ignore) {

        }
    }
}
*/
