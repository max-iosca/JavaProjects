package com.corso.java.orange.Eccezioni.contoCorrente;

public class ValoreImportoNonValido extends Exception {

    public ValoreImportoNonValido() {
    }

    public ValoreImportoNonValido(String message) {
        super(message);
    }
}