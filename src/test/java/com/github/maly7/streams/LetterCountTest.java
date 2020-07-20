package com.github.maly7.streams;

import org.junit.jupiter.api.Test;

import static com.github.maly7.streams.LetterCount.getTotalNumberOfLettersOfNamesLongerThanFive;
import static org.assertj.core.api.Assertions.assertThat;

class LetterCountTest {
    @Test
    void getTotalNumberOfLettersOfNamesLongerThanFive_ShouldReturnTheCountOfLettersInNamesWithLengthGreaterThanFive() {
        assertThat(getTotalNumberOfLettersOfNamesLongerThanFive("william", "jones", "aaron", "seppe", "frank", "gilliam"))
                .isEqualTo(14);

        assertThat(getTotalNumberOfLettersOfNamesLongerThanFive("aaron")).isEqualTo(0);
    }
}