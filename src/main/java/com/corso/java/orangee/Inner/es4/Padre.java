package com.corso.java.orangee.Inner.es4;

import com.corso.java.orangee.Inner.es3.StampaPadre;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Esempio con Classe Anonima innestata in una classe
 * (anonymous Inner Class)
 */
public class Padre {

    private String nome;
    private LocalDate dataNascita;

    public Padre(String nomePadre, LocalDate etaPadre) {
        this.nome = nomePadre;
        this.dataNascita = etaPadre;
    }

    public StampaPadre stampa2() {
        return new StampaPadre() {
            @Override
            public String stampa() {
                return null;
            }
        };
    }

    public String stampa() {
        StampaPadre stampaPadre = new StampaPadre() {
            @Override
            public String stampa() {
                return "Padre: " + getNome() + ", data nascita: " + getDataNascita().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            }
        };
        return stampaPadre.stampa();
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascita() {
        return dataNascita;
    }
}
