package com.codecool.service;

import com.codecool.model.Match;
import com.codecool.model.Persona;
import com.codecool.model.Sign;

import java.time.LocalDate;
import java.util.Arrays;

public class MatchCalculatorImpl implements MatchCalculator {
    private final SignCalculator signCalculator;
    private final PersonaProvider personaProvider;

    public MatchCalculatorImpl(SignCalculator signCalculator, PersonaProvider personaProvider) {
        this.signCalculator = signCalculator;
        this.personaProvider = personaProvider;
    }

    @Override
    public Match calculate(LocalDate birthdate1, LocalDate birthdate2) {
        Sign sign1 = signCalculator.calculateSign(birthdate1);
        Sign sign2 = signCalculator.calculateSign(birthdate2);

        Persona persona1 = personaProvider.findPersona(sign1);
        Persona persona2 = personaProvider.findPersona(sign2);


        if (Arrays.asList(persona1.getGoodMatches()).contains(sign2) &&
                Arrays.asList(persona2.getGoodMatches()).contains(sign1)) {
            return Match.Good;
        } else if (Arrays.asList(persona1.getBadMatches()).contains(sign2) &&
                Arrays.asList(persona2.getBadMatches()).contains(sign1)) {
            return Match.Bad;
        } else {
            return Match.Average;
        }
    }
}
