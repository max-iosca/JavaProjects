package com.corso.java.orange.OtherProjects.NegozioAlimentare.negozio;

public class ProdottoAlimentare extends Prodotto{
    public ProdottoAlimentare() {
    }

    public ProdottoAlimentare(String nomeProdotto, String marcaProdotto, int costoProdotto) {
        super(nomeProdotto, marcaProdotto, costoProdotto);
        setPercentualeSconto(5);
    }

}