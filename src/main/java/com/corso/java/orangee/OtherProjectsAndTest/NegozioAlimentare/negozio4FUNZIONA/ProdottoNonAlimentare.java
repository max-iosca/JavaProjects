package com.corso.java.orangee.OtherProjectsAndTest.NegozioAlimentare.negozio4FUNZIONA;

public class ProdottoNonAlimentare extends Prodotto {
    private int sconto = 0;

    public ProdottoNonAlimentare(int quantita) {
        super(quantita);
        this.sconto = sconto;
    }
    public int getSconto() {
        return sconto;
    }

    public void setSconto(int sconto) {
        this.sconto = sconto;
    }
}
