package com.corso.java.orangee.InterfacceComparableComparator.esempioInterfaccia;

public class Fattorino implements IEsegue{

    private String testo;

    public void invia(String testo) {
        this.testo = testo;
    }

    public String ricevi() {
        return testo;
    }

    @Override
    public void esegui() {

    }
}
