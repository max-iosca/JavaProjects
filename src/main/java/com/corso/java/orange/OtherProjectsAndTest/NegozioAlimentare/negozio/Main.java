package com.corso.java.orange.OtherProjectsAndTest.NegozioAlimentare.negozio;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Prodotto> prodotti = new ArrayList<>();

        prodotti.add(new ProdottoAlimentare("pasta", "barilla", 2));
        prodotti.add(new ProdottoAlimentare("pane", "laqualunque", 1));
        prodotti.add(new ProdottoAlimentare("uova", "uovo_sano", 6));
        prodotti.add(new ProdottoNonAlimentare("detersivo", "vernel", 1));
        prodotti.add(new ProdottoNonAlimentare("scottex", "foxi", 3));

        Vendita vendita = new Vendita();

        // vendita.esegui(prodotto1, 3);
        // vendita.esegui(prodotto2, 2);

        vendita.esegui(prodotti.get(4), 2);



        System.out.println("Il Prezzo complessivo è: " + vendita.getTotale() + " €");

    }

}
