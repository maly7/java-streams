package com.github.maly7.optionals;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class PhoneBook {
    private static final HashMap<String, String> PHONE_NUMBERS = new HashMap<String, String>() {
        {
            put("Jos de Vos", "016/161616");
            put("An de Toekan", "016/161617");
            put("Kris de Vis", "016/161618");
        }
    };

    private HashMap<String, String> phoneBookEntries = PHONE_NUMBERS;

    PhoneBook() { }

    public HashMap<String, String> getPhoneBookEntries() {
        return phoneBookEntries;
    }

    public Optional<String> findPhoneNumberByName(String name){
        return Optional.ofNullable(phoneBookEntries.get(name));
    }

    public Optional<String> findNameByPhoneNumber(String phoneNumber){
        return phoneBookEntries.entrySet()
                .stream()
                .filter(entry -> phoneNumber.equals(entry.getValue()))
                .map(entry -> entry.getKey())
                .findFirst();
//        Another option that inverts the phone book:
//        var invertedPhoneNumbers = phoneBookEntries.entrySet()
//                .stream()
//                .collect(Collectors.toMap(Entry::getValue, Entry::getKey));
//        return Optional.ofNullable(invertedPhoneNumbers.get(phoneNumber));
    }

    @Override
    public String toString() {
        System.out.println("Hello from PhoneBook's toString method");
        return "PhoneBook{" +
                "phoneBookEntries=" + phoneBookEntries +
                '}';
    }
}
