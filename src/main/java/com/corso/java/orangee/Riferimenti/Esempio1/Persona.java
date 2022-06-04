package com.corso.java.orangee.Riferimenti.Esempio1;

public class Persona {
    private String nome;
    private String cognome;
    private String cf;
    private String residenza;

    public Persona(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }



    public Persona(String nome, String cognome, String cf) {
        this.nome = nome;
        this.cognome = cognome;
        this.cf = cf;
    }


    @Override
    public String toString() {
        return "Persona{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", residenza='" + residenza + '\'' +
                '}';
    }

    /**
     * Il metodo toString() é definito di base nella classe Object che é la classe
     * padre di tutte le class.
     * Questo metodo é eseguito in automatico da java quando usato, ad esempio, in un
     * system.out.println(qualunque-istanza-della-classe-Persona)
     * E' generabile in automatico da tutti gli IDE (Eclipse, Intellij, ecc.)
     * Puó, ovviamente, essere modificato a piacimento.
     * L'importante é che non si modifichi mai la firma del metodo.
     *
     * @return
     */


    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getResidenza() {
        return residenza;
    }

    public void setResidenza(String residenza) {
        this.residenza = residenza;
    }
}
