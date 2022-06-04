package com.corso.java.orangee.Eccezioni.studioMedico;

public class Paziente {
    private String nome;
    private String cf;
    private int nrVisite; //COMPLESSIVO

    public Paziente(String nome, String cf) {
        this.nome = nome;
        this.cf = cf;
        this.nrVisite = nrVisite;
    }

    public int getNrVisite() {
        return nrVisite;
    }

    public void setNrVisite(int nrVisite) {
        this.nrVisite = nrVisite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCf() {
        return cf;
    }

    public void setCf(String cf) {
        this.cf = cf;
    }
/*
    public void controllaNrMaxVisite(Medico medico) {
        if(nrVisite > 2 && medico.getSpecializzazione().equals(medico) ){
            System.out.println("IL PAZIENTE: "+this.nome+" HA GIA 2 VISITE CON IL MEDICO: "+medico.getNome());
            return;
        }
    }
 */
}
