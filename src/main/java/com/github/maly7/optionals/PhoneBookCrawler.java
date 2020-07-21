package com.github.maly7.optionals;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class PhoneBookCrawler {
    @Getter
    private final PhoneBook phoneBook;

//<editor-fold desc="hint" defaultstate="collapsed">
// HINT: https://www.baeldung.com/java-optional
// HINT: https://www.baeldung.com/java-optional-or-else-vs-or-else-get
//</editor-fold>
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
