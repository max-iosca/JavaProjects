package com.corso.java.orangee.PlaysRemo.play005;

public class ProdottoNonAlimentare extends Prodotto{
    public ProdottoNonAlimentare(String codice, String nome, int prezzoUnitario) {
        super(codice, nome, prezzoUnitario);
        super.setScontoPercentuale(0);
    }
}
