package com.example;

import java.util.ArrayList;

public class Kookboek {
    String naam;
    ArrayList<Recept> recepten;
    public Kookboek(String naam){
        this.naam=naam;
        this.recepten=new ArrayList<Recept>();
        recepten.add(new Recept("boerenkool", "aardappel en boerenkool","lang koken enzo"));
        recepten.add(new Recept("kip met rijst", "Kip en rijst","koken en bakken en klaar"));
        recepten.add(new Recept("Recept naam", "ingredienten","bereidingswijze"));
    }

    public String getNaam() {
        return naam;
    }

    public String getRecepten() {
        String recepte="";
        for(Recept recept : recepten){
            if (recepte.equals("")){

                recepte = recepte+ recept.getNaam();
            }else{
                recepte = recepte+", "+ recept.getNaam();
            }
        }
        return recepte;
    }
}

