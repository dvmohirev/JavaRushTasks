package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandPaName = reader.readLine(); // дедушка Вася
        Cat grandPa = new Cat(grandPaName, null, null);

        String grandMaName = reader.readLine(); // бабушка Мурка
        Cat grandMa = new Cat(grandMaName, null, null);

        String paName = reader.readLine(); // папа Котофей
        Cat pa = new Cat(paName, null, grandPa);

        String maName = reader.readLine(); // папа Котофей
        Cat ma = new Cat(maName, grandMa, null);

        String sonName = reader.readLine(); // сын Мурчик
        Cat son = new Cat(sonName, ma, pa);

        String daughterName = reader.readLine(); // дочь пушинка
        Cat daughter = new Cat(daughterName, ma, pa);

        System.out.println(grandPa);
        System.out.println(grandMa);
        System.out.println(pa);
        System.out.println(ma);
        System.out.println(son);
        System.out.println(daughter);
    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;

        Cat(String name) { // Вася и Мурка
            this.name = name;
        }


        Cat(String name, Cat mother, Cat father) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        @Override
        public String toString() {
            if (mother != null && father != null)
                return "The cat's name is " + name + ", mother is " + mother.name + ", father is " + father.name;
            if (mother == null && father == null)
                return "The cat's name is " + name + ", no mother, no father";
            if (mother == null)
                return "The cat's name is " + name + ", no mother, father is " + father.name;
            if (father == null)
                return "The cat's name is " + name + ", mother is " + mother.name + ", no father";
            else return  "error";
        }
    }

}
