package com.example;

import java.util.ArrayList;

public class Recept {
    private String naam;
    private String ingredienten;
    private String bereidingswijze;

    public Recept(String naam, String ingredienten, String bereidingswijze){
        this.naam=naam;
        this.ingredienten=ingredienten;
        this.bereidingswijze=bereidingswijze;
    }

    public String getNaam() {
        return naam;
    }

    public String getBereidingswijze() {
        return bereidingswijze;
    }
    public String bereidenReceptDoorKok(Recept teBereidenRecept, ArrayList<Kok> koks){
        int index = 0;

        if(teBereidenRecept.getBereidingswijze().equals("Koken")){
            index=1;
        }
        return koks.get(index).klaarmaken(teBereidenRecept);
    }
}
