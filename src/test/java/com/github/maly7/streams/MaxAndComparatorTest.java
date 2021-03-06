package com.github.maly7.streams;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class MaxAndComparatorTest {
    @Test
    void getOldestPerson_ShouldReturnPersonWithLargestAge() {
        Person sara = Person.builder().name("Sara").age(4).build();
        Person viktor = Person.builder().name("Viktor").age(45).build();
        Person eva = Person.builder().name("Eva").age(42).build();
        List<Person> collection = List.of(sara, eva, viktor);
        assertThat(MaxAndComparator.getOldestPerson(collection)).isEqualToComparingFieldByField(viktor);
    }
}