package com.codecool.ui;

import com.codecool.model.Match;
import com.codecool.service.MatchCalculator;

import java.time.LocalDate;

public class FengShuiMatchCalculatorUi {

    private final MatchCalculator matchCalculator;

    public FengShuiMatchCalculatorUi(MatchCalculator matchCalculator) {
        this.matchCalculator = matchCalculator;
    }

    public void run() {
        displayWelcomeMessage();
        LocalDate birthdate1 = getBirthDate(1);
        LocalDate birthdate2 = getBirthDate(2);

        Match match = matchCalculator.calculate(birthdate1, birthdate2);
        System.out.println("Feng shui match result: " + match);
    }

    private void displayWelcomeMessage() {
        System.out.println("*** FENG SHUI MATCH CALCULATOR ***");
    }

    private LocalDate getBirthDate(int person) {
        // Implement the method to get the birthdate for each person
        return null;
    }
}