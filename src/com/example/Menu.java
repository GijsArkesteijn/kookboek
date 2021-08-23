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
                keuken.printGebruikersLijst();
                break;
            case 2:
                keuken.printRecepten();
                break;
            case 3:
                keuken.printBereidingDoorKok();
                break;
        }
        menu();
    }

}
