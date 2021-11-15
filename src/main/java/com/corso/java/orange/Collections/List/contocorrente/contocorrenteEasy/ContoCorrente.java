package com.corso.java.orange.Collections.List.contocorrente.contocorrenteEasy;

import java.util.Random;

public class ContoCorrente {

    private int numeroDiConto;
    private int saldo;

    public ContoCorrente(int importoApertura){
        System.out.println("APERTURA CONTO CORRENTE");

        if(importoApertura >= 50) {
            this.numeroDiConto = calcolaNumeroRandom(999, 9999);
            this.saldo += importoApertura;
        } else {
            System.out.println("PER APRIRE UN NUOVO CONTO DEVI VERSARE MINIMO: 50 EURO");
        }
    }

    public int getNumeroDiConto() {
        return numeroDiConto;
    }

    public void setNumeroDiConto(int numeroDiConto) {
        this.numeroDiConto = numeroDiConto;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    private int calcolaNumeroRandom(int min, int max) {
        Random random = new Random();
        return random.nextInt(max) + min;
    }
}
