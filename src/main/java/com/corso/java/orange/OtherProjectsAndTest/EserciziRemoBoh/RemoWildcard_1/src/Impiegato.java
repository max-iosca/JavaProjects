package com.corso.java.orange.OtherProjectsAndTest.EserciziRemoBoh.RemoWildcard_1.src;

public class Impiegato extends Persona{

    private String ruolo;

    public Impiegato(String nome, String cognome, String codiceFiscale, String ruolo) {
        super(nome, cognome, codiceFiscale);
        this.ruolo = ruolo;
    }

    public String getRuolo() {
        return ruolo;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }

    @Override
    public String toString() {
        return super.toString() + " (Impiegato) ruolo=" + ruolo;
    }
}