package com.corso.java.orangee.OtherProjectsAndTest.Hangman.max;

public class Giocatore {
    private String nome;
    private int nrTentativi;
    private int nrVittorie;

    public Giocatore(String nome) {
        this.nome = nome;
        this.nrTentativi = 0;
        this.nrVittorie = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getNrTentativi() {
        return nrTentativi;
    }

    public void setNrTentativi(int nrTentativi) {
        this.nrTentativi = nrTentativi;
    }

    public int getNrVittorie() {
        return nrVittorie;
    }

    public void setNrVittorie(int nrVittorie) {
        this.nrVittorie = nrVittorie;
    }
}
