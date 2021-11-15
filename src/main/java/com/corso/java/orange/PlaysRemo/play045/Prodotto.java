package com.corso.java.orange.PlaysRemo.play045;

import java.util.Objects;

public class Prodotto {

    private String codice;
    private String nome;

    public Prodotto(String codice, String nome) {
        this.codice = codice;
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prodotto prodotto = (Prodotto) o;
        return Objects.equals(codice, prodotto.codice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codice);
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
