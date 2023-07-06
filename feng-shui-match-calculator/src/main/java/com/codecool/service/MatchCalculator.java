package com.codecool.service;

import com.codecool.model.Match;

import java.time.LocalDate;

public interface MatchCalculator {
    Match calculate(LocalDate birthdate1, LocalDate birthdate2);
}