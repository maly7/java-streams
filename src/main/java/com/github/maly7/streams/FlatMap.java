package com.github.maly7.streams;

import java.util.ArrayList;
import java.util.List;

public class FlatMap {
//<editor-fold desc="hint" defaultstate="collapsed">
// HINT: https://www.baeldung.com/java-difference-map-and-flatmap
//</editor-fold>
    public static List<String> transform(List<List<String>> collection) {
        List<String> newCollection = new ArrayList<>();
        for (List<String> subCollection : collection) {
            for (String value : subCollection) {
                newCollection.add(value);
            }
        }
        return newCollection;
    }
}
