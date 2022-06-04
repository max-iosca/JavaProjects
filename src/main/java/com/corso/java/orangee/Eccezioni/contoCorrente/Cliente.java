package com.corso.java.orangee.Eccezioni.contoCorrente;

import java.util.Objects;

public class Cliente {
    private  String nome;
    private  String cognome;
    private  String cf;

    public Cliente(String nome, String cognome, String cf) {
        this.nome = nome;
        this.cognome = cognome;
        this.cf = cf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCf() {
        return cf;
    }

    public void setCf(String cf) {
        this.cf = cf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(cf, cliente.cf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cf);
    }
}

