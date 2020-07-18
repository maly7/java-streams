package com.github.maly7.javastreams;

import org.junit.jupiter.api.Test;

import static com.github.maly7.javastreams.LetterCount.getTotalNumberOfLettersOfNamesLongerThanFive;
import static org.assertj.core.api.Assertions.assertThat;

class LetterCountTest {
    @Test
    void test() {
        assertThat(getTotalNumberOfLettersOfNamesLongerThanFive("william", "jones", "aaron", "seppe", "frank", "gilliam"))
                .isEqualTo(14);

        assertThat(getTotalNumberOfLettersOfNamesLongerThanFive("aaron")).isEqualTo(0);
    }
}