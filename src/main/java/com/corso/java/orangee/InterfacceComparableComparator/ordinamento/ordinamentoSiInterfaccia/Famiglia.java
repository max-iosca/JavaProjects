package com.corso.java.orangee.InterfacceComparableComparator.ordinamento.ordinamentoSiInterfaccia;

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

    @Override
    public int compareTo(Famiglia o) {
        return (this.getCognome()+this.getNrFigli()).compareTo(o.getCognome()+this.getNrFigli());
    }
}
