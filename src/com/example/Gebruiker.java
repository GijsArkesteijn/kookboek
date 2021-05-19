package com.example;

import java.util.ArrayList;

public class Gebruiker {
    private String gebruikersnaam;
    private String wachtwoord;
    private Kookboek kookboek;
    public Gebruiker( String gebruikersnaam, String wachtwoord, Kookboek boek){
        this.gebruikersnaam=gebruikersnaam;
        this.wachtwoord=wachtwoord;
        this.kookboek=boek;
    }
    public String getGebruikersnaam() {
        return gebruikersnaam;
    }

    public String getWachtwoord() {
        return wachtwoord;
    }

    public Kookboek getKookboek() {
        return kookboek;
    }
}
