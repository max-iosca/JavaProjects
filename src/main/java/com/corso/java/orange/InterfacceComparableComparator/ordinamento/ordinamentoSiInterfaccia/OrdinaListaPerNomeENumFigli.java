package com.corso.java.orange.InterfacceComparableComparator.ordinamento.ordinamentoSiInterfaccia;

import java.util.Comparator;

public class OrdinaListaPerNomeENumFigli implements Comparator<Famiglia> {

    @Override
    public int compare(Famiglia o1, Famiglia o2) {
        /*String cognome01 = o1.getCognome();
        String cognome02 = o2.getCognome();
        Integer nrFigli01 = o1.getNrFigli();
        Integer nrFigli02 = o2.getNrFigli();
        return (cognome01+nrFigli01).compareTo(cognome02+nrFigli02);*/
        //return ((o1.getCognome())+o1.getNrFigli()).compareTo(o2.getCognome()+ o2.getNrFigli());
        return (((o1.getCognome())+o1.getNrFigli()).compareTo(o2.getCognome()+ o2.getNrFigli()));
    }

}
