package com.corso.java.orangee.Collections.Maps.spettacoliTeatro.massimo.v2;


public class Teatro {

    private static final int NR_MAX_POSTI = 25;
    private int postiAttualmenteOccupati = 0;
    private int postiAncoraLiberi;

    public int getNR_MAX_POSTI() {
        return NR_MAX_POSTI;
    }

    public int getPostiAttualmenteOccupati() {
        return postiAttualmenteOccupati;
    }

    public void setPostiAttualmenteOccupati(int postiAttualmenteOccupati) {
        this.postiAttualmenteOccupati = postiAttualmenteOccupati;
    }

    public int getPostiAncoraLiberi() {
        return postiAncoraLiberi;
    }

    public void setPostiAncoraLiberi(int postiAncoraLiberi) {
        this.postiAncoraLiberi = postiAncoraLiberi;
    }


}
