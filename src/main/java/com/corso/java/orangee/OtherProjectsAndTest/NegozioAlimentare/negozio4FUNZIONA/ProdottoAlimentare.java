package com.corso.java.orangee.OtherProjectsAndTest.NegozioAlimentare.negozio4FUNZIONA;

public class ProdottoAlimentare extends Prodotto{
    private int sconto = 5;

    public ProdottoAlimentare(int quantita) {
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
