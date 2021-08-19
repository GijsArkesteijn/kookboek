package com.example;

public class StoomKok extends Kok {
    public StoomKok(String naam){
        super(naam);
    }

    @Override
    public String klaarmaken(Recept recept) {
        return recept.getNaam()+ " wordt gestoomd door kok "+ this.getNaam();
    }
}
