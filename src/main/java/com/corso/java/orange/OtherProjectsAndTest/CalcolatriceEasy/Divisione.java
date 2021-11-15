package com.corso.java.orange.OtherProjectsAndTest.CalcolatriceEasy;

public class Divisione extends Operazione {

    @Override
    public int esegui() throws DivisionePerZeroException {
        if(this.getOperando2() == 0)
            throw new DivisionePerZeroException();
        return this.getOperando1() / this.getOperando2();
    }
}
