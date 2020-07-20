package com.github.maly7.streams;

import java.util.Comparator;
import java.util.List;

public class MaxAndComparator {
    public static Person getOldestPerson(List<Person> people) {
        return people.stream()
                .max(Comparator.comparingInt(person -> person.getAge()))
                .get();
    }

}
