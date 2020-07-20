package com.github.maly7.streams;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.github.maly7.streams.UnderAge.getKidNames;
import static org.assertj.core.api.Assertions.assertThat;

class UnderAgeTest {
    @Test
    void getKidName_ShouldReturnNamesOfAllKidsUnder18() {
        Person sara = Person.builder().name("Sara").age(4).build();
        Person viktor = Person.builder().name("Viktor").age(40).build();
        Person eva = Person.builder().name("Eva").age(42).build();
        Person anna = Person.builder().name("Anna").age(5).build();
        List<Person> collection = List.of(sara, eva, viktor, anna);
        assertThat(getKidNames(collection))
                .contains("Sara", "Anna")
                .doesNotContain("Viktor", "Eva");
    }
}