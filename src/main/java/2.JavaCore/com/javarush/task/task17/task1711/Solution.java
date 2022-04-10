package com.javarush.task.task17.task1711;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
    private static SimpleDateFormat inputFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);


    public static void main(String[] args) throws Exception {
        //start here - начни тут
        try {
            switch (args[0]) {
                case ("-c"):
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i = i + 3) {
                            String name = args[i];
                            String sex = args[i + 1];
                            Date date = inputFormat.parse(args[i + 2]);
                            Person person = sex.equals("м") ? Person.createMale(name, date) : Person.createFemale(name, date);
                            allPeople.add(person);
                            System.out.println(allPeople.indexOf(person));
                        }
                    }
                    break;
                case "-u":
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i = i + 4) {
                            int id = Integer.parseInt(args[i]);
                            String name = args[i + 1];
                            String sex = args[i + 2];
                            Date date = inputFormat.parse(args[i + 3]);
                            allPeople.get(id).setName(name);
                            allPeople.get(id).setSex("м".equals(sex) ? Sex.MALE : Sex.FEMALE);
                            allPeople.get(id).setBirthDate(date);
                        }
                    }
                    break;
                case ("-d"):
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i++) {
                            Integer id = Integer.parseInt(args[i]);
                            Person person = allPeople.get(i);
                            person.setBirthDate(null);
                            person.setName(null);
                            person.setSex(null);
                            allPeople.set(id, person);
                        }
                    }
                    break;
                case ("-i"):
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i++) {
                            Integer id = Integer.parseInt(args[i]);
                            Person person = allPeople.get(id);
                            String name = person.getName();
                            String sex = person.getSex().equals(Sex.MALE) ? "м" : "ж";
                            String birth = simpleDateFormat.format(person.getBirthDate());
                            System.out.println(name + " " + sex + " " + birth);
                        }
                    }
                    break;
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    private static Sex getSex(String sexParam){
        return sexParam.equals("м") ? Sex.MALE : Sex.FEMALE;
    }
}
