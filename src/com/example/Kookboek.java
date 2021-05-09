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

    }
}
