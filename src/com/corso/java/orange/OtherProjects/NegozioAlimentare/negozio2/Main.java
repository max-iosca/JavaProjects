package com.corso.java.orange.OtherProjects.NegozioAlimentare.negozio2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Prodotto prodotto = new Prodotto();
        List<Prodotto> prodottiAlimentari = new ArrayList<>();
        List<Prodotto> prodottiNonAlimentari = new ArrayList<>();
        Vendita vendita = new Vendita();

        prodottiAlimentari.add(new ProdottoAlimentare("Pasta", "Barilla"));
        prodottiAlimentari.add(new ProdottoAlimentare("Pane"," del Forno"));
        prodottiNonAlimentari.add(new ProdottoNonAlimentare("Detersivo"," Vernel"));
        prodottiNonAlimentari.add(new ProdottoNonAlimentare("Scottex "," Foxi"));

        vendita.VenditaAlimentare((ProdottoAlimentare) prodottiAlimentari.get(0), 3);
      //vendita.VenditaNonAlimentare((ProdottoAlimentare) prodottiNonAlimentari.get(0),4);
        System.out.println("Il prezzo complessivo dei prodotti alimentari è: " + vendita.getTotaleAlimentare());
        System.out.println("Il totale complessivo dei prodotti NON alimentari è: ");
    }
}
