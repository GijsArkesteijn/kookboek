package com.example;

import java.util.Scanner;

public class Menu {
    public Menu() {
        menu();
    }
    public static void menu(){
        Scanner input = new Scanner(System.in);

        //kies een optie
        System.out.println("====================================================");
        System.out.println("1) Gebruikers lijst bekijken");
        System.out.println("2) Recepten bekijken");
        System.out.println("====================================================");
        System.out.println("Voer het cijfer in!");
        System.out.println("====================================================");

        int menuinput = input.nextInt();
        Menuinput(menuinput);

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
                System.out.println(keuken.getGebruiker().getKookboek().getRecepten());

                break;
        }
        menu();
    }
}
