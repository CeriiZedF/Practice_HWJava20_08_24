package com.mypackage1;

import java.time.LocalDate;
import java.util.Objects;

public class Human {
    private String firstName;
    private String lastName;
    private String patronymic;
    private String phone;
    private String city;
    private String country;
    private String homeAddress;
    private LocalDate dateOfBirth;


    public Human() {
    }


    public Human(String firstName, String lastName, String patronymic, String phone,
                 String city, String country, String homeAddress, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.phone = phone;
        this.city = city;
        this.country = country;
        this.homeAddress = homeAddress;
        this.dateOfBirth = dateOfBirth;
    }


    public Human(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }


    public void setFullName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public void setFullName(String firstName, String patronymic, String lastName) {
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.lastName = lastName;
    }


    public void printHumanField() {
        System.out.println("\t\tHuman");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Patronymic: " + patronymic);
        System.out.println("Phone: " + phone);
        System.out.println("City: " + city);
        System.out.println("Country: " + country);
        System.out.println("Home Address: " + homeAddress);
        System.out.println("Date of Birth: " + dateOfBirth);
    }


    public boolean equals(String firstName, String lastName) {
        return Objects.equals(this.firstName, firstName) && Objects.equals(this.lastName, lastName);
    }


    public boolean equals(String firstName, String patronymic, String lastName) {
        return Objects.equals(this.firstName, firstName) &&
                Objects.equals(this.patronymic, patronymic) &&
                Objects.equals(this.lastName, lastName);
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
