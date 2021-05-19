package com.example;

import java.util.ArrayList;

public class Keuken {
    private ArrayList<Gebruiker> gebruikers;
    public Keuken(){
        this.gebruikers=new ArrayList();
        Gebruiker Gijs = new Gebruiker("Gijs","wachtwoord",new Kookboek("Gijs zijn kookboek"));
        Gebruiker Kees = new Gebruiker("Kees","wachtwoord",new Kookboek("Kees zijn kookboek"));
        Gebruiker Piet = new Gebruiker("Piet","wachtwoord",new Kookboek("Piet zijn kookboek"));
        this.gebruikers.add(Gijs);
        this.gebruikers.add(Kees);
        this.gebruikers.add(Piet);
    }

    public String getGebruikersLijst() {
        String goeie = "";

        for (Gebruiker gebruiker : gebruikers) {
            if (goeie.equals("")){

                goeie = goeie+ gebruiker.getGebruikersnaam();
            }else{
                goeie = goeie+", "+ gebruiker.getGebruikersnaam();
            }
        }
        return goeie;
    }


    public Gebruiker getGebruiker() {
        Gebruiker goeie = null;
        String naam = "Gijs";
        for (Gebruiker student : gebruikers) {
            if (naam.equals( student.getGebruikersnaam())) {
                goeie = student;
            }
        }
        return goeie;
    }
}
