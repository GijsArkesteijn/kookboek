package com.example;

public abstract class Kok {
    private String naam;
    public Kok(String naam){
        this.naam= naam;
    }
    public abstract String klaarmaken(Recept recept);

    public String getNaam(){
        return naam;
    }
}
