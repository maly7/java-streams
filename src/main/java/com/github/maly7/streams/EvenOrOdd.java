package com.github.maly7.streams;

import java.util.List;
import java.util.stream.Collectors;

public class EvenOrOdd {
    public static String getString(List<Integer> list) {
        return list.stream()
                .map(value -> value % 2 == 0 ? "even " + value : "odd " + value)
                .collect(Collectors.joining(", "));
    }

}
