package com.corso.java.orangee.OtherProjectsAndTest.NegozioAlimentare.negozioMODIFICABILE;

public class Scottex extends ProdottoNonAlimentare {
    private final double prezzo;
    private String nome;

    @Override
    public double getPrezzo() {
        return prezzo;
    }

    public Scottex(int quantita, String nome){
        super(quantita);
        this.nome = nome;
        this.prezzo = 0.50;
    }
    public String getNome() {
        return nome;
    }
}
