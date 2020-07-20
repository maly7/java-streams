package com.github.maly7.streams;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static com.github.maly7.streams.GroupBy.groupByNationality;
import static org.assertj.core.api.Assertions.assertThat;

class GroupByTest {
    @Test
    void groupByNationality_ShouldReturnNationalitiesMappedToPeople() {
        Person sara = new Person("Sara", 4, "Norwegian");
        Person viktor = new Person("Viktor", 40, "Serbian");
        Person eva = new Person("Eva", 42, "Norwegian");
        List<Person> collection = List.of(sara, eva, viktor);
        Map<String, List<Person>> result = groupByNationality(collection);
        assertThat(result.get("Norwegian")).containsExactlyInAnyOrder(sara, eva);
        assertThat(result.get("Serbian")).containsExactlyInAnyOrder(viktor);
    }
}