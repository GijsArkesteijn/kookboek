package com.example;

public class KookKok extends Kok {
    public KookKok(String naam){
        super(naam);
    }

    @Override
    public String klaarmaken(Recept recept) {
        return recept.getNaam()+" wordt gekookt door kok "+ this.getNaam();
    }
}
