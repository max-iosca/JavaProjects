package com.corso.java.orangee.PlaysRemo.play200.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Utente {
    private String nickName;
    private String email;
    private List<Post> listaPostUtente;

    public Utente(String nickName, String email) {
        this.nickName = nickName;
        this.email = email;
        this.listaPostUtente = new ArrayList<>();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
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
        return Objects.equals(nickName, utente.nickName) && Objects.equals(email, utente.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickName, email);
    }

    @Override
    public String toString() {
        return "Utente{" +
                "nickName='" + nickName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
    }
