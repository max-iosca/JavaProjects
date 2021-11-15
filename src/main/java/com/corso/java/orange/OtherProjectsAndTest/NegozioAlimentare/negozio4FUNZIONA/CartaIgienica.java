package com.corso.java.orange.OtherProjectsAndTest.NegozioAlimentare.negozio4FUNZIONA;

public class CartaIgienica extends ProdottoNonAlimentare{
    private final double prezzo;
    private String nome;

    @Override
    public double getPrezzo() {
        return prezzo;
    }

    public CartaIgienica(int quantita , String nome) {
        super(quantita);
        this.nome = nome;
        this.prezzo = 1.50;
    }
    public String getNome() {
        return nome;
    }
}
