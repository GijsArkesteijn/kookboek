package com.example;

public class KookKok extends Kok {
    public KookKok(String naam){
        super(naam);
    }

    @Override
    public String klaarmaken() {
        return "Wordt gekookt";
    }
}
