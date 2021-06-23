package com.example;

import java.util.ArrayList;

public class Keuken {
    private ArrayList<Gebruiker> gebruikers;
    private ArrayList<Kok> koks;

    public Keuken(){
        this.gebruikers=new ArrayList();
        Gebruiker Gijs = new Gebruiker("Gijs","x",new Kookboek("Gijs zijn kookboek"));
        Gebruiker Kees = new Gebruiker("Kees","y",new Kookboek("Kees zijn kookboek"));
        Gebruiker Piet = new Gebruiker("Piet","z",new Kookboek("Piet zijn kookboek"));
        gebruikers.add(Gijs);
        gebruikers.add(Kees);
        gebruikers.add(Piet);

        this.koks=new ArrayList();
        Kok stoomKok = new StoomKok("bert");
        Kok kookKok = new KookKok("geert");
        koks.add(stoomKok);
        koks.add(kookKok);
    }

    public String getGebruikersLijst() {
        String goeie = null;
        for (Gebruiker gebruiker : gebruikers) {
            goeie += (gebruiker.equals("") ? "" : ", ");
            goeie += gebruiker.getGebruikersnaam();
        }
        return goeie;
    }
    public void printGebruikersLijst(){
        System.out.println(getGebruikersLijst());
    }
    public void printRecepten(){
        System.out.println(LoginAuthenticator.getInstance().getLoggedInGebruiker().getKookboek().getRecepten()) ;
    }
    public ArrayList<Gebruiker> getGebruikersObjecten(){
        return gebruikers;
    }

    public ArrayList<Kok> getKoks(){
        return koks;
    }

    public Gebruiker getGebruiker(String naam) {
        Gebruiker goeie = null;
        for (Gebruiker student : gebruikers) {
            if (naam.equals( student.getGebruikersnaam())) {
                goeie = student;
            }
        }
        return goeie;
    }
}
