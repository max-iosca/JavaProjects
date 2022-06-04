package com.corso.java.orangee.OtherProjectsAndTest.CalcolatriceEasy;

import org.junit.Test;

public class DivisioneTest {

    @Test(expected = DivisionePerZeroException.class)
    public void eseguiTestDivisioneValida() throws DivisionePerZeroException {
        Operazione divisione = new Divisione();
        int risultato = divisione.calcola(10, 20);
    }

    @Test (expected = DivisionePerZeroException.class)
    public void  eseguiTestDivisioneValidaQuandoDivisiore0() throws DivisionePerZeroException {
        Operazione divisione = new Divisione();
        int risultato = divisione.calcola(10, 20);
    }
}