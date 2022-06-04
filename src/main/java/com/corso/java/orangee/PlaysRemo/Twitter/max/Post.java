package com.corso.java.orangee.PlaysRemo.Twitter.max;

import java.time.LocalDate;

public class Post {

    private String testo;
    private LocalDate dataReg;
    private Utente autore;

    public Post(String testo, Utente autore) {
        this.testo = testo;
        this.autore = autore;
        this.dataReg = LocalDate.now();
    }

    public String getTesto() {
        return testo;
    }

    public void setTesto(String testo) {
        this.testo = testo;
    }

    public LocalDate getDataReg() {
        return dataReg;
    }

    public void setDataReg(LocalDate dataReg) {
        this.dataReg = dataReg;
    }

    public Utente getAutore() {
        return autore;
    }

    public void setAutore(Utente autore) {
        this.autore = autore;
    }
}
