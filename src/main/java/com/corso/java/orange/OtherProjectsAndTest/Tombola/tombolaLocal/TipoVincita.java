package com.corso.java.orange.OtherProjectsAndTest.Tombola.tombolaLocal;

public class TipoVincita {
    private int numeroOccorrenze;
    private String nomeVincita;

    public TipoVincita(int numeroOccorrenze) {
        this.numeroOccorrenze = numeroOccorrenze;
        if (this.numeroOccorrenze==2)
            this.nomeVincita = "AMBO";
    }

    public int getNumeroOccorrenze() {
        return numeroOccorrenze;
    }

    public void setNumeroOccorrenze(int numeroOccorrenze) {
        this.numeroOccorrenze = numeroOccorrenze;
    }

    public String getNomeVincita() {
        return nomeVincita;
    }

    public void setNomeVincita(String nomeVincita) {
        this.nomeVincita = nomeVincita;
    }
}
