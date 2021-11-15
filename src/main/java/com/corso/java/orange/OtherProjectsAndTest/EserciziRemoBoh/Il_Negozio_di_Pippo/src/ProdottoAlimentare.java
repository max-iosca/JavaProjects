package com.corso.java.orange.OtherProjectsAndTest.EserciziRemoBoh.Il_Negozio_di_Pippo.src;

public class ProdottoAlimentare extends Prodotto {

	public ProdottoAlimentare() {
	}

	public ProdottoAlimentare(String nomeProdotto, String marcaProdotto, int costoProdotto) {
		super(nomeProdotto, marcaProdotto, costoProdotto);
		setPercentualeSconto(5);
		
		
	}

}
