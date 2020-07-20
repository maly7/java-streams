package com.github.maly7.streams;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import static com.github.maly7.streams.PartitionBy.partitionAdults;
import static org.assertj.core.api.Assertions.assertThat;

class PartitionByTest {
    @Test
    void partitionAdultsShouldSeparateKidsFromAdults() {
        Person sara = Person.builder().name("Sara").age(4).build();
        Person viktor = Person.builder().name("Viktor").age(40).build();
        Person eva = Person.builder().name("Eva").age(42).build();
        List<Person> collection = List.of(sara, eva, viktor);
        Map<Boolean, List<Person>> result = partitionAdults(collection);
        assertThat(result.get(true)).hasSameElementsAs(List.of(viktor, eva));
        assertThat(result.get(false)).hasSameElementsAs(Collections.singletonList(sara));
    }
}