package com.corso.java.orangee.PlaysRemo.play200.v1;

import java.util.Date;
import java.util.Objects;

public class Commento {
    private Utente utenteCommento;
    private String testoPost;
    private Date dataCommento;

    public Commento(Utente utenteCommento, String testoPost, Date dataCommento) {
        this.utenteCommento = utenteCommento;
        this.testoPost = testoPost;
        this.dataCommento = dataCommento;

    }

    public Utente getUtenteCommento() {
        return utenteCommento;
    }

    public void setUtenteCommento(Utente utenteCommento) {
        this.utenteCommento = utenteCommento;
    }

    public String getTestoPost() {
        return testoPost;
    }

    public void setTestoPost(String testoPost) {
        this.testoPost = testoPost;
    }

    public Date getDataCommento() {
        return dataCommento;
    }

    public void setDataCommento(Date dataCommento) {
        this.dataCommento = dataCommento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Commento commento = (Commento) o;
        return Objects.equals(utenteCommento, commento.utenteCommento) && Objects.equals(testoPost, commento.testoPost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(utenteCommento, testoPost);
    }
}
