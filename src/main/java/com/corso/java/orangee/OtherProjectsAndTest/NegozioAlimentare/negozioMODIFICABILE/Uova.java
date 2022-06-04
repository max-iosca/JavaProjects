package com.corso.java.orangee.OtherProjectsAndTest.NegozioAlimentare.negozioMODIFICABILE;

public class Uova extends ProdottoAlimentare {
    private final double prezzo;
    private String nome;

    public Uova(int quantita, String nome){
        super(quantita);
        this.nome = nome;
        this.prezzo = 0.60;
    }
    public String getNome() {
        return nome;
    }

    @Override
    public double getPrezzo() {
        return prezzo;
    }

}
