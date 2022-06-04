package com.corso.java.orangee.PlaysRemo.play200.v4Git.dtos;

import java.util.Objects;

public class UtenteDTO {

    private String nomeUtente;
    private String password;

    public UtenteDTO(String nomeUtente, String password) {
        this.nomeUtente = nomeUtente;
        this.password = password;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UtenteDTO utenteDTO = (UtenteDTO) o;
        return Objects.equals(nomeUtente, utenteDTO.nomeUtente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeUtente);
    }

    public String getNomeUtente() {
        return nomeUtente;
    }

    public String getPassword() {
        return password;
    }
}
