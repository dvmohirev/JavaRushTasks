package com.javarush.task.task13.task1319;

import java.io.*;
import java.nio.charset.StandardCharsets;

/* 
Писатель в файл с консоли
*/

public class Solution {

        public static void main (String[]args) throws IOException {
            // решение верное, без использования BufferedWriter. Без использования этого метода, нельзя легко перенести следующую строку на новую строку
            /*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String file = reader.readLine();
            OutputStream outputStream = new FileOutputStream(file);
            String end = "";
            while (!end.equals("exit")) {
                String data = reader.readLine();
                end = data;
                if (!end.equals("exit")) {
                    outputStream.write(data.getBytes());
                }
            }
            reader.close();
            outputStream.close();*/


            // решение верное, с использованием BufferedWriter
            BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
            String file = x.readLine();
            String e = "";
            FileOutputStream l = new FileOutputStream(file);
            BufferedWriter r = new BufferedWriter(new OutputStreamWriter(l));
            while (!e.equals("exit")) {
                String data = x.readLine();
                e = data;
                r.write(data);
                r.newLine();
            }
            r.close();
        }
}
