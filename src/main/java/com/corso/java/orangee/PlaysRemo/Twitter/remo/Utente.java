package com.corso.java.orangee.PlaysRemo.Twitter.remo;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Utente {
    private String nickname;
    private Set<Utente> seguaci;
    private Set<Utente> seguiti;

    public Utente(String nickname) {
        this.nickname = nickname;
        this.seguiti=new HashSet<>();
        this.seguaci=new HashSet<>();
    }

    public void aggiungiSeguace(Utente seguace){
        seguaci.add(seguace);

    }
    public void aggiungiSeguito(Utente seguito){
        seguiti.add(seguito);

    }

    public void rimuoviSeguito(Utente seguito){
        seguiti.remove(seguito);
    }
    public void rimuoviSeguace(Utente seguace){
        seguaci.remove(seguace);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Utente utente = (Utente) o;
        return Objects.equals(nickname, utente.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickname);
    }

    public Set<Utente> getSeguaci() {
        return seguaci;
    }

    public Set<Utente> getSeguiti() {
        return seguiti;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
