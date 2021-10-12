package com.corso.java.orange.OtherProjects.NegozioAlimentare.negozio2;

public class ProdottoAlimentare extends Prodotto {
    private final double COSTO_PRODOTTO_ALIMENTARE = 2.0;

    public ProdottoAlimentare(String nomeProdotto, String marcaProdotto) {
        super(nomeProdotto, marcaProdotto);
        getCOSTO_PRODOTTO_ALIMENTARE();
        setPercentualeSconto(5);
    }
    public double getCOSTO_PRODOTTO_ALIMENTARE() {
        return COSTO_PRODOTTO_ALIMENTARE;
    }
}
