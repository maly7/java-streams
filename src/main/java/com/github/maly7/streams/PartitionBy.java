package com.github.maly7.streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.partitioningBy;

public class PartitionBy {
    public static Map<Boolean, List<Person>> partitionAdults(List<Person> people) {
        return people.stream()
                .collect(partitioningBy(person -> person.getAge() > 18));
    }
}
