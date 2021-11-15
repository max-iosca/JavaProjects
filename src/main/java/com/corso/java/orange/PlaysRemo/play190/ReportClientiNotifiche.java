package com.corso.java.orange.PlaysRemo.play190;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public abstract class ReportClientiNotifiche {

    /**
     *
     * @param clienti
     * @param comparator
     */
    public void stampa(Set<Cliente> clienti, Comparator<Cliente> comparator) {
        Set<Cliente> clientiOrdinati = new TreeSet<>(comparator);
        clientiOrdinati.addAll(clienti);
        stampaTitolo();
        for(Cliente cliente: clientiOrdinati) {
            String notificaEmail = (cliente.isNotificaEmail()?"Email":"");
            String notificaSMS = (cliente.isNotificaSMS()?"SMS":"");
            if (!notificaEmail.isEmpty() || !notificaSMS.isEmpty())
                stampaDettaglio(cliente, notificaSMS, notificaEmail);
        }
    }

    protected abstract void stampaDettaglio(Cliente cliente, String notificaSMS, String notificaEmail);

    protected abstract void stampaTitolo();

}
