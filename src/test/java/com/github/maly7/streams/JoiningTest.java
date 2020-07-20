package com.github.maly7.streams;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.github.maly7.streams.Joining.namesToString;
import static org.assertj.core.api.Assertions.assertThat;

class JoiningTest {
    @Test
    public void namesToString_ShouldReturnPeopleNamesSeparatedByComma() {
        Person sara = Person.builder().name("Sara").age(4).build();
        Person viktor = Person.builder().name("Viktor").age(40).build();
        Person eva = Person.builder().name("Eva").age(42).build();
        List<Person> collection = List.of(sara, viktor, eva);
        assertThat(namesToString(collection))
                .isEqualTo("Names: Sara, Viktor, Eva.");
    }
}