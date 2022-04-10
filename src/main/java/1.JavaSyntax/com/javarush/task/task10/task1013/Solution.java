package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private int height;
        private int weight;
        private boolean sex;
        private String colorOfSkin;
        private int age;
        private boolean haveKids;

        public Human (int height){
            this.height = height;
        }

        public Human(int height, int weight){
            this.height = height;
            this.weight = weight;
        }

        public Human (boolean sex){
            this.sex = sex;
        }
        public Human (String colorOfSkin){
            this.colorOfSkin = colorOfSkin;
        }
        public Human (int height, int weight, int age){
            this.height = height;
            this.weight = weight;
            this.age = age;
        }
        public Human (int height, boolean haveKids){
            this.height = height;
            this.haveKids = haveKids;
        }
        public Human (int height, int weight, int age, boolean sex){
            this.height = height;
            this.weight = weight;
            this.age = age;
            this.sex = sex;
        }
        public Human (int height, boolean haveKids, int weight, int age){
            this.height = height;
            this.weight = weight;
            this.age = age;
            this.haveKids = haveKids;
        }
        public Human (boolean sex, String colorOfSkin){
            this.sex = sex;
            this.colorOfSkin = colorOfSkin;
        }
        public Human (String colorOfSkin, boolean haveKids){
            this.sex = sex;
            this.haveKids = haveKids;
        }
    }
}
