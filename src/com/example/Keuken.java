package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Keuken {
    private ArrayList<Gebruiker> gebruikers;
    private ArrayList<Kok> koks;
    LoginAuthenticator loginAuthenticator;
    Scanner scanner = new Scanner(System.in);

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

    public String printBereidingDoorKok(){
        printRecepten();
        int receptNummer =scanner.nextInt()-1;
        loginAuthenticator = LoginAuthenticator.getInstance ();
        Recept teBereidenRecept = getGebruiker(loginAuthenticator.getLoggedInGebruiker().getGebruikersnaam()).getKookboek().getReceptenObjectOpNummer(receptNummer);
        String bereidingDoorKok = teBereidenRecept.bereidenReceptDoorKok(teBereidenRecept,getKoks());

        return bereidingDoorKok;
    }

    public String getGebruikersLijst() {
        String gerbruikers = null;
        for (Gebruiker gebruiker : gebruikers) {
            gerbruikers += (gebruiker.equals("") ? "" : ", ");
            gerbruikers += gebruiker.getGebruikersnaam();
        }
        return gerbruikers;
    }

    public void printRecepten(){ System.out.println(LoginAuthenticator.getInstance().getLoggedInGebruiker().getKookboek().getRecepten()) ; }

    public ArrayList<Gebruiker> getGebruikersObjecten(){
        return gebruikers;
    }

    public ArrayList<Kok> getKoks(){
        return koks;
    }

    public Gebruiker getGebruiker(String naam) {
        Gebruiker gebruiker = null;
        for (Gebruiker student : gebruikers) {
            if (naam.equals( student.getGebruikersnaam())) {
                gebruiker = student;
            }
        }
        return gebruiker;
    }
}