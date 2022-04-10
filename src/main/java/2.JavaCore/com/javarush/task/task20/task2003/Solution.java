package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
*/

public class Solution {

    public static Map<String, String> runtimeStorage = new HashMap<>();

    public static void save(OutputStream outputStream) throws Exception {
        //напишите тут ваш код
        Properties properties = new Properties();
        //ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        //objectOutputStream.writeObject(properties);
        /*if(runtimeStorage.size()>0){
            for (Map.Entry pair: runtimeStorage.entrySet()) {
                properties.put(pair.getKey(), pair.getValue());
            }
        }*/
        for (Map.Entry<String, String> pairNew: runtimeStorage.entrySet()
             ) {
            properties.setProperty(pairNew.getKey(), pairNew.getValue());
        }
        properties.store(outputStream, null);
    }

    public static void load(InputStream inputStream) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        Properties properties = new Properties();
        /*while(reader.ready()){
            properties.put(reader.readLine(), reader.readLine());
        }
        for (Map.Entry pair: properties.entrySet()) {
            runtimeStorage.put(pair.getKey().toString(), pair.getValue().toString());
        }*/
        /*while(reader.ready()){
            String propKey = reader.readLine();
            String propValue = reader.readLine();
            runtimeStorage.put(propKey, propValue);
        }*/
        properties.load(inputStream);

        for (Map.Entry<Object, Object> pair: properties.entrySet()) {
            runtimeStorage.put(pair.getKey().toString(), pair.getValue().toString());
        }
        reader.close();
    }

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fos = new FileInputStream(reader.readLine())) {
            load(fos);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(runtimeStorage);
    }
}
