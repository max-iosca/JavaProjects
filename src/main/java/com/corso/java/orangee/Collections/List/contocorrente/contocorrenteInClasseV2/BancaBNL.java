package com.corso.java.orangee.Collections.List.contocorrente.contocorrenteInClasseV2;

import com.corso.java.orangee.Collections.List.contocorrente.contocorrenteInClasseDavid_Remo.Cliente;
import com.corso.java.orangee.Collections.List.contocorrente.contocorrenteInClasseDavid_Remo.ContoCorrente;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class BancaBNL {

    private static int ScopertoBanca;
    private Set<ContoCorrente> contiCorrentiBNL;
    private int contaContiChiusi;

    public BancaBNL() {
        contiCorrentiBNL = new HashSet<>();
        ScopertoBanca = Math.negateExact(1500);
    }

    /**
     * Consente ad un cliente di aprire un conto in banca.
     * <p>
     * Dato il cliente ed il deposito inziale, il c/c viene aperto per quel cliente se
     * il cliente non é giá correntista.
     *
     * @param versamentoIniziale valore del deposito iniziale
     * @param cliente            proprietario del c/c
     */
    public void aperturaConto(long versamentoIniziale, Cliente cliente) {
        if (cliente == null)
            return;
        for (ContoCorrente conto : contiCorrentiBNL) {
            if (conto.getCliente().equals(cliente)) {
                System.out.println(cliente.getNome()+" NON PUOI AVERE PIU' DI UN CONTO APERTO IN QUESTA BANCA");
                return;
            }
        }
        contiCorrentiBNL.add(new ContoCorrente(cliente, versamentoIniziale, 2000));
        System.out.println("APERTURA CONTO: "+ cliente.getNome() + " - VERSAMENTO INIZIALE: "+versamentoIniziale+" EURO");
    }


    /**
     * Consente ad un cliente di prelevare somme di denaro da un conto.
     * <p>
     * Il cliente deve essere un correntista della banca.
     * In tal caso viene effettuato il prelievo dal suo conto corrente.
     *
     * @param cliente proprietario del c/c
     * @param importo valore del prelievo
     */
    public void prelievo(Cliente cliente, long importo) {
        if (importo <= 0 || cliente == null)
            return;
        for (ContoCorrente conto : contiCorrentiBNL) {
            if (conto.getCliente().equals(cliente)) {
                conto.prelievo(importo);
                break;
            }
        }
    }


    /**
     * Consente ad un cliente di versare somme di denaro da un conto indicando il cliente
     * <p>
     * Il cliente deve essere un correntista della banca.
     * In tal caso viene effettuato un versamento sul suo conto corrente.
     *
     * @param cliente proprietario del c/c
     * @param importo valore del prelievo
     */
    public void versamento(Cliente cliente, long importo) {
        if (importo <= 0 || cliente == null)
            return;
        boolean clienteTrovato = false;
        for (ContoCorrente conto : contiCorrentiBNL) {
            if (conto.getCliente().equals(cliente)) {
                clienteTrovato = true;
                conto.versamento(importo);
                break;
            }
        }
        if (!clienteTrovato)
            System.out.println("Cliente non trovato");
    }


    /**
     * Consente ad un cliente di versare somme di denaro da un conto indicando il conto.
     * <p>
     * Il c/c deve essere un conto attivo nella banca.
     * In tal caso viene effettuato un versamento su quel conto corrente.
     *
     * @param contoCorrente il proprietario del conto
     * @param importo       il valore del prelievo
     */
    public void versamento(ContoCorrente contoCorrente, long importo) {
        if (contiCorrentiBNL.contains(contoCorrente))
            contoCorrente.versamento(importo);
        else
            System.out.println("Cliente non trovato con questo CC");
    }


    /**
     * Consente la chiusura del conto corrente associato al cliente.
     * <p>
     * esegue la chiusura del c/c dato un cliente.
     * Se il cliente non risulta tra i correntisti il conto non viene chiuso.
     *
     * @param cliente proprietario del c/c
     */
    public void chiusuraConto(Cliente cliente) {
        if (cliente == null)
            return;
        Iterator<ContoCorrente> iterator = contiCorrentiBNL.iterator();
        while (iterator.hasNext()) {
            ContoCorrente conto = iterator.next();
            if (conto.getCliente().equals(cliente)) {
                iterator.remove();
                contaContiChiusi++;
                break;
            }
        }
    }


    /**
     * Stampa l'estratto conto di un conto associato al cliente.
     * <p>
     * delega la classe ContoCorrente a stampare il conto corrente del cliente.
     *
     * @param cliente proprietario del c/c
     */
    public void stampaEstrattoConto(Cliente cliente) {
        if (cliente == null)
            return;
        for (ContoCorrente conto : contiCorrentiBNL) {
            if (conto.getCliente().equals(cliente))
                conto.stampaEstrattoConto();
        }
    }

    /**
     * Dato un cliente ritorna il conto corrente associato.
     * <p>
     * Se il conto non é stato trovato ritorna null.
     *
     * @param cliente proprietario del c/c
     * @return
     */
    public ContoCorrente getContoCorrente(Cliente cliente) {
        if (cliente == null)
            return null;
        for (ContoCorrente conto : contiCorrentiBNL) {
            if (conto.getCliente().equals(cliente))
                return conto;
        }
        return null;
    }


    public Set<ContoCorrente> getContiCorrentiBNL() {
        return contiCorrentiBNL;
    }

    public int getContaContiChiusi() {
        return contaContiChiusi;
    }
}
