package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        FileReader fileReader1 = new FileReader(new File(fileName1));
        FileReader fileReader2 = new FileReader(new File(fileName2));
        BufferedReader fr1 = new BufferedReader(fileReader1);
        BufferedReader fr2 = new BufferedReader(fileReader2);

        String strAllLines = fr1.readLine();
        String strForRemoveFiles = fr2.readLine();
        while (strAllLines!=null){
            allLines.add(strAllLines);
            strAllLines = fr1.readLine();
        }
        while (strForRemoveFiles!=null){
            forRemoveLines.add(strForRemoveFiles);
            strForRemoveFiles = fr2.readLine();
        }
        new Solution().joinData();
        reader.close();
        fr1.close();
        fr2.close();
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)){
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
