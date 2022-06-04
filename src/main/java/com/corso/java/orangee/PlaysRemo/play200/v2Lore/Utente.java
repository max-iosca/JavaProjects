package com.corso.java.orangee.PlaysRemo.play200.v2Lore;

import java.util.Objects;

public class Utente {

    private String nomeUtente;
    private String email;
    private String nome;


    public String getNomeUtente() {
        return nomeUtente;
    }

    public void setNomeUtente(String nomeUtente) {
        this.nomeUtente = nomeUtente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Username : " + nomeUtente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Utente utente = (Utente) o;
        return Objects.equals(nomeUtente, utente.nomeUtente) && Objects.equals(email, utente.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeUtente, email);
    }
}
