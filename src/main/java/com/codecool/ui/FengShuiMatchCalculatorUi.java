package com.codecool.ui;

import com.codecool.model.Match;
import com.codecool.service.MatchCalculator;

import static java.lang.System.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

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
        displayMatchResult(match);
    }

    private void displayWelcomeMessage() {
        out.println("*** FENG SHUI MATCH CALCULATOR ***");
    }

    private void displayMatchResult(Match match) {
        out.println("Feng Shui match result: " + match);
    }

    private LocalDate getBirthDate(int person) {
        Scanner scanner = new Scanner(in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        out.println("Enter birthdate for Person " + " (yyyy-MM-dd): ");
        String input = scanner.nextLine();
        return LocalDate.parse(input, formatter);
    }
}