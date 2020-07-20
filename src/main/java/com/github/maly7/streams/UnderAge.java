package com.github.maly7.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UnderAge {
    public static Set<String> getKidNames(List<Person> people) {
        return people.stream()
                .filter(person -> person.getAge() < 18)
                .map(person -> person.getName())
                .collect(Collectors.toSet());
    }
}
