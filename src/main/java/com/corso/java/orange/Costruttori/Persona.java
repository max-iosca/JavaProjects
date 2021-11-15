package com.corso.java.orange.Costruttori;

public class Persona {
    private String nome;
    private String cognome;
    private String cf;
    private int eta;

    public Persona(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }



    public Persona(String nome, String cognome, String cf) {
        this.nome = nome;
        this.cognome = cognome;
        this.cf = cf;
    }


    /**
     * Il metodo toString() é definito di base nella classe Object che é la classe
     * padre di tutte le class.
     * Questo metodo é eseguito in automatico da java quando usato, ad esempio, in un
     * system.out.println(qualunque-istanza-della-classe-Persona)
     * E' generabile in automatico da tutti gli IDE (Eclipse, Intellij, ecc.)
     * Puó, ovviamente, essere modificato a piacimento.
     * L'importante é che non si modofichi mai la firma del metodo.
     *
     * @return
     */
    @Override
    public String toString() {
        return "Persona{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", cf='" + cf + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }
}
