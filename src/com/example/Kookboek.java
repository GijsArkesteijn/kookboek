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

    public String tooString(double a){
        return a+"0";
    }
    public String kostenBerekenen(int leeftijd, int recepten, boolean share, int aantalboeken){
        double totaal=0;
        if (leeftijd<=8){
            totaal= totaal+0;
        }
        else if (leeftijd>=9&&leeftijd<18){
            totaal= totaal+2.5;
        }
        else if(leeftijd>=18){
            totaal= totaal+5.0;
        }

        if (recepten>10){
            totaal= totaal+5.0;
        }

        if (share){
            totaal=totaal+6.5;
        }

        if (aantalboeken>1){
            totaal=totaal+10.0;
        }

        return tooString(totaal);
    }

}

