package com.corso.java.orangee.OtherProjectsAndTest.BlackJack;

import java.util.Set;

public class BlackJack {

    //per ora NON consideriamo il mazziere, altrimenti sarebbero 6
    public static final int NR_MAX_GIOCATORI = 5;
    private Set<Giocatore> partecipanti;
    private Partita partita;

    public BlackJack(Set<Giocatore> partecipanti) throws NumeroPartecipantiNulloException, TroppiGiocatoriException {
        if(partecipanti==null || partecipanti.isEmpty())
            throw new NumeroPartecipantiNulloException();
        if(partecipanti.size()>5)
            throw new TroppiGiocatoriException();
        this.partecipanti= partecipanti;
    }

    public void gioca(){
    }

}
