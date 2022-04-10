package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    public String name = null;
    public int age = 3;
    public int weight = 4;
    public String address = null;
    public String color = "black";

    public void initialize(String name){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

    public void initialize(String name, int weight, int age){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

    public void initialize(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

    public void initialize(int weight, String color){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

    public void initialize(int weight, String color, String address){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.address = address;
    }
}
