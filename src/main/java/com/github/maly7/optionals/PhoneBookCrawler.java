package com.github.maly7.optionals;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class PhoneBookCrawler {
    @Getter
    private final PhoneBook phoneBook;

    public String findPhoneNumberByNameAndPunishIfNothingFound(String name){
        return phoneBook.findPhoneNumberByName(name)
                .orElseThrow(() -> new IllegalArgumentException("No phone number found"));
    }

    public String findPhoneNumberByNameAndPrintPhoneBookIfNothingFound(String name){
        return phoneBook.findPhoneNumberByName(name)
                .orElseGet(phoneBook::toString);
    }

    public String findPhoneNumberByNameOrNameByPhoneNumber(String name, String phoneNumber){
        return phoneBook.findPhoneNumberByName(name)
                .orElseGet(() -> phoneBook.findNameByPhoneNumber(phoneNumber)
                .orElseGet(() -> phoneBook.getPhoneBookEntries().get("Jos de Vos")));
    }
}
