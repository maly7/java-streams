package com.github.maly7.javastreams;

import org.junit.jupiter.api.Test;

import static com.github.maly7.javastreams.UpperCase.mapToUppercase;
import static org.assertj.core.api.Assertions.assertThat;

class UpperCaseTest {

    @Test
    void test() {
        assertThat(mapToUppercase("aaron", "frank", "william", "gilliam"))
                .containsExactlyInAnyOrder("AARON", "FRANK", "WILLIAM", "GILLIAM");

        assertThat(mapToUppercase("cegeka"))
                .containsExactlyInAnyOrder("CEGEKA");
    }
}
