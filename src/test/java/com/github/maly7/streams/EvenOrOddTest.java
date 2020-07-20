package com.github.maly7.streams;

import org.junit.jupiter.api.Test;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static org.assertj.core.api.Assertions.assertThat;

class EvenOrOddTest {
    @Test
    public void getString_ShouldOutputEvenOrOddWithNumber() {
        assertThat(EvenOrOdd.getString(asList(3,44))).isEqualTo("odd 3,even 44");
        assertThat(EvenOrOdd.getString(singletonList(3))).isEqualTo("odd 3");
    }
}