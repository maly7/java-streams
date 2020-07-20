package com.github.maly7.streams;

import java.util.List;

public class MaxAndComparator {
    public static Person getOldestPerson(List<Person> people) {
        Person oldestPerson = Person.builder().name("").age(0).build();
        for (Person person : people) {
            if (person.getAge() > oldestPerson.getAge()) {
                oldestPerson = person;
            }
        }
        return oldestPerson;
    }

}
