package com.corso.java.orange.OtherProjectsAndTest.EserciziRemoBoh.Il_Negozio_di_Pippo.src;

public class ProdottoNonAlimentare extends Prodotto {

	public ProdottoNonAlimentare () {
		}
	
	
	public ProdottoNonAlimentare(String nomeProdotto, String marcaProdotto, int costoProdotto) {
		super(nomeProdotto, marcaProdotto, costoProdotto);
		setPercentualeSconto(0);
	}
	
}
