package com.corso.java.orangee.Inner.es1;

import java.time.LocalDate;


/**
 * Esempio con Inner-class non statica e Privata.
 */
public class Padre {

    private String nome;
    private LocalDate dataNascita;
    private Figlio figlio;

    private class Figlio {
        private String nome;
        private LocalDate dataNascita;

        public Figlio(String nome, LocalDate dataNascita) {
            this.nome = nome;
            this.dataNascita = dataNascita;
        }
    }


    public Padre(String nomePadre, LocalDate etaPadre, String nomeFiglio, LocalDate dataNascita) {
        this.nome = nomePadre;
        this.dataNascita = etaPadre;
        figlio = new Figlio(nomeFiglio, dataNascita);
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascita() {
        return dataNascita;
    }

    public String getNomeFiglio() {
        return figlio.nome;
    }

    public LocalDate getDataNascitaFiglio() {
        return figlio.dataNascita;
    }
}
