package com.github.maly7.streams;

import java.util.Arrays;

public class LetterCount {
    public static int getTotalNumberOfLettersOfNamesLongerThanFive(String... names) {
        return Arrays.stream(names)
                .filter(name -> name.length() > 5)
                .mapToInt(name -> name.length())
                .sum();
    }
}
