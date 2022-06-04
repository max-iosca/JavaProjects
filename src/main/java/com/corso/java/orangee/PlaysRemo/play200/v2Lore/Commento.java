package com.corso.java.orangee.PlaysRemo.play200.v2Lore;

import java.time.LocalDate;

public class Commento implements Comparable<Commento> {
    private String testoCommento;
    private LocalDate dataCommento;
    private Utente autoreCommento;
    private Post post;

    public Commento(String testoCommento, Utente autore, Post post) {
        this.testoCommento = testoCommento;
        this.dataCommento = LocalDate.now();
        this.autoreCommento = autore;
        this.post = post;
    }

    public String getTestoCommento() {
        return testoCommento;
    }

    public void setTestoCommento(String testoCommento) {
        this.testoCommento = testoCommento;
    }

    public LocalDate getDataCommento() {
        return dataCommento;
    }

    public void setDataCommento(LocalDate dataCommento) {
        this.dataCommento = dataCommento;
    }

    public Utente getAutoreCommento() {
        return autoreCommento;
    }

    public void setAutoreCommento(Utente autoreCommento) {
        this.autoreCommento = autoreCommento;
    }


    @Override
    public int compareTo(Commento o) {
        return this.dataCommento.compareTo(o.getDataCommento());
    }

    @Override
    public String toString() {
        return "Commento : " + testoCommento + " del " + dataCommento + " su post : " + post.getTitoloPost();
    }
}
