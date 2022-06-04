package com.corso.java.orangee.OtherProjectsAndTest.NegozioAlimentare.negozioMODIFICABILE;

public class Main {
    public static void main(String[] args) {
//istanza classe vendita, dentro DOVREI avere il metodo che CALCOLA la vendita di quel prodotto
        Vendita vendita = new Vendita();
        VenditaDomicilio venditaDomicilio = new VenditaDomicilio();
        VenditaOnline venditaOnline = new VenditaOnline();

// elenco dei prodotti con relative quantità
        Prodotto prodottoPane = new Pane(5, "Rosette");
        vendita.esegui(prodottoPane);
        Prodotto prodottoPasta = new Pasta(2,"Barilla");
        vendita.esegui(prodottoPasta);
        Prodotto prodottoUova = new Uova(6,"Uova bio?!?");
        vendita.esegui(prodottoUova);
        Prodotto prodottoCartaIg = new CartaIgienica(6,"Carta Ig. Regina");
        vendita.esegui(prodottoCartaIg);
        Prodotto prodottoDetersivo = new Detersivi(1,"Vernel");
        vendita.esegui(prodottoDetersivo);
        System.out.println("Il costo totale della spesa è: "+ vendita.getTotale());

        System.out.println("HAI EFFETTUATO UNA CONSEGNA A DOMICILIO");
        venditaDomicilio.eseguiConsegnaDomicilio(vendita.getTotale());

        System.out.println("HAI EFFETTUATO UN ORDINE ONLINE");
        venditaOnline.eseguiVenditaOnline(prodottoPane);
        venditaOnline.eseguiVenditaOnline(prodottoPasta);
        venditaOnline.eseguiVenditaOnline(prodottoDetersivo);
        venditaOnline.eseguiVenditaOnline(prodottoCartaIg);
        venditaOnline.eseguiVenditaOnline(prodottoDetersivo);
        System.out.println("IL TOTALE DELLA VENDITA ONLINE (SCONTATO DEL 5%) E' DI: "+ venditaOnline.getTotale());
    }
}
