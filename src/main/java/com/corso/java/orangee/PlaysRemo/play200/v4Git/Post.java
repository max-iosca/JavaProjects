package com.corso.java.orangee.PlaysRemo.play200.v4Git;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Post {

    private Long id;
    private String titolo;
    private String testo;
    private LocalDateTime dataRegistrazione;
    private Utente autore;
    private List<Commento> commenti;

    private static long counter = 1;

    public Post(String titolo, String testo, Utente autore, LocalDateTime dataRegistrazione) {
        this.id = counter++;
        this.titolo = titolo;
        this.testo = testo;
        this.dataRegistrazione = dataRegistrazione;
        this.autore = autore;
        this.commenti = new ArrayList<>();
    }

    public void aggiungiCommento(Commento commento) {
        this.commenti.add(commento);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return Objects.equals(id, post.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String getTitolo() {
        return titolo;
    }

    public String getTesto() {
        return testo;
    }

    public LocalDateTime getDataRegistrazione() {
        return dataRegistrazione;
    }

    public Utente getAutore() {
        return autore;
    }

    public Long getId() {
        return id;
    }

    public List<Commento> getCommenti() {
        return commenti;
    }
}
