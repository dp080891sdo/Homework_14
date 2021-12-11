package com.sviatukhov;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    private static final int SIZE = 100;

    public static void main(String[] args) {

        String[] arrayFirstName = new String[]{"Dmitriy", "Ivan", "Alex"};
        String[] arrayLastName = new String[]{"Ivanov", "Petrov", "Sidorov"};
        List<Person> persons = new ArrayList<>(SIZE);

        for (int i = 0; i < SIZE; i++) {
            int n = (int) Math.floor(Math.random() * arrayFirstName.length);
            int m = (int) Math.floor(Math.random() * arrayLastName.length);
            int age = (int) (20 + Math.random() * 60);
            int weight = (int) (40 + Math.random() * 100);
            int height = (int) (150 + Math.random() * 60);
            Person person = new Person(arrayFirstName[n], arrayLastName[m], age, weight, height);
            persons.add(person);
        }
        deleteDuplicates(persons);
    }

    private static void deleteDuplicates(List<Person> persons) {
        Set<Person> personSet = new HashSet<>(persons);
        System.out.println("Список с дубликатами");
        System.out.println(persons);
        System.out.println("Дубликаты по имени и фамилии удалены");
        System.out.println(personSet);
    }
}