package com.corso.java.orange.Plays.play005;

import com.corso.java.orange.Plays.play005.vendite.Vendita;
import com.corso.java.orange.Plays.play005.vendite.VenditaOnLine;
import com.corso.java.orange.Plays.play005.vendite.VenditaADomicilio;

public class Main {

    public static void main(String[] args) {

        ProdottoAlimentare pane = new ProdottoAlimentare("PAN", "Pane", 50);
        ProdottoAlimentare pasta = new ProdottoAlimentare("PAST", "Pasta", 10);
        ProdottoAlimentare uova = new ProdottoAlimentare("UOV", "Uova", 3);
        ProdottoAlimentare prosciutto = new ProdottoAlimentare("PROSC", "Prosciutto", 25);

        ProdottoNonAlimentare cartaIgienica = new ProdottoNonAlimentare("CIGN", "Carta Igienica", 6);
        ProdottoNonAlimentare scottex = new ProdottoNonAlimentare("CIGN", "Carta Scottex", 8);
        ProdottoNonAlimentare dixan = new ProdottoNonAlimentare("DET", "Detersivo", 15);

        Vendita vendite = new VenditaOnLine();
        vendite.esegui(pane, 1);
        vendite.esegui(pasta, 1);
        vendite.esegui(dixan, 1);
        System.out.println("La vendita di questi prodotti ha totalizzato un incasso di " + vendite.getTotaleComplessivoVendite() +" euro\n");

        // Notare che, pur avendo riutilizzato la stessa variabile "vendite", grazie alla parola chiave new é stata
        // creata una nuova istanza della classe Vendita e quindi la variabile é stata nuovamente reinizializzata
        // ad un nuovo riferimento in memoria. Il contenuto delle vendite precedenti non é piú accessibile.
        // Esiste ancora in memoria, ma non c'é modo di riprenderlo.
        vendite = new VenditaADomicilio();
        vendite.esegui(uova, 2);
        vendite.esegui(prosciutto, 1);
        vendite.esegui(scottex, 5);
        vendite.esegui(cartaIgienica, 2);
        System.out.println("La vendita di questi prodotti ha totalizzato un incasso di " + vendite.getTotaleComplessivoVendite() +" euro\n");


        // Quell'oggetto perso dell'istanza di Vendite verrebbe preso in consegna dal GarbageCollector (GC) di Java
        // se l'applicazione non si chiudesse qui.
        // Il GC ciclicamente si avvia e rimuove dalla memoria dell'applicazione tutti gli oggetti
        // che non risultano associati a nessuna variabile del programma.
    }
}
