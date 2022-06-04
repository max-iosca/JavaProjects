package com.corso.java.orangee.PlaysRemo.Twitter.max;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Utente {

    private String nickname;
    private Set<Utente> listaSeguaci;
    private Set<Utente> listaSeguiti;

    public Utente(String nickname) {
        this.nickname = nickname;
        this.listaSeguaci = new HashSet<>();
        this.listaSeguiti = new HashSet<>();
    }

    public String getNickname() {
        return nickname;
    }

    public Set<Utente> getListaSeguaci() {
        return listaSeguaci;
    }

    public Set<Utente> getListaSeguiti() {
        return listaSeguiti;
    }

    /*
    public void aggiungiSeguace(Utente seguace) {
        try {
            if (seguace.equals(null))
                throw new UtenteNonValidoException();
            listaSeguaci.add(seguace);
        } catch (UtenteNonValidoException e) {
            System.out.println("UTENTE NON VALIDO, RIPROVA");
        }
    }
    */

    public void rimuoviSeguace(Utente seguace){

    }

    public void rimuoviSeguito(Utente seguace){

    }

    public void aggiungiSeguace(Utente seguaceDaAggiungere){
        listaSeguaci.add(seguaceDaAggiungere);
    }

    public void aggiungiSeguito(Utente seguitoDaAggiungere){
        listaSeguiti.add(seguitoDaAggiungere);
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
}
