package com.corso.java.orangee.OtherProjectsAndTest.Euroconvertitore.max;

public class FakeSitoCambi extends SitoCambi {

    private double valore;

    FakeSitoCambi(double valore) {
        this.valore = valore;
    }

    double ottieniCambio(String valuta) {
        return valore;
    }
}
