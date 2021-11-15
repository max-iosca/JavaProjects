package com.corso.java.orange.PlaysRemo.play170;

import java.util.HashSet;
import java.util.Set;

public class Medico {

    private String cognome;
    private String specializzazione;
    private Set<Paziente> pazienti;

    public Medico(String cognome, String specializzazione) {
        this.cognome = cognome;
        this.specializzazione = specializzazione;
        this.pazienti = new HashSet<>();
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getSpecializzazione() {
        return specializzazione;
    }

    public void setSpecializzazione(String specializzazione) {
        this.specializzazione = specializzazione;
    }

    public Set<Paziente> getPazienti() {
        return pazienti;
    }

    public void aggiungiPaziente(Paziente paziente) {
        pazienti.add(paziente);
    }
}
