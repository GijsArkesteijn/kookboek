package com.example;

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

    public  void Menuinput(int menuinputt) {
        int inputt = menuinputt;
        Keuken keuken =loginAuthenticator.getKeuken();

        switch (inputt) {
            case 1:
                System.out.println("gebruikers lijst bekijken");
                System.out.println("====================================================");
                System.out.println( keuken.getGebruikersLijst());
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
                System.out.println(keuken.printBereidingDoorKok());
                break;
        }
        menu();
    }

}
