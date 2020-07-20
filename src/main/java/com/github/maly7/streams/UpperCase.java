package com.github.maly7.streams;

import java.util.ArrayList;
import java.util.Collection;

public class UpperCase {
    public static Collection<String> mapToUppercase(String... names) {
        Collection<String> uppercaseNames = new ArrayList<>();
        for(String name : names) {
            uppercaseNames.add(name.toUpperCase());
        }
        return uppercaseNames;
    }
}
