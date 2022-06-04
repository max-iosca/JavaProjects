package com.corso.java.orangee.Riferimenti.Esempio2;

public class Persona {

    private String nome;
    private String cognome;
    private String genere;

    public Persona(String nome, String cognome, String genere) {
        this.nome = nome;
        this.cognome = cognome;
        this.genere = genere;
    }


    @Override
    public String toString() {
        return "Persona{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", genere='" + genere + '\'' +
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

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }
}
