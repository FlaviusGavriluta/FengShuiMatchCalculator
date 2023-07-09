package com.codecool;

import com.codecool.service.*;
import com.codecool.ui.*;

public class Application {
    public static void main(String[] args) {
        PersonaProvider personaProvider = new PersonaProviderImpl();
        SignCalculator signCalculator = new SignCalculatorImpl();
        MatchCalculator matchCalculator = new MatchCalculatorImpl(signCalculator, personaProvider);
        FengShuiMatchCalculatorUi ui = new FengShuiMatchCalculatorUi(matchCalculator);
        ui.run();
    }
}