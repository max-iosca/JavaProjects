package com.corso.java.orangee.PlaysRemo.play210.max;

import java.util.Objects;

public class Utente {

    private String nomeUtente;
    private String cognomeUtente;
    private String email;

    public Utente(String nomeUtente, String cognomeUtente, String email) {
        this.nomeUtente = nomeUtente;
        this.cognomeUtente = cognomeUtente;
        this.email = email;
    }

    public String getNome() {
        return nomeUtente;
    }

    public void setNome(String nome) {
        this.nomeUtente = nome;
    }

    public String getCognome() {
        return cognomeUtente;
    }

    public void setCognome(String cognome) {
        this.cognomeUtente = cognome;
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
        Utente utente = (Utente) o;
        return Objects.equals(nomeUtente, utente.nomeUtente) && Objects.equals(cognomeUtente, utente.cognomeUtente) && Objects.equals(email, utente.email);
    }

    @Override
    public String toString() {
        return " [ nome: " + nomeUtente + "// cognome: " + cognomeUtente + "// email: " + email + " ]\n";
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeUtente, cognomeUtente, email);
    }
}
