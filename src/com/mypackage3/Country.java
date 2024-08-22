package com.mypackage3;

import java.util.ArrayList;

public class Country {
    private String countryName;
    private String continentName;
    private long population;
    private String phoneCode;
    private String capital;
    private ArrayList<String> cities;

    public Country() {
        this.cities = new ArrayList<>();
    }

    public Country(String countryName, String continentName, long population, String phoneCode, String capital, ArrayList<String> cities) {
        this.countryName = countryName;
        this.continentName = continentName;
        this.population = population;
        this.phoneCode = phoneCode;
        this.capital = capital;
        this.cities = new ArrayList<>(cities);
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setContinentName(String continentName) {
        this.continentName = continentName;
    }

    public String getContinentName() {
        return continentName;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public long getPopulation() {
        return population;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getCapital() {
        return capital;
    }

    public void setCities(ArrayList<String> cities) {
        this.cities = new ArrayList<>(cities);
    }

    public ArrayList<String> getCities() {
        return new ArrayList<>(cities);
    }

    public void addCity(String city) {
        this.cities.add(city);
    }

    public void inputCountryData(String countryName, String continentName, long population, String phoneCode, String capital, ArrayList<String> cities) {
        this.countryName = countryName;
        this.continentName = continentName;
        this.population = population;
        this.phoneCode = phoneCode;
        this.capital = capital;
        this.cities = new ArrayList<>(cities);
    }

    public void displayCountryData() {
        System.out.println("Country Name: " + countryName);
        System.out.println("Continent: " + continentName);
        System.out.println("Population: " + population);
        System.out.println("Phone Code: " + phoneCode);
        System.out.println("Capital: " + capital);
        System.out.println("Cities: " + cities);
    }

    public void displayCity(String cityName) {
        if (cities.contains(cityName)) {
            System.out.println("City: " + cityName);
        } else {
            System.out.println("City not found in the country.");
        }
    }

    public void displayCity(int index) {
        if (index >= 0 && index < cities.size()) {
            System.out.println("City: " + cities.get(index));
        } else {
            System.out.println("City index out of bounds.");
        }
    }
}
