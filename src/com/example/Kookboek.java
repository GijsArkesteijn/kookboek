package com.example;

import java.util.ArrayList;

public class Kookboek {
    String naam;
    Account account;
    ArrayList<Recept> recepten;
    public Kookboek(String naam, Account account, ArrayList<Recept> recepten){
        this.naam=naam;
        this.account=account;
        this.recepten=new ArrayList<Recept>();
    }
    public Kookboek(String naam){
        this.naam=naam;
    }
    public String accountVoorwaarden(int leeftijd){
        String returnwaarde=null;
        if (leeftijd<=8){
            returnwaarde= "Uw account is gratis aan te maken";
        }
        if (leeftijd>8&&leeftijd<18){
            returnwaarde= "Uw Account kost 2,50";
        }
        if(leeftijd>=18){
            returnwaarde= "Uw Account kost 5,00";
        }
        return returnwaarde;
    }
}
