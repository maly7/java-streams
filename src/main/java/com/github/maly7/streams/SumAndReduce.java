package com.github.maly7.streams;

import java.util.List;

public class SumAndReduce {
    public static int calculate(List<Integer> numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }
}
