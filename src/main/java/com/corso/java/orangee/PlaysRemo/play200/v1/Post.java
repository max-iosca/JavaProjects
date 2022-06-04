package com.corso.java.orangee.PlaysRemo.play200.v1;

import java.time.LocalDate;
import java.util.Objects;

public class Post {

    private Utente utentePost;
    private String titoloPost;
    private String testoPost;
    private LocalDate dataPost;


    public Post(Utente utentePost, String titoloPost, String testoPost) {

        this.titoloPost = titoloPost;
        this.testoPost = testoPost;
        this.utentePost = utentePost;
        this.dataPost = LocalDate.now();
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

    public LocalDate getDataPost() {
        return dataPost;
    }

    public void setDataPost(LocalDate dataPost) {
        this.dataPost = dataPost;
    }

    public Utente getUtentePost() {
        return utentePost;
    }

    public void setUtentePost(Utente utentePost) {
        this.utentePost = utentePost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return Objects.equals(titoloPost, post.titoloPost) && Objects.equals(testoPost, post.testoPost) && Objects.equals(utentePost, post.utentePost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titoloPost, testoPost, utentePost);
    }
}
