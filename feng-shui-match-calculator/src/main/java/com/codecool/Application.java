package com.codecool;

import com.codecool.service.PersonaProvider;
import com.codecool.service.PersonaProviderImpl;

class Program
{
    static void main(String[] args)
    {
        PersonaProvider personaProvider = new PersonaProviderImpl();
    }
}