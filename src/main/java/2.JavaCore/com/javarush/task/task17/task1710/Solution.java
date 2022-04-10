package com.javarush.task.task17.task1710;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    static SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

    public static void main(String[] args) throws Exception {
        args[0] = "-r";
        args[1] = "1";
        //args[2] = "м";
        //args[3] = "15/04/1990";
        //напишите тут ваш код
        if (args[0].equals("-c")){
            if (args[2].equals("м")){
                allPeople.add(Person.createMale(args[1], simpleDateFormat.parse(args[3])));
            } else if (args[2] == "ж"){
                allPeople.add(Person.createFemale(args[1], simpleDateFormat.parse(args[3])));
            }
            System.out.println(allPeople.size()-1);
        }
        if (args[0].equals("-r")){
            Person people = allPeople.get(Integer.parseInt(args[1]));
            Date date = people.getBirthDate();
            System.out.println(people.getName() + " " + (people.getSex() == Sex.MALE ? "м" : "ж") + " " + simpleDateFormat2.format(date));

        }
        if (args[0].equals("-u")){
            Person person = allPeople.get(Integer.parseInt(args[1]));
            person.setName(args[2]);
            person.setSex(getSex(args[3]));

        }
        if (args[0].equals("-d")){
            allPeople.set(Integer.parseInt(args[0]), null);
        }
        /*for (int i = 0; i < allPeople.size(); i++) {
            System.out.println(allPeople.get(i));
        }*/

    }

    private static Sex getSex(String sexParam){
        return sexParam.equals("м") ? Sex.MALE : Sex.FEMALE;
    }
}
