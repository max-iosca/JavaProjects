package com.corso.java.orange.OtherProjectsAndTest.CalcolatriceEasy;

public class Moltiplicazione extends Operazione {

    @Override
    public int esegui() {
        return this.getOperando1() * this.getOperando2();
    }
}
