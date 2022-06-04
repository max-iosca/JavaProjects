package com.corso.java.orangee.OtherProjectsAndTest.CalcolatriceEasy;

public abstract class Operazione {

    private int operando1;
    private int operando2;


    public int getOperando1() {
        return operando1;
    }

    public int getOperando2() {
        return operando2;
    }


    public int calcola(int operando1, int operando2) throws DivisionePerZeroException {
        this.operando1 = operando1;
        this.operando2 = operando2;
        int risultato = this.esegui();
        return risultato;
    }

    public abstract int esegui() throws DivisionePerZeroException;

}