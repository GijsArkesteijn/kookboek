package com.example;

public class StoomKok extends Kok {
    public StoomKok(String naam){
        super(naam);
    }

    @Override
    public String klaarmaken() {
        return "Wordt gestoomd";
    }
}
