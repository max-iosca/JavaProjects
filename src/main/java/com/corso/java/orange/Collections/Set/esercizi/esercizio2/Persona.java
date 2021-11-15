package com.corso.java.orange.Collections.Set.esercizi.esercizio2;
import java.util.Objects;

public class Persona {

    private String nome;
    private String conome;
    private String cf;

    public Persona(String nome, String conome, String cf) {
        this.nome = nome;
        this.conome = conome;
        this.cf = cf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(cf, persona.cf);
    }

    @Override
    public int hashCode() {
        return 1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getConome() {
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
        return "nome=" + nome +", conome=" + conome + ", cf=" + cf;
    }
}
