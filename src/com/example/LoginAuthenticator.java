package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class LoginAuthenticator {

    private static LoginAuthenticator singleton;
    private ArrayList<Gebruiker> gebruikers;
    private Gebruiker gebruiker;
    private boolean authenticated;
    private Keuken keuken;

    private LoginAuthenticator() {
        this.keuken=new Keuken();
        authenticated=false;
        gebruikers = new ArrayList<> ();
        gebruikers.addAll(keuken.getGebruikersObjecten());
        gebruiker = null;
    }

    public Gebruiker getLoggedInGebruiker(){return gebruiker;}

    public static LoginAuthenticator getInstance () {

        if (singleton == null) {
            singleton = new LoginAuthenticator();
        }

        return singleton;
    }

    private boolean gebruikerExists (String name) {

        for (Gebruiker gebruiker : gebruikers) {
            if (gebruiker.getGebruikersnaam ().equals (name)) {
                this.gebruiker = gebruiker;
                return true;
            }
        }

        return false;
    }

    public boolean isAuthenticated () {
        if (authenticated ) {
            return true;
        }
        else {

            Scanner scanner = new Scanner(System.in);

            for (int i = 0; i < 5; i++) {
                System.out.println ("=================");
                System.out.print("Wat is je gebruikersnaam? ");
                String userName = scanner.nextLine();
                System.out.print ("Wat is je wachtwoord? ");
                String password = scanner.nextLine();
                System.out.println ("=================");
                if (gebruikerExists (userName) && this.gebruiker.isWachtwoordCorrect(password)) {
                    System.out.println ("Ingelogd");
                    this.gebruiker = keuken.getGebruiker(userName);
                    authenticated = true;
                    break;
                }
                else{
                    System.out.println ("Verkeerde combinatie");
                }
            }
            return authenticated;
        }
    }
}