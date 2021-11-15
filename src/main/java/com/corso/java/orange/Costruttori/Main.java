package com.corso.java.orange.Costruttori;


/**
 * Esempio che mostra l'uso di costruttori.
 */
public class Main {

    public static void main(String[] args) {
        // crea una istanza di nome 'variabilePersona' di tipo Persona chiamando il costruttore con argomenti
        Persona variabilePersona = new Persona("Remo", "Candeli");

        // crea una variabile 'fiat500' di tipo Macchina chiamando il costruttore con argomenti
        Macchina fiat500 = new Macchina(variabilePersona, 3000);

        // stampa nome e cognome del proprietario della macchina
        System.out.println(fiat500.getProprietario().getCognome() + " " + fiat500.getProprietario().getNome());
    }
}
