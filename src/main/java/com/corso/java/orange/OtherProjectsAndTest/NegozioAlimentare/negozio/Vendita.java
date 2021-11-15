package com.corso.java.orange.OtherProjectsAndTest.NegozioAlimentare.negozio;

public class Vendita {

    private double totale = 0;

    public Vendita() {
    }

    public void esegui(Prodotto prodotto, int quantita) {

        double prezzo = prodotto.getPrezzoProdotto() * quantita;

        if (prodotto.getPercentualeSconto() != 0) {

            prezzo = prezzo - (prezzo * (prodotto.getPercentualeSconto() / 100.0));

        }

        totale = totale + prezzo;
    }

    public double getTotale() {
        return totale;
    }

}
