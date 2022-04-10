package com.javarush.task.task16.task1608;

/* 
Продвижение на политических дебатах
*/

public class Solution {
    public static int totalSpeechCount = 200;
    public static int utterancesPerSpeech = 1000000;

    public static void main(String[] args) throws InterruptedException {
        Politician ivanov = new Politician("Иванов"); //создаем объект с именем Иванов
        Politician petrov = new Politician("Петров"); //создаем объект с именем Петров
        Politician sidorov = new Politician("Сидоров"); //создаем объект с именем Сидоров
        try {
            ivanov.join();
            while (ivanov.getSpeechCount() + petrov.getSpeechCount() + sidorov.getSpeechCount() < totalSpeechCount) {
            }
            // пока сумма общесказанных речей не равна 200, будет постоянно увеличиваться utteranceCount и деление

            System.out.println(ivanov); //выводим toString - ivanov
            System.out.println(petrov); //выводим toString - petrov
            System.out.println(sidorov); //выводим toString - sidorov
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static class Politician extends Thread {
        private volatile int utteranceCount;

        public Politician(String name) {
            super(name); //выводим имена
            start(); //запускаем поток
        }

        public void run() {
            while (utteranceCount < totalSpeechCount * utterancesPerSpeech) {
                utteranceCount++;
            }
            // utteranceCount было равно 0. utteranceCount увеличивается на 1 каждый раз, пока 200*1000000
        }

        public int getSpeechCount() {
            return utteranceCount / utterancesPerSpeech;
        }
        //возвращаем результат деления utteranceCount на 1000000

        @Override
        public String toString() {
            return String.format("%s сказал речь %d раз", getName(), getSpeechCount());
        }
    }
}

