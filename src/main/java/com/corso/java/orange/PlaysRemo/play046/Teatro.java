package com.corso.java.orange.PlaysRemo.play046;

import java.util.HashMap;
import java.util.Map;

/**
 * Questa classe mantiene le informazioni delle prenotazioni associate ad una famiglia.<br>
 * Concede, ad una famiglia, la possibilitá di prenotare, modificare la propria prenotazione o cancellarla.
 * Viene utilizzato un contatore dei posti liberi.<br>
 * Una opzione alternativa poteva essere quella di utilizzare un contatore di posti occpuati.<br>
 * Una ulteriore alternativa é quella di ricalcolare ogni volta il numero di posti occupati rileggendosi
 * tutta la mappa dell prenotazioni attive.<br>Meno ingarbugliata delle somme algebriche ma anche un po meno
 * performante, probabilmente.
 */
public class Teatro {

    private final static int nrMaxPosti = 25;
    private Map<Famiglia, Integer> prenotazioni;
    private int nrPostiLiberi;

    public Teatro() {
        this.prenotazioni = new HashMap<>();
        this.nrPostiLiberi = nrMaxPosti;
    }


    /**
     * Consente di prenotare indicando la famiglia ed il numero posti da occupare
     * Se i posti non sono disponibili viene emesso un messaggio e la prenotazione non viene conclusa.
     * @param famiglia famiglia che prenota
     * @param nrPostiRichiesti numero prenotazioni richieste
     */
    public void prenotazione(Famiglia famiglia, int nrPostiRichiesti) {
        if ((nrPostiLiberi-nrPostiRichiesti)<0) {
            System.out.println("Non sono disponibili i posti richiesti " + nrPostiRichiesti);
            return;
        }
        prenotazioni.put(famiglia, nrPostiRichiesti);
        nrPostiLiberi -= nrPostiRichiesti;
        System.out.println("Prenotazione di posti " + nrPostiRichiesti + " accettata per la famiglia " + famiglia.getMarito().getCognome());
    }


    /**
     * Consente di modificare il numero dei posti precedentemente prenotati da una famiglia.
     * Viene sempre verificata la disponibilitá dei posti.
     * Il calcolo dei nuovi posti liberi deve tener conto dei posti occupati precedentemente dalla famiglia.
     * Questi devono, quindi, essere prima aggiunti come posti liberi e poi devono essere sottratti nuovamente quelli
     * richiesti nel cambio prenotazione.
     *
     * @param famiglia famiglia che modifica la prenotazione
     * @param nrPostiRichiesti nuovo numero posti richiesti
     */
    public void cambiaPrenotazione(Famiglia famiglia, int nrPostiRichiesti) {
        if (prenotazioni.get(famiglia)==null) {
            System.out.println("Non esiste alcuna prenotazione da modificare per la famiglia " + famiglia.getMarito().getCognome());
            return;
        }
        int nrPostiPrecedentementeOccupatiDallaFamiglia = prenotazioni.get(famiglia);
        // libero virtualmente i posti occupati dalla precedente prenotazione
        int nrPostiPrecedentementeLiberi = nrPostiLiberi + nrPostiPrecedentementeOccupatiDallaFamiglia;
        // verifico che il nr di posti disponibili non sia inferiore a quelli richiesti
        if ((nrPostiPrecedentementeLiberi - nrPostiRichiesti)<=0) {
            System.out.println("Non sono disponibili i posti richiesti " + nrPostiRichiesti);
            return;
        }
        // sottraggo i posti richiesti a quelli liberi
        nrPostiLiberi = nrPostiPrecedentementeLiberi - nrPostiRichiesti;
        // aggiorno la mappa
        prenotazioni.put(famiglia, nrPostiRichiesti);
        System.out.println("Modifica prenotazione di posti " + nrPostiRichiesti + " precedentemente occupati("+ nrPostiPrecedentementeOccupatiDallaFamiglia  + ") accettata per la famiglia " + famiglia.getMarito().getCognome());
    }

    /**
     * La disdetta rimuove la famiglia dalla mappa delle prenotazioni e riaggiunge al contatore dei posti
     * liberi il numero di posti precedentemente occupati dalla famiglia.
     *
     * @param famiglia famiglia che disdice la prenotazione
     */
    public void disdettaPrenotazione(Famiglia famiglia) {
        if (prenotazioni.get(famiglia)==null) {
            System.out.println("Non esiste alcuna prenotazione da modificare per la famiglia " + famiglia.getMarito().getCognome());
            return;
        }
        System.out.println("Disdetta prenotazione di posti " + prenotazioni.get(famiglia) + " accettata per la famiglia " + famiglia.getMarito().getCognome());
        nrPostiLiberi += prenotazioni.get(famiglia);
        prenotazioni.remove(famiglia);
    }

    public void reportPrenotazioni() {
        System.out.println("\n\nNr totale di posti occupati: " + (nrMaxPosti - nrPostiLiberi));
        for(Famiglia famiglia: prenotazioni.keySet()) {
            System.out.println("\tFamiglia " + famiglia.getMarito().getCognome() + " occupa: " + prenotazioni.get(famiglia) + " posti");
        }
    }
}
