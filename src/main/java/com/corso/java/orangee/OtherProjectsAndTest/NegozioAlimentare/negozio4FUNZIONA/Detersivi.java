package com.corso.java.orangee.OtherProjectsAndTest.NegozioAlimentare.negozio4FUNZIONA;

public class Detersivi extends ProdottoNonAlimentare {
    private final double prezzo;
    private String nome;

    @Override
    public double getPrezzo() {
        return prezzo;
    }

    public Detersivi(int quantita , String nome) {
        super(quantita);
        this.nome = nome;
        this.prezzo = 1.80;
    }
    public String getNome() {
        return nome;
    }
}
