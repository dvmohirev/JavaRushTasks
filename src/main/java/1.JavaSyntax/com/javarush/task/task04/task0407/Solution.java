package com.javarush.task.task04.task0407;

/* 
Кошки во Вселенной
*/

public class Solution {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        //напишите тут ваш код
        Cat.sumCats(25);
        Cat cat2 = new Cat();
        //напишите тут ваш код
        Cat.sumCats(25);  
        System.out.println("The cat count is " + Cat.count);
    }

    public static class Cat {
        public static int count = 0;
        public static void sumCats(int count){
            Cat.count++;
        }
    }
}