package com.codecool.service;

import com.codecool.model.Sign;

import java.time.LocalDate;

public class SignCalculatorImpl implements SignCalculator {
    @Override
    public Sign calculateSign(LocalDate birthdate) {
        int year = birthdate.getYear();
        int remainder = year % 12;
        Sign[] signs = Sign.values();
        return signs[remainder];
    }
}
