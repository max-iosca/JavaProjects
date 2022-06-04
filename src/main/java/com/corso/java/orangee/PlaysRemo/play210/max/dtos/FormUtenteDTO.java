package com.corso.java.orangee.PlaysRemo.play210.max.dtos;

import com.corso.java.orangee.PlaysRemo.play210.max.Utente;

import java.util.Objects;

public class FormUtenteDTO {

    private String nome;
    private String cognome;
    private String email;

    public FormUtenteDTO(Utente utente){
        this.nome = utente.getNome();
        this.cognome = utente.getCognome();
        this.email = utente.getEmail();
    }

    public FormUtenteDTO(String userName, String cognome, String email) {
        this.nome = userName;
        this.cognome = cognome;
        this.email = email;
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
        FormUtenteDTO that = (FormUtenteDTO) o;
        return Objects.equals(nome, that.nome) && Objects.equals(cognome, that.cognome) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cognome, email);
    }
}
