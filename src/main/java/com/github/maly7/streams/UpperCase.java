package com.github.maly7.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class UpperCase {
    public static Collection<String> mapToUppercase(String... names) {
        return Arrays.stream(names)
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());
    }
}
