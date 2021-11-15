package com.corso.java.orange.OtherProjectsAndTest.NegozioAlimentare.negozio4FUNZIONA;

public class Prosciutto extends ProdottoAlimentare{
    private final double prezzo;
    private String nome;

    @Override
    public double getPrezzo() {
        return prezzo;
    }

    public Prosciutto(int quantita , String nome) {
        super(quantita);
        this.prezzo = 1.0;
        this.nome = nome;
    }
    public String getNome() {return nome;}
}
