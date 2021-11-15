package com.corso.java.orange.InterfacceComparableComparator.esempioInterfaccia;

import java.util.List;

public class Fattura implements IEsegue{

    private int totaleFattura;
    private List<Integer> valori;

    public Fattura(List<Integer> valori) {
        this.valori = valori;
    }

    @Override
    public void esegui() {
        for(Integer valore: valori) {
            totaleFattura += valore;
        }
    }

    public void stampa() {
        System.out.println(totaleFattura);
    }
}
