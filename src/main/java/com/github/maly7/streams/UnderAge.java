package com.github.maly7.streams;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UnderAge {
//<editor-fold desc="hint" defaultstate="collapsed">
// HINT: https://www.baeldung.com/java-stream-filter-lambda
// HINT: https://mkyong.com/java8/java-8-streams-map-examples/
//</editor-fold>
    public static Set<String> getKidNames(List<Person> people) {
        Set<String> kids = new HashSet<>();
        for (Person person : people) {
            if (person.getAge() < 18) {
                kids.add(person.getName());
            }
        }
        return kids;
    }
}
