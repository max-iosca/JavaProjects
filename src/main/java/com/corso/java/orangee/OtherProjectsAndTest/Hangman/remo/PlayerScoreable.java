package com.corso.java.orangee.OtherProjectsAndTest.Hangman.remo;


/**
 * Questa interfaccia identifica le azioni generiche che possono
 * essere eseguite su qualunque oggetto gestisca dei punteggi
 * di vittorie e sconfitte
 */
public interface PlayerScoreable {

    int getNrWinnings();

    int getNrLoosings();

    int addWinnings();

    int addLoosings();
}
