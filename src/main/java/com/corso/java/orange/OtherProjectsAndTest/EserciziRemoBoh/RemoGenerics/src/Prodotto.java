package com.corso.java.orange.OtherProjectsAndTest.EserciziRemoBoh.RemoGenerics.src;

import java.util.Objects;

public class Prodotto {
    private String id;
    private String descrizione;


    public Prodotto() {
    }

    public Prodotto(String id, String descrizione) {
        this.id = id;
        this.descrizione = descrizione;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prodotto prodotto = (Prodotto) o;
        return Objects.equals(id, prodotto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "(" + id + ") " + descrizione;
    }
}