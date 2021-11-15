package com.corso.java.orange.OtherProjectsAndTest.NegozioAlimentare.negozioMODIFICABILE;

public class Pasta extends ProdottoAlimentare {
    private final double prezzo;
    private String nome;

    @Override
    public double getPrezzo() {
        return prezzo;
    }

    public Pasta(int quantita, String nome){
        super(quantita);
        this.nome = nome;
        this.prezzo = 0.70;
    }
    public String getNome() {
        return nome;
    }
}
