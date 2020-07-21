package com.github.maly7.streams;

import java.util.List;

public class Joining {
//<editor-fold desc="hint" defaultstate="collapsed">
// HINT: https://www.geeksforgeeks.org/java-8-streams-collectors-joining-method-with-examples/
//</editor-fold>
    public static String namesToString(List<Person> people) {
        String label = "Names: ";
        StringBuilder sb = new StringBuilder(label);
        for (Person person : people) {
            if (sb.length() > label.length()) {
                sb.append(", ");
            }
            sb.append(person.getName());
        }
        sb.append(".");
        return sb.toString();
    }
}
