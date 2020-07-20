package com.github.maly7.streams;

import java.util.List;

public class SumAndReduce {
    public static int calculate(List<Integer> numbers) {
        return numbers.stream()
                .reduce(0, (subtotal, value) -> subtotal + value);
    }
}
