package com.corso.java.orangee.Inner.es2;

import java.time.LocalDate;


/**
 * Esempio con Inner-class non statica e Pubblica.
 */
public class Padre {

    private String nome;
    private LocalDate dataNascita;

    public class Figlio {
        private String nome;
        private LocalDate dataNascita;

        public Figlio(String nome, LocalDate dataNascita) {
            this.nome = nome;
            this.dataNascita = dataNascita;
        }

        public String getNome() {
            return nome;
        }

        public LocalDate getDataNascita() {
            return dataNascita;
        }
    }


    public Padre(String nomePadre, LocalDate etaPadre) {
        this.nome = nomePadre;
        this.dataNascita = etaPadre;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascita() {
        return dataNascita;
    }

}
