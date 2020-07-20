package com.github.maly7.streams;

import org.junit.jupiter.api.Test;

import static com.github.maly7.streams.UpperCase.mapToUppercase;
import static org.assertj.core.api.Assertions.assertThat;

class UpperCaseTest {

    @Test
    void mapToUpperCase_ShouldConverAllStringsToUpperCase() {
        assertThat(mapToUppercase("aaron", "frank", "william", "gilliam"))
                .containsExactlyInAnyOrder("AARON", "FRANK", "WILLIAM", "GILLIAM");

        assertThat(mapToUppercase("cegeka"))
                .containsExactlyInAnyOrder("CEGEKA");
    }
}
