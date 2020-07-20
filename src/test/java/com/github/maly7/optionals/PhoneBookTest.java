package com.github.maly7.optionals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

class PhoneBookTest {
    private PhoneBook phoneBook;

    @BeforeEach
    void setUp() {
        phoneBook = new PhoneBook();
    }

    @Test
    public void findPhoneNumberByName_NotFound() {
        assertThat(phoneBook.findPhoneNumberByName("Jos de Voss")).isEmpty();
    }

    @Test
    public void findNameByPhoneNumber() {
        Optional<String> name = phoneBook.findNameByPhoneNumber("016/161616");
        assertThat(name.get()).isEqualTo("Jos de Vos");
    }

    @Test
    public void findNameByPhoneNumber_NotFound() {
        assertThat(phoneBook.findPhoneNumberByName("016/161619")).isEmpty();
    }

}