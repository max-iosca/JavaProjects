package com.corso.java.orangee.InterfacceComparableComparator.istitutiDiCredito;

import java.util.ArrayList;
import java.util.List;

public class Famiglia {

    private Persona marito;
    private Persona moglie;
    /**
     * SI, IL TIPO DI COLLECTION VA DICHIARATA TIPICAMENTE NEL COSTRUTTORE
     * MA LANCIANDO IL PROGRAMMA, LA LISTA 'FIGLI' NON VENIVA MAI POPOLATA E NON SO PERCHE'
     * INIZIALMENTE ERA UN 'SET' DATO CHE NON PUOI AVERE DUE FIGLI UGUALI
     * ANCHE SE GEMELLI, NON AVRANNO LO STESSO NOME.
     * PER ORA LASCIO ARRAYLIST, MA SAREBBE PIU' OPPORTUNA UNA HASHSET.
     */
    private List<Persona> figli = new ArrayList<>();
    private Integer capitaleTotale;

    public Famiglia(Persona marito, Persona moglie, List<Persona> figli, Integer capitaleTotale) {
        this.marito = marito;
        this.moglie = moglie;
        this.figli = figli;
        this.capitaleTotale = capitaleTotale;
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

    public List<Persona> getFigli() {
        return figli;
    }

    public void setFigli(List<Persona> figli) {
        this.figli = figli;
    }

    public Integer getCapitaleTotale() {
        return capitaleTotale;
    }

    public void setCapitaleTotale(Integer capitaleTotale) {
        this.capitaleTotale = capitaleTotale;
    }



    public int getNumeroNucleoFamiliare() {
        int numNucleoFamiliare = 0;
        if (marito != null)
            numNucleoFamiliare += 1;
        if (moglie != null)
            numNucleoFamiliare += 1;
        for (Persona figlio : figli) {
            if (figlio != null)
                numNucleoFamiliare += 1;
        }
        return numNucleoFamiliare;
    }


/* METODI NON PIU NECESSARI....FOLLIA E FANTASIA....
    public int getEtaFiglio() {
        int valoreEta = 0;
        for (Persona figlio : figli) {
            valoreEta = figlio.getEta();
        }
        return valoreEta;
    }

    public String getRuoloFigli() {
        String ruoloFiglio = "";
        for (Persona figlio : figli)
            ruoloFiglio = figlio.getRuolo();
        return ruoloFiglio;
    }

    public void ciclaFamiglia() {
        for (Persona elemento : componentiFamiglia) {

        }
    }

    public List<Persona> getComponentiFamiglia() {
        return componentiFamiglia;
    }

    public void setComponentiFamiglia(List<Persona> componentiFamiglia) {
        this.componentiFamiglia = componentiFamiglia;
    }
*/
}
