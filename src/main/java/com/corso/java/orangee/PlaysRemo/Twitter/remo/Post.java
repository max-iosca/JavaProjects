package com.corso.java.orangee.PlaysRemo.Twitter.remo;

import java.time.LocalDateTime;

public class Post {
    private String testo;
    private LocalDateTime dataReg;
    private Utente autore;

    public Post(String testo, Utente autore) {
        this.testo = testo;
        this.autore = autore;
        this.dataReg = LocalDateTime.now();
    }

    public String getTesto() {
        return testo;
    }

    public void setTesto(String testo) {
        this.testo = testo;
    }

    public LocalDateTime getDataReg() {
        return dataReg;
    }

    public Utente getAutore() {
        return autore;
    }

    public void setAutore(Utente autore) {
        this.autore = autore;
    }
}
