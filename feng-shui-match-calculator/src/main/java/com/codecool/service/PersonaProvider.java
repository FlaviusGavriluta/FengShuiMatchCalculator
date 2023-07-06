package com.codecool.service;

import com.codecool.model.Persona;
import com.codecool.model.Sign;

public interface PersonaProvider
{
    Persona findPersona(Sign sign);
}