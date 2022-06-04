package com.corso.java.orangee.Collections.List.esercizioIterator1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Questo esempio spiega come rimuovere elementi da una lista in base a specifiche condizioni
 *
 * NON POSSO RIMUOVERE UN OGGETTO/ELEMENTO DA UNA LISTA (LIST) DENTRO UN CICLO. E COME SI FA?
 * CON UN ITERATORE, CHE HA QUESTA SINTASSI;
 *
 * Iterator<TipoElementi> iterator = nomelista.listIterator();
 * while(iterator.hasNext()){ // questo hasNext() ritorna un booleano, se c'è quindi un elemento in quella lista.
 *     TipoElementi item = iterator.next();
 *     iterator.remove();
 *     System.out.println("Rimosso libro" + item.getTitolo() + "Dalla lista 'nomeLista' ");
 * }
 */
public class Main {

    public static void main(String[] args) {
        List<Macchina> macchine = new ArrayList<>();
        macchine.add(new Macchina("Fiat 500", 2001));
        macchine.add(new Macchina("Fiesta 505", 2001));
        macchine.add(new Macchina("Ferrari GT", 2005));
        macchine.add(new Macchina("Yaris I", 2005));
        macchine.add(new Macchina("Punto X", 2005));

        System.out.println("Tutte le macchine");
        stampaMacchine(macchine);

        // rimuove tutte le macchine prodotte nel 2001
        rimuoviMacchinePerAnno(macchine, 2001);

        // rimarranno solo quelle del 2005.
        System.out.println("\nSolo le macchine del 2005 perché quelle del 2001 sono state correttamente rimosse");
        stampaMacchine(macchine);
    }

    /**
     * Rimuove dalla lista solo le macchine che sono state prodotte in un particolare anno.
     *
     * @param macchineList
     * @param anno
     */
    public static void rimuoviMacchinePerAnno(List<Macchina> macchineList, int anno) {
        Iterator<Macchina> macchineIterator = macchineList.iterator();
        while(macchineIterator.hasNext()) {
            if (macchineIterator.next().getAnno().equals(anno)) {
                macchineIterator.remove();
            }
        }
    }


    /**
     * Stampa l'intero elenco delle macchine
     *
     * @param macchine
     */
    private static void stampaMacchine(List<Macchina> macchine) {
        for(Macchina macchina: macchine) {
            System.out.println("Macchina: "+ macchina.getModello() + ", anno: " + macchina.getAnno());
        }
    }

}
