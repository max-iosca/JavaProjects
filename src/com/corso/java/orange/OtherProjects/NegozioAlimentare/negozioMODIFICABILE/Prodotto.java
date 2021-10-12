package com.corso.java.orange.OtherProjects.NegozioAlimentare.negozioMODIFICABILE;

public class Prodotto {
    private int quantita;
    private double prezzo;

    public Prodotto(int quantita){
        this.quantita = quantita;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    public double getPrezzo() {
        return prezzo;
    }

}
