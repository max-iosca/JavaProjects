package com.corso.java.orangee.PlaysRemo.play116;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


/**
 * La banca gestisce un elenco di conti corrrenti.
 * Il c/c deve essere associato ad un cliente.
 * La banca consente di chiudere il conto corrente
 *
 */
public class Banca {
    private Set<ContoCorrente> contiCorrenti;

    private static int nrContiCorrentiChiusi;

    public Banca() {
        contiCorrenti = new HashSet<>();
    }

    /**
     * Consente ad un cliente di aprire un conto in banca.
     *
     * Dato il cliente ed il deposito inziale, il c/c viene aperto per quel cliente se
     * il cliente non é giá correntista.
     *
     * @param versamentoIniziale valore del deposito iniziale
     * @param cliente proprietario del c/c
     */
    public void aperturaConto(long versamentoIniziale, Cliente cliente, long massimoScoperto) {
        if (cliente == null)
            return;

        contiCorrenti.add(new ContoCorrente(cliente, versamentoIniziale,massimoScoperto));
    }


    /**
     * Consente ad un cliente di prelevare somme di denaro da un conto.
     *
     * Il cliente deve essere un correntista della banca.
     * In tal caso viene effettuato il prelievo dal suo conto corrente.
     *
     * @param cliente proprietario del c/c
     * @param importo valore del prelievo
     */
    public void prelievo(Cliente cliente, long importo) {
        if (importo <= 0 || cliente == null)
            return;
        for (ContoCorrente conto : contiCorrenti) {
            if (conto.getCliente().equals(cliente)) {
                conto.prelievo(importo);
                break;
            }
        }
    }


    /**
     * Consente ad un cliente di versare somme di denaro da un conto indicando il cliente
     *
     * Il cliente deve essere un correntista della banca.
     * In tal caso viene effettuato un versamento sul suo conto corrente.
     *
     * @param cliente proprietario del c/c
     * @param importo valore del prelievo
     */
    public void versamento(Cliente cliente, long importo) {
        if (importo <= 0 || cliente == null)
            return;
        boolean clienteTrovato=false;
        for (ContoCorrente conto : contiCorrenti) {
            if (conto.getCliente().equals(cliente)) {
                clienteTrovato=true;
                conto.versamento(importo);
                break;
            }
        }
        if (!clienteTrovato)
            System.out.println("Cliente non trovato");
    }


    /**
     * Consente ad un cliente di versare somme di denaro da un conto indicando il conto.
     *
     * Il c/c deve essere un conto attivo nella banca.
     * In tal caso viene effettuato un versamento su quel conto corrente.
     *
     * @param contoCorrente il proprietario del conto
     * @param importo il valore del prelievo
     */
    public void versamento(ContoCorrente contoCorrente, long importo){
        if (contiCorrenti.contains(contoCorrente))
            contoCorrente.versamento(importo);
        else
            System.out.println("Cliente non trovato con questo CC");
    }


    /**
     * Consente la chiusura del conto corrente associato al cliente.
     *
     * esegue la chiusura del c/c dato un cliente.
     * Se il cliente non risulta tra i correntisti il conto non viene chiuso.
     *
     * @param cliente proprietario del c/c
     */
    public void chiusuraConto(Cliente cliente) {
        if (cliente == null)
            return;
        Iterator<ContoCorrente> iterator = contiCorrenti.iterator();
        while (iterator.hasNext()) {
            ContoCorrente conto = iterator.next();
            if (conto.getCliente().equals(cliente)) {
                iterator.remove();
                nrContiCorrentiChiusi++;
                break;
            }
        }
    }


    /**
     * Stampa l'estratto conto di un conto associato al cliente.
     *
     * delega la classe ContoCorrente a stampare il conto corrente del cliente.
     *
     * @param cliente proprietario del c/c
     */
    public void stampaEstrattoConto(Cliente cliente) {
        if (cliente == null)
            return;
        for (ContoCorrente conto : contiCorrenti) {
            if (conto.getCliente().equals(cliente))
                conto.stampaEstrattoConto();
        }
    }


    /**
     * Dato un cliente ritorna il conto corrente associato.
     *
     * Se il conto non é stato trovato ritorna null.
     *
     * @param cliente proprietario del c/c
     * @return
     */
    public ContoCorrente getContoCorrente(Cliente cliente){
        if (cliente == null)
            return null;
        for(ContoCorrente conto : contiCorrenti ){
            if (conto.getCliente().equals(cliente))
                return conto;
        }
        return null;
    }


    /**
     *
     * @return
     */
    public static int getNrContiCorrentiChiusi() {
        return nrContiCorrentiChiusi;
    }
}
