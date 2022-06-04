package com.corso.java.orangee.Collections.List.familylist.remo;
import java.util.Objects;

public class Persona {

    private String nome;
    private String conome;
    private String cf;
    private String genere;

    public Persona(String nome, String conome, String cf, String genere) {
        this.nome = nome;
        this.conome = conome;
        this.cf = cf;
        this.genere = genere;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return cf.equals(persona.cf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cf);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return conome;
    }

    public void setConome(String conome) {
        this.conome = conome;
    }

    public String getCf() {
        return cf;
    }

    public void setCf(String cf) {
        this.cf = cf;
    }

    @Override
    public String toString() {
        return "nome=" + nome +", cognome=" + conome + ", cf=" + cf;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }
}
