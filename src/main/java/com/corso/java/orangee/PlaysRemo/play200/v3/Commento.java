package com.corso.java.orangee.PlaysRemo.play200.v3;

import java.time.LocalDate;

public class Commento implements Comparable<Commento> {

    private String testoDelCommento;
    private Utente utenteDelCommento;
    private Post postLegatoAlCommento;
    private LocalDate dataDelCommento;

    public Commento(String testoDelCommento, Utente utenteDelCommento, Post postLegatoAlCommento) {
        this.testoDelCommento = testoDelCommento;
        this.utenteDelCommento = utenteDelCommento;
        this.postLegatoAlCommento = postLegatoAlCommento;
        this.dataDelCommento = dataDelCommento;
    }

    public String getTestoDelCommento() {
        return testoDelCommento;
    }

    public void setTestoDelCommento(String testoDelCommento) {
        this.testoDelCommento = testoDelCommento;
    }

    public Utente getUtenteDelCommento() {
        return utenteDelCommento;
    }

    public void setUtenteDelCommento(Utente utenteDelCommento) {
        this.utenteDelCommento = utenteDelCommento;
    }

    public LocalDate getDataDelCommento() {
        return dataDelCommento;
    }

    public void setDataDelCommento(LocalDate dataDelCommento) {
        this.dataDelCommento = dataDelCommento;
    }

    @Override
    public String toString() {
        return  "Data: "+dataDelCommento+"\r"
                +"Utente: "+utenteDelCommento+"\r"
                +"Commento: \r"
                +"-------------------------------------------"
                +testoDelCommento+"\r"
                +"-------------------------------------------\r";
    }

    @Override
    public int compareTo(Commento commento) {
        return dataDelCommento.compareTo(commento.getDataDelCommento());
    }
}
