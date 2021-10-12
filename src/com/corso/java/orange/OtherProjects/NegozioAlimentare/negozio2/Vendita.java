package com.corso.java.orange.OtherProjects.NegozioAlimentare.negozio2;

public class Vendita {

    private double totaleAlimentare = 0;
    private double totaleNonAlimentare = 0;

    public Vendita() {}

    public void VenditaAlimentare(ProdottoAlimentare prodotto, int quantita) {
        double prezzo = prodotto.getCOSTO_PRODOTTO_ALIMENTARE() * quantita;
        if (prodotto.getPercentualeSconto() != 0) {
            prezzo = prezzo - (prezzo * (prodotto.getPercentualeSconto() / 100.0));
        }
        totaleAlimentare = totaleAlimentare + prezzo;
    }

    public void VenditaNonAlimentare(ProdottoAlimentare prodotto, int quantita) {
        double prezzo = prodotto.getCOSTO_PRODOTTO_ALIMENTARE() * quantita;
        if (prodotto.getPercentualeSconto() != 0) {
            prezzo = prezzo - (prezzo * (prodotto.getPercentualeSconto() / 100.0));
        }
        totaleNonAlimentare = totaleNonAlimentare + prezzo;
    }

    public double getTotaleAlimentare() {
        return totaleAlimentare;
    }

    public double getTotaleNonAlimentare() {
        return totaleNonAlimentare;
    }
}



