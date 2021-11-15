package com.corso.java.orange.InterfacceComparableComparator.istitutiDiCredito;

public class Persona {
    private String ruolo;
    private String nome;
    private String cognome;
    private int eta;

    public Persona(String ruolo, String nome, String cognome, int eta) {
        this.ruolo = ruolo;
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    public String getRuolo() {
        return ruolo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }
}
