package com.corso.java.orange.OtherProjects.NegozioAlimentare.negozio2;

public class Prodotto {
    private String nomeProdotto;
    private String marcaProdotto;
    private double percentualeSconto;


    public Prodotto (String nomeProdotto, String marcaProdotto) {
        this.nomeProdotto = nomeProdotto;
        this.marcaProdotto = marcaProdotto;
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
    public double getPercentualeSconto() {
        return percentualeSconto;
    }
    public void setPercentualeSconto(int percentualeSconto) {
        this.percentualeSconto = percentualeSconto;
    }
}
