package com.corso.java.orange.OtherProjectsAndTest.BlackJack;

import java.util.ArrayList;
import java.util.List;

public class Giocatore {

    private String nome;
    private int quotaIniziale;
    private int valorePortafoglio;
    private List<Carta> mano;
    //ma non sarebbe meglio private Carta carta;

    public Giocatore(String nome, int quotaIniziale) {
        this.mano = new ArrayList<>();
        this.nome = nome;
        this.quotaIniziale = quotaIniziale;
        this.valorePortafoglio = quotaIniziale;
    }

    //FIXME - MI ricordarsi di sollevare una eccezione se punto più di quello che ho.
    public void puntata(int valorePuntata){
        this.valorePortafoglio -= valorePuntata;
    }

    public void riceviCarta(Carta carta){

    }

}
