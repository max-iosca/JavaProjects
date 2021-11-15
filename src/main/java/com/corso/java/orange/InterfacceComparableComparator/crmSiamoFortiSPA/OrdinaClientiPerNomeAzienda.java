package com.corso.java.orange.InterfacceComparableComparator.crmSiamoFortiSPA;

import java.util.Comparator;

public class OrdinaClientiPerNomeAzienda implements Comparator<Cliente> {
    @Override
    public int compare(Cliente cliente1, Cliente cliente2) {
        String nomeAzienda1 = cliente1.getNomeAzienda();
        String nomeAzienda2 = cliente2.getNomeAzienda();
        return nomeAzienda1.compareTo(nomeAzienda2);
    }
}
