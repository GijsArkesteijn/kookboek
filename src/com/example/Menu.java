package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private static LoginAuthenticator loginAuthenticator;
    public Menu() {

        menu();
    }
    public static void menu(){
        Scanner input = new Scanner(System.in);

        loginAuthenticator = LoginAuthenticator.getInstance ();

        if (loginAuthenticator.isAuthenticated ()) {

        //kies een optie
        System.out.println("====================================================");
        System.out.println("1) Gebruikers lijst bekijken");
        System.out.println("2) Recepten bekijken");
        System.out.println("3) Recepten bereiden");
        System.out.println("====================================================");
        System.out.println("Voer het cijfer in!");
        System.out.println("====================================================");

        int menuinput = input.nextInt();
        Menuinput(menuinput);

        }
    }

    public static void Menuinput(int menuinputt) {
        int inputt = menuinputt;
        Keuken keuken = new Keuken();
        Scanner scanner = new Scanner(System.in);

        switch (inputt) {
            case 1:
                System.out.println("gebruikers lijst bekijken");
                System.out.println("====================================================");
                System.out.println(keuken.getGebruikersLijst());

                break;
            case 2:
                System.out.println("Recepten bekijken");
                System.out.println("====================================================");
                System.out.println(keuken.getGebruiker(loginAuthenticator.getLoggedInGebruiker().getGebruikersnaam()).getKookboek().getRecepten());

                break;
            case 3:
                System.out.println("Recept bereiden");
                System.out.println("====================================================");
                System.out.println("Kies een recept");
                System.out.println(keuken.getGebruiker(loginAuthenticator.getLoggedInGebruiker().getGebruikersnaam()).getKookboek().getRecepten());
                int receptNummer =scanner.nextInt();
                Gebruiker gebruiker = keuken.getGebruiker(loginAuthenticator.getLoggedInGebruiker().getGebruikersnaam());
                Recept teBereidenRecept = gebruiker.getKookboek().getReceptenObjecten(receptNummer);
                ArrayList<Kok> koks= keuken.getKoks();
                if (teBereidenRecept.getBereidingswijze().equals("Stomen")){
                    System.out.println(teBereidenRecept.getNaam());
                    System.out.println(koks.get(0).getNaam());
                    System.out.println( koks.get(0).klaarmaken());
                }
                else if(teBereidenRecept.getBereidingswijze().equals("Koken")){
                    System.out.println(teBereidenRecept.getNaam());
                    System.out.println(koks.get(1).getNaam());
                    System.out.println(koks.get(1).klaarmaken());
                }
                break;
        }
        menu();
    }
}
