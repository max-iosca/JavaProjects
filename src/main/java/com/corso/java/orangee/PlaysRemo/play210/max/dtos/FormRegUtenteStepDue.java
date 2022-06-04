package com.corso.java.orangee.PlaysRemo.play210.max.dtos;

import java.util.Objects;

public class FormRegUtenteStepDue {

    private String nomeUtente;
    private String password;
    private String nrTelefono;

    public FormRegUtenteStepDue(String nomeUtente, String password, String nrTelefono) {
        this.nomeUtente = nomeUtente;
        this.password = password;
        this.nrTelefono = nrTelefono;
    }

    public String getNomeUtente() {
        return nomeUtente;
    }

    public String getPassword() {
        return password;
    }

    public String getNrTelefono() {
        return nrTelefono;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FormRegUtenteStepDue that = (FormRegUtenteStepDue) o;
        return Objects.equals(nomeUtente, that.nomeUtente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeUtente);
    }
}
