package com.example;

import java.util.Scanner;
import java.util.ArrayList;

public class Menu {
    public Menu(){
        menu();
    }
    public static void menu() {

        Scanner input = new Scanner(System.in);

        //kies een optie
        System.out.println("====================================================");
        System.out.println("1) Recept aanmaken");
        System.out.println("2) Registreren");
        System.out.println("3) Recept opvragen op naam");
        System.out.println("====================================================");
        System.out.println("Voer het cijfer in!");
        System.out.println("====================================================");

        int menuinput = input.nextInt();
//        Menuinput(menuinput);

    }
    public static void Menuinput(int menuinput) {

        int input = menuinput;
        Scanner scanner = new Scanner(System.in);
        Recept recept =new Recept("stamppot","aardappelen en nog meer dingen","gewoon koken enzo");

        switch (input) {
            case 1:
                System.out.println("Account aanmaken");
                System.out.println("====================================================");
                System.out.println("Voer de naam van het recept in");
                String naam = scanner.nextLine();
                System.out.println("Voer de ingredienten in");
                String ingredienten = scanner.nextLine();
                System.out.println("Voer de bereidingswijze in");
                String bereidingswijze = scanner.nextLine();
                scanner.nextLine();
                Recept aangemaakteRecept = new Recept(naam, ingredienten, bereidingswijze);
                break;
            case 2:
                System.out.println("Registreren");
                System.out.println("====================================================");
                System.out.println("Voer de naam van je kook boek in");
                String naamkookboek = scanner.nextLine();
                Kookboek kookboek=new Kookboek("Gijs zijn kookboek");
                System.out.println("Voer je leeftijd in");
                int leeftijd = scanner.nextInt();
                kookboek.accountVoorwaarden(leeftijd);
                break;
            case 3:
                System.out.println("Nieuwe student inschrijven");
                break;
        }
    }
}
