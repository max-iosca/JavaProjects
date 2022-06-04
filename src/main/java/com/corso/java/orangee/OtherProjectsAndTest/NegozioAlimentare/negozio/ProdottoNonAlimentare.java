package com.corso.java.orangee.OtherProjectsAndTest.NegozioAlimentare.negozio;

public class ProdottoNonAlimentare extends Prodotto {

    public ProdottoNonAlimentare () {
    }


    public ProdottoNonAlimentare(String nomeProdotto, String marcaProdotto, int costoProdotto) {
        super(nomeProdotto, marcaProdotto, costoProdotto);
        setPercentualeSconto(0);
    }

}
