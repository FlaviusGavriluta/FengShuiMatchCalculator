package com.codecool.model;

public record Persona(Sign sign, Sign[] goodMatches, Sign[] badMatches) {
    public Object getGoodMatches() {
        return 0;
    }

    public Object getBadMatches() {
        return 0;
    }
}