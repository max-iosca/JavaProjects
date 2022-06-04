package com.corso.java.orangee.Collections.Maps.capoluogoRegione.remo;

import java.util.Objects;

public class Regione {
    private String nome;
    private int nrComuni;
    private int nrProvince;

    public Regione(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Regione regione = (Regione) o;
        return Objects.equals(this.nome, regione.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    public int getNrComuni() {
        return nrComuni;
    }

    public void setNrComuni(int nrComuni) {
        this.nrComuni = nrComuni;
    }

    public int getNrProvince() {
        return nrProvince;
    }

    public void setNrProvince(int nrProvince) {
        this.nrProvince = nrProvince;
    }
}
