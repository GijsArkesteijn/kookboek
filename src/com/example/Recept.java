package com.example;

import java.util.ArrayList;

public class Recept {
    private String naam;
    private String ingredienten;
    private String bereidingswijze;

    public Recept(String naam, String ingredienten, String bereidingswijze){
        this.naam=naam;
        this.ingredienten=ingredienten;
        this.bereidingswijze=bereidingswijze;
    }
    public String receptAanpassen(String naam, String ingredienten, String bereidingswijze){
        if(naam.equals("")||ingredienten.equals("")||bereidingswijze.equals("")){
            return "error";
        }
        else {
            this.naam = naam;
            this.ingredienten = ingredienten;
            this.bereidingswijze = bereidingswijze;
            return naam;
        }

    }

}
