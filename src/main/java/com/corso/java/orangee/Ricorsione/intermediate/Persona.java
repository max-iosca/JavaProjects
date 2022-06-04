package com.corso.java.orangee.Ricorsione.intermediate;

public class Persona {
    private String cognome;
    private  String cf;
    private Persona figlio;

    public Persona(String cognome, String cf) {
        this.cognome = cognome;
        this.cf = cf;
        this.figlio = null;
    }

    public Persona aggiungiFiglio(Persona figlio) {
        this.figlio = figlio;
        return figlio;
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

    public Persona getFiglio() {
        return figlio;
    }
}
