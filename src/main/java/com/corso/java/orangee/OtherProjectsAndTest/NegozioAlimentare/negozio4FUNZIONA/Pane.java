package com.corso.java.orangee.OtherProjectsAndTest.NegozioAlimentare.negozio4FUNZIONA;

public class Pane extends ProdottoAlimentare{
    private final double prezzo;
    private String nome;

    public Pane(int quantita, String nome){
        super(quantita);
        this.nome = nome;
        this.prezzo = 0.40;
    }
    public String getNome() {
        return nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

}
