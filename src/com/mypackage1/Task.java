package com.mypackage1;

import com.mypackage3.Country;
import com.package4.Fraction;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Task {
    public static void main(String[] args) {
        Human randomHuman = HumanFactory.createRandomHuman();
        randomHuman.printHumanField();

        Human human = new Human();
        human.setFullName("Vanja", "Kolov");
        human.printHumanField();

        Fraction fraction = new Fraction();
        fraction.inputFractionData();
        fraction.displayFraction();

        Book book = new Book();
        book.inputBookData();
        book.displayBookData();

        Car car = new Car();
        car.inputCarData();
        car.displayCarData();
    }


}