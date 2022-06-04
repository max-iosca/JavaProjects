package com.corso.java.orangee.PlaysRemo.play200.v2Lore;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Post implements Comparable<Post> {

    private String titoloPost;
    private String testoPost;
    private LocalDate dataCreazione;
    private Utente creatorePost;
    private List<Commento> commenti;

    public Post(String titoloPost, String testoPost, Utente autore) {
        this.titoloPost = titoloPost;
        this.testoPost = testoPost;
        this.creatorePost = autore;
        this.commenti = new ArrayList<>();

        LocalDate start = LocalDate.of(1970, Month.JANUARY, 1);
        long days = ChronoUnit.DAYS.between(start, LocalDate.now());
        LocalDate randomDate = start.plusDays(new Random().nextInt((int) days + 1));

        this.dataCreazione = randomDate;

    }

    public String getTitoloPost() {
        return titoloPost;
    }

    public void setTitoloPost(String titoloPost) {
        this.titoloPost = titoloPost;
    }

    public String getTestoPost() {
        return testoPost;
    }

    public void setTestoPost(String testoPost) {
        this.testoPost = testoPost;
    }

    public LocalDate getDataCreazione() {
        return dataCreazione;
    }

    public void setDataCreazione(LocalDate dataCreazione) {
        this.dataCreazione = dataCreazione;
    }

    public Utente getCreatorePost() {
        return creatorePost;
    }

    public void setCreatorePost(Utente creatorePost) {
        this.creatorePost = creatorePost;
    }

    public List<Commento> getCommenti() {
        return commenti;
    }

    public void setCommenti(List<Commento> commenti) {
        this.commenti = commenti;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return Objects.equals(titoloPost, post.titoloPost) && Objects.equals(dataCreazione, post.dataCreazione) && Objects.equals(creatorePost, post.creatorePost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titoloPost, dataCreazione, creatorePost);
    }

    @Override
    public int compareTo(Post o) {
        return this.dataCreazione.compareTo(o.getDataCreazione());
    }

    @Override
    public String toString() {
        return "Post : " + titoloPost + " del " + dataCreazione;
    }
}

