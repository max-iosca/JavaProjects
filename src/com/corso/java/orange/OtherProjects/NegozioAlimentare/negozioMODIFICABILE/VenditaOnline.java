package com.corso.java.orange.OtherProjects.NegozioAlimentare.negozioMODIFICABILE;

public class VenditaOnline extends Vendita{

    public void eseguiVenditaOnline(Prodotto prodotto) {

            double prezzo  = prodotto.getPrezzo() * prodotto.getQuantita();
            prezzo = prezzo - ((prezzo/100) * 5);
            double totale = prezzo;
            setTotale(getTotale() + totale);
    }
}
