package com.mypackage1;

import java.time.LocalDate;
import java.util.Random;

public class HumanFactory {

    private static final String[] firstNames = {"Ivan", "Petr", "Sergey", "Alexey", "Vladimir"};
    private static final String[] lastNames = {"Ivanov", "Petrov", "Sidorov", "Smirnov", "Kuznetsov"};
    private static final String[] middleNames = {"Ivanovich", "Petrovich", "Sergeevich", "Alexeevich", "Vladimirovich"};
    private static final String[] cities = {"Kyiv", "Moscow", "Minsk", "Warsaw", "Prague"};
    private static final String[] countries = {"Ukraine", "USA", "Belarus", "Poland", "Czech Republic"};
    private static final String[] addresses = {"123 Main St", "456 Oak Ave", "789 Maple Blvd", "101 Pine Rd", "202 Cedar Ln"};

    public static Human createRandomHuman() {
        Random rand = new Random();
        Human human = new Human();
        human.setFirstName(firstNames[rand.nextInt(firstNames.length)]);
        human.setLastName(lastNames[rand.nextInt(lastNames.length)]);
        human.setPatronymic(middleNames[rand.nextInt(middleNames.length)]);
        human.setCity(cities[rand.nextInt(cities.length)]);
        human.setCountry(countries[rand.nextInt(countries.length)]);
        human.setHomeAddress(addresses[rand.nextInt(addresses.length)]);
        human.setDateOfBirth(generateBirthDate());
        human.setPhone(generatePhoneNumber());
        return human;
    }

    private static String generatePhoneNumber() {
        Random rand = new Random();
        return "+38" + (rand.nextInt(900000000) + 100000000);
    }

    private static LocalDate generateBirthDate() {
        Random rand = new Random();
        int year = rand.nextInt(50) + 1970;
        int month = rand.nextInt(12) + 1;
        int day = rand.nextInt(28) + 1;
        return LocalDate.of(year, month, day);
    }
}
