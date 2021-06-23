package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private static LoginAuthenticator loginAuthenticator;
    public Menu() {

        menu();
    }
    public void menu(){
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
    public String getBereidingswijze(Recept teBereidenRecept, ArrayList<Kok> koks){
        String bereidingswijze="";
        if (teBereidenRecept.getBereidingswijze().equals("Stomen")){
            bereidingswijze= koks.get(0).klaarmaken(teBereidenRecept);
        }
        else if(teBereidenRecept.getBereidingswijze().equals("Koken")){
            bereidingswijze = koks.get(1).klaarmaken(teBereidenRecept);
        }
        return bereidingswijze;
    }
    public  void Menuinput(int menuinputt) {
        int inputt = menuinputt;
        Keuken keuken = new Keuken();
        Scanner scanner = new Scanner(System.in);

        switch (inputt) {
            case 1:
                System.out.println("gebruikers lijst bekijken");
                System.out.println("====================================================");
                keuken.printGebruikersLijst();

                break;
            case 2:
                System.out.println("Recepten bekijken");
                System.out.println("====================================================");
                keuken.printRecepten();

                break;
            case 3:
                System.out.println("Recept bereiden");
                System.out.println("====================================================");
                System.out.println("Kies een recept");
                keuken.printRecepten();

                int receptNummer =scanner.nextInt()-1;

                Recept teBereidenRecept = keuken.getGebruiker(loginAuthenticator.getLoggedInGebruiker().getGebruikersnaam()).getKookboek().getReceptenObjecten(receptNummer);
                ArrayList<Kok> koks= keuken.getKoks();

                System.out.println(getBereidingswijze(teBereidenRecept, koks));

                break;
        }
        menu();
    }

}
