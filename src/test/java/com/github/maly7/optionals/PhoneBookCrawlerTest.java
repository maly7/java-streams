package com.github.maly7.optionals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class PhoneBookCrawlerTest {
    private PhoneBookCrawler phoneBookCrawler;

    @BeforeEach
    void setUp() {
        phoneBookCrawler = new PhoneBookCrawler(new PhoneBook());
    }

    @Test
    public void findPhoneNumberByNameAndPunishIfNothingFound_ShouldReturnExistingPhoneNumber() {
        String phoneNumber = phoneBookCrawler.findPhoneNumberByNameAndPrintPhoneBookIfNothingFound("Jos de Vos");
        assertThat(phoneNumber).isEqualTo("016/161616");
    }

    @Test
    void findPhoneNumberByNameAndPunishIfNothingFound_ShouldThrowIllegalArgumentException() {
        assertThatThrownBy(() -> {
                phoneBookCrawler.findPhoneNumberByNameAndPunishIfNothingFound("Raf de Giraf");
        }).isInstanceOf(IllegalArgumentException.class).hasMessage("No phone number found");
    }

    @Test
    void findPhoneNumberByNameAndReturnEntirePhoneBookIfNothingFound_ShouldReturnExistingPhoneNumber() {
        String phoneNumber = phoneBookCrawler.findPhoneNumberByNameAndPrintPhoneBookIfNothingFound("Jos de Vos");
        assertThat(phoneNumber).isEqualTo("016/161616");
    }

    @Test
    void findPhoneNumberByNameAndReturnEntirePhoneBookIfNothingFound_ShouldReturnEntirePhoneBook() {
        String phonebook =  phoneBookCrawler.findPhoneNumberByNameAndPrintPhoneBookIfNothingFound("Raf de Giraf");
        assertThat(phonebook).isEqualTo("PhoneBook{phoneBookEntries={An de Toekan=016/161617, Jos de Vos=016/161616, Kris de Vis=016/161618}}");
    }

    @Test
    public void findPhoneNumberByNameOrNameByPhoneNumber_foundByName() {
        String phoneNumber = phoneBookCrawler.findPhoneNumberByNameOrNameByPhoneNumber("Kris de Vis", "016/161619");

        assertThat(phoneNumber).isEqualTo("016/161618");
    }

    @Test
    public void findPhoneNumberByNameOrNameByPhoneNumber_foundByPhoneNumber() {
        String name = phoneBookCrawler.findPhoneNumberByNameOrNameByPhoneNumber("Raf de Giraf", "016/161617");

        assertThat(name).isEqualTo("An de Toekan");
    }

    @Test
    public void findPhoneNumberByNameOrNameByPhoneNumber_nothingFoundReturnsJosDeVosPhoneNumber() {
        String name = phoneBookCrawler.findPhoneNumberByNameOrNameByPhoneNumber("Raf de Giraf", "016/161619");

        assertThat(name).isEqualTo("016/161616");
    }
}
