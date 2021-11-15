package com.corso.java.orange.InterfacceComparableComparator.ComparableEComparator.esempio1;

import java.util.Comparator;

public class OrdinaPersonePerEta implements Comparator<Persona> {

    @Override
    public int compare(Persona persona1, Persona persona2) {
        Integer etaPersona1 = persona1.getEta();
        Integer etaPersona2 = persona2.getEta();
        return etaPersona1.compareTo(etaPersona2);
    }
}
