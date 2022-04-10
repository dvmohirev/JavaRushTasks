    package com.javarush.task.task19.task1908;

    import java.io.*;
    import java.util.ArrayList;

    /*
    Выделяем числа
    */

    public class Solution {
        public static void main(String[] args) throws IOException{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String file1 = reader.readLine();
            String file2 = reader.readLine();

            FileReader fileReader = new FileReader(file1);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            FileWriter fileWriter = new FileWriter(file2);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String phrase;
            ArrayList<String> fileContent = new ArrayList<>();
            while (bufferedReader.ready()){
                fileContent.add(bufferedReader.readLine());
                /*phrase = bufferedReader.readLine();
                for (String x: phrase.split(" ")) {
                    if (x.matches("%d")){
                        bufferedWriter.write(x+" ");
                    }
                }*/
            }
            for (String line : fileContent) {
                String[] splitLine = line.trim().split(" ");
                for (String word : splitLine) {
                    try {
                        int num = Integer.parseInt(word);
                        bufferedWriter.write(word + " ");
                    } catch (Exception ignore) {
                            /* NOP */
                    }
                }
            }


            reader.close();
            fileReader.close();
            fileWriter.close();
            bufferedReader.close();
            bufferedWriter.close();
        }
    }
