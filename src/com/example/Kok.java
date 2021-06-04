package com.example;

public abstract class Kok {
    private String naam;
    public Kok(String naam){
        this.naam= naam;
    }
    public String klaarmaken(){

        return "Wordt klaargemaakt";
    }
    public String getNaam(){
        return naam;
    }
}
