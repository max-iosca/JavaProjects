package com.corso.java.orange.InterfacceComparableComparator.ordinamento.ordinamentoNoInterfaccia;

public class Famiglia implements Comparable<Famiglia> {

    private String cognome;
    private Integer nrFigli;

    public Famiglia(String cognome, Integer nrFigli) {
        this.cognome = cognome;
        this.nrFigli = nrFigli;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Integer getNrFigli() {
        return nrFigli;
    }

    public void setNrFigli(Integer nrFigli) {
        this.nrFigli = nrFigli;
    }

/*
    @Override
    public int compare(Famiglia o1, Famiglia o2) {
        return (o1.cognome+o1.nrFigli).compareTo(o2.getCognome()+o2.getNrFigli());
    }
*/
    @Override
    public int compareTo(Famiglia o) {
        return (this.cognome+this.nrFigli).compareTo(o.getCognome()+o.getNrFigli());
    }
}
