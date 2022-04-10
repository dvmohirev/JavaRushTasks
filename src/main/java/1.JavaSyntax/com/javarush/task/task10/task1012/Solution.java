package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.security.spec.RSAOtherPrimeInfo;
import java.sql.SQLOutput;
import java.util.*;

/*
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        /*for (int i = 0; i < 10; i++) {
            String line = reader.readLine();
            list.add(line.toLowerCase());
        }*/
        for (int i = 0; i < 10; i++) {
            String line = reader.readLine();
            list.add(line.toLowerCase());
        }

        // напишите тут ваш код
        // Подсчет букв
        // 1. Берем слово; 2. Проходим по массиву алфавит и ищем буквы в слове. Я бы создал мапу и в нее заложил буквы алфавита как ключи, а значение как количество повторений.
        //Создали мапу, чтобы положить буквы алфавита как ключи -> положили ключи
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (Character ch: alphabet
             ) {
            map.put(ch, 0);
        }
        //Проверяем слово и меняем значения букв. Проходим по каждому слову
        /*for (String s: list
             ) {
            for (Map.Entry<Character, Integer> pair: map.entrySet()
                 ) {
                Integer v = 0;
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == pair.getKey()){
                        v++;

                    }

                }
                pair.setValue(v);
            }
        }*/

        for (Map.Entry<Character, Integer> pair: map.entrySet()
             ) {
            Integer v = 0;
            for (String s: list
                 ) {

                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == pair.getKey()){
                        v++;

                    }

                }

            }
            pair.setValue(v);
        }

        //Выводим ключи и значения букв, тех, что не равны 0.

        Map<Character, Integer> treeMap = new TreeMap<Character, Integer>(map);
        List<Integer> listValue = new ArrayList<Integer>(treeMap.values());
        listValue.add(6, listValue.get(listValue.size()-1));
        listValue.remove(listValue.size()-1);
        for (int i = 0; i < listValue.size(); i++) {
            System.out.println(alphabet.get(i) + " " + listValue.get(i));
        }
    }
}
