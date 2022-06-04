package com.corso.java.orangee.PlaysRemo.play210.max.dtos;

import java.time.LocalDate;
import java.util.Objects;

public class FormRegUtenteStepUno {

    private String nome;
    private String cognome;
    private String cf;
    private Boolean condizioniPrivacy;
    private LocalDate dataNascita;
    private String email;

    public FormRegUtenteStepUno(String nome, String cognome, String cf, Boolean condizioniPrivacy, String email) {
        this.nome = nome;
        this.cognome = cognome;
        this.cf = cf;
        this.condizioniPrivacy = condizioniPrivacy;
        this.dataNascita = dataNascita;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getCf() {
        return cf;
    }

    public Boolean getCondizioniPrivacy() {
        return condizioniPrivacy;
    }

    public LocalDate getDataNascita() {
        return dataNascita;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Nome: "+nome+" Cognome: "+cognome+" Privacy: "+condizioniPrivacy+" Email: "+email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FormRegUtenteStepUno that = (FormRegUtenteStepUno) o;
        return Objects.equals(cf, that.cf) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cf, email);
    }
}


