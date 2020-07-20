package com.github.maly7.streams;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SumAndReduceTest {
    @Test
    void calculateShouldSumAllNumbers() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        assertThat(SumAndReduce.calculate(numbers)).isEqualTo(1 + 2 + 3 + 4 + 5);
    }
}