package com.corso.java.orangee.OtherProjectsAndTest.NegozioAlimentare.negozio;

public class ProdottoAlimentare extends Prodotto{
    public ProdottoAlimentare() {
    }

    public ProdottoAlimentare(String nomeProdotto, String marcaProdotto, int costoProdotto) {
        super(nomeProdotto, marcaProdotto, costoProdotto);
        setPercentualeSconto(5);
    }

}
