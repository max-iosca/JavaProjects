package com.corso.java.orangee.OtherProjectsAndTest.EserciziRemoBoh.RemoWildcard_1.src;

public class Programmatore extends Impiegato{

    private String specializzazione;

    public Programmatore(String nome, String cognome, String codiceFiscale, String ruolo, String specializzazione) {
        super(nome, cognome, codiceFiscale, ruolo);
        this.specializzazione = specializzazione;
    }

    public String getSpecializzazione() {
        return specializzazione;
    }

    public void setSpecializzazione(String specializzazione) {
        this.specializzazione = specializzazione;
    }

    @Override
    public String toString() {
        return super.toString() + ", (Prorammatore) specializzazione=" + specializzazione;
    }
}