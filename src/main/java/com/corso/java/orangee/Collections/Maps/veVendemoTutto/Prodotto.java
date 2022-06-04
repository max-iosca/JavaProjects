package com.corso.java.orangee.Collections.Maps.veVendemoTutto;

import java.util.Objects;

public class Prodotto {
    private String nome;
    private Integer quantita;
    private String codice;

    public Prodotto(String nome, int quantita) {
        this.nome = nome;
        this.quantita = quantita;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantita() {
        return quantita;
    }

    public void setQuantita(Integer quantita) {
        this.quantita = quantita;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
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
}
