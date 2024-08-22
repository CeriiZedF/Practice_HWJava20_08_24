package com.mypackage2;

import java.util.Scanner;

public class City {
    private String cityName;
    private String regionName;
    private String countryName;
    private int population;
    private String postalCode;
    private String phoneCode;

    public City() {
    }

    public City(String cityName, String countryName) {
        this.cityName = cityName;
        this.countryName = countryName;
    }

    public City(String cityName, String regionName, String countryName, int population, String postalCode, String phoneCode) {
        this.cityName = cityName;
        this.regionName = regionName;
        this.countryName = countryName;
        this.population = population;
        this.postalCode = postalCode;
        this.phoneCode = phoneCode;
    }

    public void setPopulation(long population) {
        this.population = (int) population; // Casting long to int
    }

    public void setPopulation(String population) {
        try {
            this.population = Integer.parseInt(population);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input for population. Please enter a valid number.");
        }
    }

    public void inputCityData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter city name: ");
        this.cityName = scanner.nextLine();

        System.out.print("Enter region name: ");
        this.regionName = scanner.nextLine();

        System.out.print("Enter country name: ");
        this.countryName = scanner.nextLine();

        System.out.print("Enter population: ");
        this.population = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter postal code: ");
        this.postalCode = scanner.nextLine();

        System.out.print("Enter phone code: ");
        this.phoneCode = scanner.nextLine();
    }

    public void printCityData() {
        System.out.println("City Name: " + cityName);
        System.out.println("Region Name: " + regionName);
        System.out.println("Country Name: " + countryName);
        System.out.println("Population: " + population);
        System.out.println("Postal Code: " + postalCode);
        System.out.println("Phone Code: " + phoneCode);
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }
}
