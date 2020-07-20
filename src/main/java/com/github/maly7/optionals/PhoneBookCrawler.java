package com.github.maly7.optionals;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class PhoneBookCrawler {
    @Getter
    private final PhoneBook phoneBook;

    public String findPhoneNumberByNameAndPunishIfNothingFound(String name){
        return null;
    }

    public String findPhoneNumberByNameAndPrintPhoneBookIfNothingFound(String name){
        return null;
    }

    public String findPhoneNumberByNameOrNameByPhoneNumber(String name, String phoneNumber){
        return null;
    }
}
