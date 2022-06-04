package com.corso.java.orangee.Eccezioni.contoCorrente;

public class ValoreImportoNonValido extends Exception {

    public ValoreImportoNonValido() {
    }

    public ValoreImportoNonValido(String message) {
        super(message);
    }
}