package com.github.maly7.streams;

import java.util.ArrayList;
import java.util.Collection;

public class UpperCase {
//<editor-fold desc="hint" defaultstate="collapsed">
// HINT: https://www.geeksforgeeks.org/arrays-stream-method-in-java/
// HINT: https://mkyong.com/java8/java-8-streams-map-examples/
//</editor-fold>
    public static Collection<String> mapToUppercase(String... names) {
        Collection<String> uppercaseNames = new ArrayList<>();
        for(String name : names) {
            uppercaseNames.add(name.toUpperCase());
        }
        return uppercaseNames;
    }
}