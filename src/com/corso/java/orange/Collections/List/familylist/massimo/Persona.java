package com.corso.java.orange.Collections.List.familylist.massimo;

import java.util.Objects;

public class Persona {
    private String nome;
    private String cognome;
    private char sesso;
    private String cf;

    public Persona(String nome, char sesso, String cf) {
        this.nome = nome;
        this.sesso = sesso;
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

    public char getSesso() {
        return sesso;
    }

    public void setSesso(char sesso) {
        this.sesso = sesso;
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
        Persona persona = (Persona) o;
        return Objects.equals(cf, persona.cf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cf);
    }


}
