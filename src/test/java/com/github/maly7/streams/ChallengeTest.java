package com.github.maly7.streams;

import org.junit.jupiter.api.Test;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static org.assertj.core.api.Assertions.assertThat;

class ChallengeTest {
    @Test
    public void getStringShouldOutputEvenUnevenString() {
        assertThat(Challenge.getString(asList(3,44))).isEqualTo("o3,e44");
        assertThat(Challenge.getString(singletonList(3))).isEqualTo("o3");
    }
}