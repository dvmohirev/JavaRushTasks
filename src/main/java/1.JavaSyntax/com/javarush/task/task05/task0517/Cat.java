package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    //напишите тут ваш ко
    public String name = null, address = null, color = "black";
    public int age = 2, weight = 3;

    public Cat(String name){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.address = address;
        this.color = color;
    }

    public Cat(String name, int weight, int age){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.address = address;
        this.color = color;
    }

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.address = address;
        this.color = color;
    }

    public Cat(int weight, String color){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.address = address;
        this.color = color;
    }

    public Cat(int weight, String color, String address){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.address = address;
        this.color = color;
    }

    public static void main(String[] args) {

    }
}
