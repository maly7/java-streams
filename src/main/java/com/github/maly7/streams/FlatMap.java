package com.github.maly7.streams;

import java.util.ArrayList;
import java.util.List;

public class FlatMap {
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
