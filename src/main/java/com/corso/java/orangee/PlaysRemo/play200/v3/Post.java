package com.corso.java.orangee.PlaysRemo.play200.v3;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Post implements Comparable<Post> {

    private List<Commento> listaCommenti;
    private String titoloDelPost;
    private String testoDelPost;
    private Utente utenteDelPost;
    private LocalDate dataPost;

    public Post(String titoloDelPost, String testoDelPost, Utente utenteDelPost) {
        this.titoloDelPost = titoloDelPost;
        this.testoDelPost = testoDelPost;
        this.utenteDelPost = utenteDelPost;

        LocalDate dataIniziale = LocalDate.of(1990, Month.JANUARY, 1);
        long days = ChronoUnit.DAYS.between(dataIniziale, LocalDate.now());
        LocalDate randomDate = dataIniziale.plusDays(new Random().nextInt((int) days + 1));

        this.dataPost = randomDate;
    }

    public List<Commento> getListaCommenti() {
        return listaCommenti;
    }

    public void setListaCommenti(List<Commento> listaCommenti) {
        this.listaCommenti = listaCommenti;
    }

    public String getTitoloDelPost() {
        return titoloDelPost;
    }

    public void setTitoloDelPost(String titoloDelPost) {
        this.titoloDelPost = titoloDelPost;
    }

    public String getTestoDelPost() {
        return testoDelPost;
    }

    public void setTestoDelPost(String testoDelPost) {
        this.testoDelPost = testoDelPost;
    }

    public Utente getUtenteDelPost() {
        return utenteDelPost;
    }

    public void setUtenteDelPost(Utente utenteDelPost) {
        this.utenteDelPost = utenteDelPost;
    }

    public LocalDate getDataPost() {
        return dataPost;
    }

    public void setDataPost(LocalDate dataPost) {
        this.dataPost = dataPost;
    }

    @Override
    public String toString() {
        return "Titolo Post: " + titoloDelPost + "\r"
                + "Data: " + dataPost + "\r";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return Objects.equals(titoloDelPost, post.titoloDelPost) && Objects.equals(utenteDelPost, post.utenteDelPost) && Objects.equals(dataPost, post.dataPost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titoloDelPost, utenteDelPost, dataPost);
    }

    @Override
    public int compareTo(Post oggettoCompare) {
        return dataPost.compareTo(oggettoCompare.getDataPost());
    }
}
