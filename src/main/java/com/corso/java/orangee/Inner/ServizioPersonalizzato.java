package com.corso.java.orangee.Inner;

import com.corso.java.orangee.PlaysRemo.play001.Persona;

public class ServizioPersonalizzato {

    private String nomeServizio;
    private int costoServizio;
    public static  class Soggetto {
        private String nomeSoggetto;
        private String cognomeSoggetto;
        private int nrComponentiFamiliari;
    }

    public ServizioPersonalizzato(String nomeServizio, int costoServizio, Persona persona) {
        this.nomeServizio = nomeServizio;
        this.costoServizio = costoServizio;
        Soggetto soggetto = new Soggetto();
        soggetto.nomeSoggetto = persona.getNome();
        soggetto.cognomeSoggetto = persona.getCogmome();
    }

    public String getNomeServizio() {
        return nomeServizio;
    }

    public void setNomeServizio(String nomeServizio) {
        this.nomeServizio = nomeServizio;
    }

    public int getCostoServizio() {
        return costoServizio;
    }

    public void setCostoServizio(int costoServizio) {
        this.costoServizio = costoServizio;
    }
}
