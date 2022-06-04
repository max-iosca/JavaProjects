package com.corso.java.orangee.PlaysRemo.play200.v4Git;

import java.time.LocalDateTime;

public class Commento {
    private String testo;
    private Utente autore;
    private LocalDateTime dataRegistrazione;

    public Commento(String testo, Utente autore, LocalDateTime dataRegistrazione) {
        this.testo = testo;
        this.autore = autore;
        this.dataRegistrazione = dataRegistrazione;
    }

    public String getTesto() {
        return testo;
    }

    public Utente getAutore() {
        return autore;
    }

    public LocalDateTime getDataRegistrazione() {
        return dataRegistrazione;
    }
}
