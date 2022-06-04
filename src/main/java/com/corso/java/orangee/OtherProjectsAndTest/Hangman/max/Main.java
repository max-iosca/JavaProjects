package com.corso.java.orangee.OtherProjectsAndTest.Hangman.max;

import java.util.HashSet;
import java.util.Set;

/**
 * Classi:
 * - Giocatore
 * - Gioco
 * - GeneraParol
 *
 *
 *
 */

public class Main {
    public static void main(String[] args) {

        Set<Giocatore> giocatori = new HashSet<>();
        giocatori.add(new Giocatore("Franco"));
        giocatori.add(new Giocatore("ernesto"));
        Gioco gioco = new Gioco(giocatori);
    }

}
