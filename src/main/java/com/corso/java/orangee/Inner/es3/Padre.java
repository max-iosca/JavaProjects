package com.corso.java.orangee.Inner.es3;

import java.time.LocalDate;


/**
 * Inner Class dentro un metodo di un'altra classe
 *
 */
public class Padre {

    private String nome;
    private LocalDate dataNascita;

    public void metodoConClasse() {
        int numeroFigli = 3;

        class ClasseDentroIlMetodo {
            public void stampa() {
                System.out.println("Stampa il nr dei figli " + numeroFigli);
            }
        }

        ClasseDentroIlMetodo istanzaClasseDentroIlMetodo = new ClasseDentroIlMetodo();
        istanzaClasseDentroIlMetodo.stampa();
    }
}
