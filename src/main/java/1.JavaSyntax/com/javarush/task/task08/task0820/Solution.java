package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<Cat>();

        //напишите тут ваш код
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        return result;
    }

    public static Set<Dog> createDogs() {
        //напишите тут ваш код
        Set<Dog> setDog = new HashSet<Dog>();
        setDog.add(new Dog());
        setDog.add(new Dog());
        setDog.add(new Dog());
        return setDog;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код
        Set<Object> pets = new HashSet<Object>(cats);
        for (Dog findDog: dogs
             ) {
            pets.add(findDog);
        }
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
        Set<Object> copyPets = new HashSet<Object>(pets);
        for (Object removeCat:copyPets
             ) {
            for (Cat cat1:cats
                 ) {
                pets.remove(cat1);
            }
        }
    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        for (Object printSet:pets
             ) {
            System.out.println(printSet);
        }
    }

    //напишите тут ваш код
    public static class Cat{

    }
    public static class Dog{

    }
}
