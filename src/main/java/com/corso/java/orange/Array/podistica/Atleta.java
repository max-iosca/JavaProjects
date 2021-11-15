package com.corso.java.orange.Array.podistica;

import java.util.Objects;

public class Atleta {
    private String nome;
    private String cognome;
    private String cf;
    private String email;
    private int numeroPettorina;

    public Atleta(String nome, String cognome, String cf, String email) {
        this.nome = nome;
        this.cognome = cognome;
        this.cf = cf;
        this.email = email;
    }

    public int getNumeroPettorina() {
        return numeroPettorina;
    }

    public void setNumeroPettorina(int numeroPettorina) {
        this.numeroPettorina = numeroPettorina;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Atleta atleta = (Atleta) o;
        return Objects.equals(email, atleta.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }

    @Override
    public String toString() {
        return "Atleta{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", cf='" + cf + '\'' +
                ", numeroPettorina=" + numeroPettorina +
                '}';
    }
}
