package com.corso.java.orangee.PlaysRemo.play200.v4Git;

import java.util.Objects;

public class Utente {
    private String username;
    private String password;

    public Utente(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean verificaPassword(String password) {
        return this.password == password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Utente utente = (Utente) o;
        return Objects.equals(username, utente.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username);
    }

    public String getUsername() {
        return username;
    }
}
