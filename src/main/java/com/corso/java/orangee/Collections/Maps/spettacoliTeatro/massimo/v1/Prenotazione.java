package com.corso.java.orangee.Collections.Maps.spettacoliTeatro.massimo.v1;

public class Prenotazione {

    private final int NR_MAX_POSTI = 25;
    private Famiglia famiglia;
    private int postiPrenotati;
    private int progressivoPrenotazione;
    private int postiAttualmenteOccupati;

    public Prenotazione(Famiglia famiglia, int postiPrenotati) {
        progressivoPrenotazione++;
        this.famiglia = famiglia;
        if(this.postiPrenotati > famiglia.getNrComponenti()) {
            System.out.println("POSTI PRENOTATI SUPERIORE AL NUMERO COMPONENTI NUCLEO FAMILIARE");
        } else {
            this.postiPrenotati = postiPrenotati;
            postiAttualmenteOccupati += postiPrenotati;
        }
        if(postiAttualmenteOccupati > NR_MAX_POSTI)
            System.out.println("ERRORE, DISPONIBILI SOLO: "+(NR_MAX_POSTI-postiAttualmenteOccupati));
    }

    public int getProgressivoPrenotazione() {
        return progressivoPrenotazione;
    }

    public void setProgressivoPrenotazione(int progressivoPrenotazione) {
        this.progressivoPrenotazione = progressivoPrenotazione;
    }

    public Famiglia getFamiglia() {
        return famiglia;
    }

    public void setFamiglia(Famiglia famiglia) {
        this.famiglia = famiglia;
    }

    public int getPostiPrenotati() {
        return postiPrenotati;
    }

    public void setPostiPrenotati(int postiPrenotati) {
        this.postiPrenotati = postiPrenotati;
    }

    public int getPostiAttualmenteOccupati() {
        return postiAttualmenteOccupati;
    }

}
