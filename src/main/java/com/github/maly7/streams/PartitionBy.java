package com.github.maly7.streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PartitionBy {
//<editor-fold desc="hint" defaultstate="collapsed">
// HINT: https://www.geeksforgeeks.org/collectors-partitioningby-method-in-java/
//</editor-fold>
    public static Map<Boolean, List<Person>> partitionAdults(List<Person> people) {
        Map<Boolean, List<Person>> map = new HashMap<>();
        map.put(true, new ArrayList<>());
        map.put(false, new ArrayList<>());
        for (Person person : people) {
            map.get(person.getAge() >= 18).add(person);
        }
        return map;
    }
}
