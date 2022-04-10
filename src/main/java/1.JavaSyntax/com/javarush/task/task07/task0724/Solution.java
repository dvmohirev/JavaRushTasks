package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human grandDad1 = new Human("Дед1", true, 90);
        Human grandDad2 = new Human("Дед2", true, 89);
        Human grandMom1 = new Human("Бабушка1", false, 66);
        Human grandMom2 = new Human("Бабушка2", false, 65);
        Human dad  = new Human("Отец", true, 30, grandDad1, grandMom1);
        Human mom = new Human("Мать", false, 30, grandDad2, grandMom2);
        Human kid1 = new Human("Детка1", true, 10, dad, mom);
        Human kid2 = new Human("Детка2", false, 9, dad, mom);
        Human kid3 = new Human("Детка3", false, 8, dad, mom);
        System.out.println(grandDad1.toString());
        System.out.println(grandDad2.toString());
        System.out.println(grandMom1.toString());
        System.out.println(grandMom2.toString());
        System.out.println(dad.toString());
        System.out.println(mom.toString());
        System.out.println(kid1.toString());
        System.out.println(kid2.toString());
        System.out.println(kid3.toString());
    }

    public static class Human {
        // напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father, mother;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}