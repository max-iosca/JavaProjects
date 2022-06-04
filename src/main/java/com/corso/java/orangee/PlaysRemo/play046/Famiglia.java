package com.corso.java.orangee.PlaysRemo.play046;

import com.corso.java.orangee.PlaysRemo.play018.Persona;


/**
 * Contiene oggetti Marito e Moglie di tipo Persona ed un numero che indica la prole.
 *
 */
public class Famiglia {

    private Persona marito;
    private Persona moglie;
    private int numeroFigli;

    public Famiglia(Persona marito, Persona moglie, int numeroFigli) {
        this.marito = marito;
        this.moglie = moglie;
        this.numeroFigli = numeroFigli;
    }

    /**
     * Calcola l'effettivo nr di componenti della famiglia
     * tenendo conto che uno dei due coniugi potremme non essere presente.
     * @return numero dei componenti della famglia
     */
    public int getNrComplessivoComponenti() {
        int result = 0;
        if (this.marito!=null) result++;
        if (this.moglie!=null) result++;
        result += numeroFigli;
        return result;
    }

    public Persona getMarito() {
        return marito;
    }

    public void setMarito(Persona marito) {
        this.marito = marito;
    }

    public Persona getMoglie() {
        return moglie;
    }

    public void setMoglie(Persona moglie) {
        this.moglie = moglie;
    }

    public int getNumeroFigli() {
        return numeroFigli;
    }

    public void setNumeroFigli(int numeroFigli) {
        this.numeroFigli = numeroFigli;
    }
}
