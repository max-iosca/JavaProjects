package com.corso.java.orangee.Collections.Maps.spettacoliTeatro.massimo.v2;

import com.corso.java.orangee.Collections.Maps.spettacoliTeatro.massimo.v1.Famiglia;

public class Prenotazione {
    private Famiglia famiglia;
    private Teatro teatro;
    private int postiPrenotati;
    private int progressivoPrenotazione;

    public Prenotazione(Famiglia famiglia, int postiPrenotati) {
        this.famiglia = famiglia;
        if(postiPrenotati > famiglia.getNrComponenti()) {
            System.out.println("POSTI PRENOTATI SUPERIORE AL NUMERO COMPONENTI NUCLEO FAMILIARE");
        } else {
            this.postiPrenotati = postiPrenotati;
            teatro.setPostiAttualmenteOccupati(+postiPrenotati);
            progressivoPrenotazione++;
        }
        if(teatro.getPostiAttualmenteOccupati() > teatro.getNR_MAX_POSTI())
            System.out.println("ERRORE, DISPONIBILI SOLO: "+(teatro.getNR_MAX_POSTI()-teatro.getPostiAttualmenteOccupati()));
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

}
