package com.javarush.task.task14.task1408;

/*
Куриная фабрика
*/

public abstract class Hen {
    public abstract int getCountOfEggsPerMonth();

    public String getDescription(){
        return "Я - курица.";
    }
}
