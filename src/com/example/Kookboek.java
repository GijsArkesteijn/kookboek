package com.example;

import java.util.ArrayList;

public class Kookboek {
    String naam;
    ArrayList<Recept> recepten;
    public Kookboek(String naam){
        this.recepten=new ArrayList<Recept>();
        if (naam.equals("Gijs zijn kookboek")){
            recepten.add(new Recept("kip met rijst", "Kip en rijst","Stomen"));
            recepten.add(new Recept("Recept naam", "ingredienten","Koken"));
        }
        else if(naam.equals("Kees zijn kookboek")){

            recepten.add(new Recept("Vies", "aardappel en boerenkool","Koken"));
            recepten.add(new Recept("Smerig", "Kip en rijst","Stomen"));
        }
        recepten.add(new Recept("standaart recept", "ingredienten","Stomen"));
        this.naam=naam;
    }

    public String getNaam() {
        return naam;
    }

    public Recept getReceptenObjecten(int receptNummer) {
        Recept recept=null;
        for(int i=0; i<recepten.size();i++){
            if(receptNummer==i){
                recept= recepten.get(i);
            }
        }
        return recept;
    }
    public String getRecepten() {
        String recepte="";
        for(int i=0; i<recepten.size();i++){
                recepte = recepte+(i+1)+": "+ recepten.get(i).getNaam()+"\n";

        }
        return recepte;
    }
}

