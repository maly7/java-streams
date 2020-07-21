package com.github.maly7.streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupBy {
//<editor-fold desc="hint" defaultstate="collapsed">
// HINT: https://www.baeldung.com/java-groupingby-collector
//</editor-fold>
    public static Map<String, List<Person>> groupByNationality(List<Person> people) {
        Map<String, List<Person>> map = new HashMap<>();
        for (Person person : people) {
            if (!map.containsKey(person.getNationality())) {
                map.put(person.getNationality(), new ArrayList<>());
            }
            map.get(person.getNationality()).add(person);
        }
        return map;
    }
}
