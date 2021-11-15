package com.corso.java.orange.OtherProjectsAndTest.NegozioAlimentare.negozio2;

public class ProdottoNonAlimentare extends Prodotto{
    private final double COSTO_PRODOTTO_NON_ALIMENTARE = 4.0;

    public ProdottoNonAlimentare(String nomeProdotto, String marcaProdotto) {
        super(nomeProdotto, marcaProdotto);
        getCOSTO_PRODOTTO_NON_ALIMENTARE();
    }

    public double getCOSTO_PRODOTTO_NON_ALIMENTARE() {
        return COSTO_PRODOTTO_NON_ALIMENTARE;
    }
}
