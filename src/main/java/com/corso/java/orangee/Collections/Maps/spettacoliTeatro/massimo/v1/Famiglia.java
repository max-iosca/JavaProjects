package com.corso.java.orangee.Collections.Maps.spettacoliTeatro.massimo.v1;

public class Famiglia {
    private Persona marito;
    private Persona moglie;
    private int nrFigli;
    private int nrComponenti;

    public Famiglia(Persona marito, Persona moglie, int nrFigli) {
        this.marito = marito;
        this.moglie = moglie;
        this.nrFigli = nrFigli;
        this.nrComponenti = 0; //avrebbe logicamente senso = 1, ma fa comodo = 0 nel codice
        if (marito != null)
        nrComponenti++;
        if (moglie != null)
            nrComponenti++;
        if (nrComponenti != 0)
            nrComponenti += nrFigli;
    }

    public Persona getMarito() {
        return marito;
    }

    public Persona getMoglie() {
        return moglie;
    }

    public int getNrfigli() {
        return nrFigli;
    }

    public int getNrComponenti() {
        return nrComponenti;
    }

/*
    @Override
    public String toString() {
        return "Marito: "+marito+", Moglie: " +moglie+", figli: " +nrFigli+", TotComponenti: " +nrComponenti+"\n";
    }
*/

}
