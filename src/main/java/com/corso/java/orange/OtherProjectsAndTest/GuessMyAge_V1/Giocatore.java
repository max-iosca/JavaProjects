package com.corso.java.orange.OtherProjectsAndTest.GuessMyAge_V1;

public class Giocatore extends Persona{
    private int numeroDiVittorie;
    public Giocatore(String nome, Integer eta) {
        super(nome, eta);
        this.numeroDiVittorie = 0;
    }

    public int getNumeroDiVittorie() {
        return numeroDiVittorie;
    }
    //com ele aumentiamo le vittorie?! ci serve un metodo!
    public int aggiungiVittorie(){
        return numeroDiVittorie++;
    }

    @Override
    public String toString() {
        return "GIOCATORE ATTUALE: " + getNome();
    }

}
