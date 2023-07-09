package com.codecool.service;

import com.codecool.model.Sign;

import java.time.LocalDate;

public interface SignCalculator {
    Sign calculateSign(LocalDate birthdate);
}
