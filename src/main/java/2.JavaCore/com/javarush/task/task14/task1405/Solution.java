package com.javarush.task.task14.task1405;

/* 
Пора покушать
*/

import java.sql.SQLOutput;

public class Solution {
    public static void main(String[] args) {
        Food food = new Food();
        Selectable selectable = new Food();

        callFoodMethods(food);
        callSelectableMethods(selectable);
    }

    public static void callFoodMethods(Food food) {
        food.onSelect();
        food.onEat();
        //тут добавьте вызов методов для переменной food
    }

    public static void callSelectableMethods(Selectable selectable) {
        //тут добавьте вызов методов для переменной selectable
        selectable.onSelect();
    }

    interface Selectable {
        void onSelect();
    }

    static class Food implements Selectable{
        public void onEat() {
            System.out.println("The food was eaten");
        }
        public void onSelect(){
            System.out.println("The food was selected");
        }
    }
}