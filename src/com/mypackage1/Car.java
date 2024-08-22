package com.mypackage1;

import java.util.Scanner;

public class Car {
    private String model;
    private String manufacturer;
    private int year;
    private double engineVolume;

    public Car() {
        this.model = "";
        this.manufacturer = "";
        this.year = 0;
        this.engineVolume = 0.0;
    }

    public Car(String model, String manufacturer, int year, double engineVolume) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.year = year;
        this.engineVolume = engineVolume;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void inputCarData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter model: ");
        this.model = scanner.nextLine();
        System.out.print("Enter manufacturer: ");
        this.manufacturer = scanner.nextLine();
        System.out.print("Enter year: ");
        this.year = scanner.nextInt();
        System.out.print("Enter engine volume: ");
        this.engineVolume = scanner.nextDouble();
    }

    public void displayCarData() {
        System.out.println("Model: " + model);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Year: " + year);
        System.out.println("Engine Volume: " + engineVolume);
    }

    public void displayCarData(String format) {
        if ("short".equalsIgnoreCase(format)) {
            System.out.println("Model: " + model + ", Manufacturer: " + manufacturer);
        } else if ("detailed".equalsIgnoreCase(format)) {
            displayCarData();
        } else {
            System.out.println("Unknown format.");
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", year=" + year +
                ", engineVolume=" + engineVolume +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return year == car.year &&
                Double.compare(car.engineVolume, engineVolume) == 0 &&
                model.equals(car.model) &&
                manufacturer.equals(car.manufacturer);
    }

    @Override
    public int hashCode() {
        int result = model.hashCode();
        result = 31 * result + manufacturer.hashCode();
        result = 31 * result + year;
        long temp = Double.doubleToLongBits(engineVolume);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
