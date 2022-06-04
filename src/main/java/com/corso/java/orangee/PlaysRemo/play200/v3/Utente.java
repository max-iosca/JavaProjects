package com.corso.java.orangee.PlaysRemo.play200.v3;

import java.util.Objects;

public class Utente {

    private String nickname;
    private String email;
    private String nome;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Utente utente = (Utente) o;
        return Objects.equals(nickname, utente.nickname) && Objects.equals(email, utente.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickname, email);
    }

    @Override
    public String toString() {
        return "Nickname: " +nickname+" - Email: " +email+"\n";
    }
}
