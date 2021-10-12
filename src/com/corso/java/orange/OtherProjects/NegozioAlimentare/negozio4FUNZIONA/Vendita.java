package com.corso.java.orange.OtherProjects.NegozioAlimentare.negozio4FUNZIONA;

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
}
