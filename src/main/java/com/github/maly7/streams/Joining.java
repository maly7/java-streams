package com.github.maly7.streams;

import java.util.List;
import java.util.stream.Collectors;

public class Joining {
    public static String namesToString(List<Person> people) {
        var names = people.stream()
                .map(person -> person.getName())
                .collect(Collectors.joining(", "));
        return "Names: " + names + ".";
    }
}
