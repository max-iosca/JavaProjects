package com.corso.java.orangee.PlaysRemo.play170;

import java.util.Objects;

public class Paziente {

    private String cognome;
    private String cf;
    private int nrVisiteRichieste;

    public Paziente(String cognome, String cf) {
        this.cognome = cognome;
        this.cf = cf;
        this.nrVisiteRichieste = 0;
    }

    public void aggiungiVisitaRichiesta() {
        this.nrVisiteRichieste++;
    }


    public int getNrVisiteRichieste() {
        return nrVisiteRichieste;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Paziente paziente = (Paziente) o;
        return Objects.equals(cognome, paziente.cognome) && Objects.equals(cf, paziente.cf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cognome, cf);
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCf() {
        return cf;
    }

    public void setCf(String cf) {
        this.cf = cf;
    }
}
