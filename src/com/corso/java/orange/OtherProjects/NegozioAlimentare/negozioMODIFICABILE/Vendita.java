package com.corso.java.orange.OtherProjects.NegozioAlimentare.negozioMODIFICABILE;

public class Vendita {
    private double totale = 0;
    ProdottoAlimentare prodAlim = new ProdottoAlimentare(0);

    public void esegui(Prodotto prodotto){
        double prezzo = prodotto.getPrezzo() * prodotto.getQuantita();
        if(prodAlim.getSconto() != 0){
            prezzo = prezzo - (prezzo * (prodAlim.getSconto() / 100.0));
        }
        totale = totale + prezzo;
    }
    public double getTotale() {
        return totale;
    }

    public void setTotale(double totale) {
        this.totale = totale;
    }

}
