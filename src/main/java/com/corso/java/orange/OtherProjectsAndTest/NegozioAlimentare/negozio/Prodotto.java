package com.corso.java.orange.OtherProjectsAndTest.NegozioAlimentare.negozio;

public class Prodotto {
    private String nomeProdotto;
    private String marcaProdotto;
    private int prezzoProdotto;
    private double percentualeSconto;

    public Prodotto() {
    }

    public Prodotto (String nomeProdotto, String marcaProdotto, int prezzoProdotto) {
        this.nomeProdotto = nomeProdotto;
        this.marcaProdotto = marcaProdotto;
        this.prezzoProdotto = prezzoProdotto;
    }

    public String getNomeProdotto() {
        return nomeProdotto;
    }

    public void setNomeProdotto(String nomeProdotto) {
        this.nomeProdotto = nomeProdotto;
    }

    public String getMarcaProdotto() {
        return marcaProdotto;
    }

    public void setMarcaProdotto(String marcaProdotto) {
        this.marcaProdotto = marcaProdotto;
    }

    public int getPrezzoProdotto() {
        return prezzoProdotto;
    }

    public void setPrezzoProdotto(int prezzoProdotto) {
        this.prezzoProdotto = prezzoProdotto;
    }

    public double getPercentualeSconto() {
        return percentualeSconto;
    }

    public void setPercentualeSconto(int percentualeSconto) {
        this.percentualeSconto = percentualeSconto;
    }
}
