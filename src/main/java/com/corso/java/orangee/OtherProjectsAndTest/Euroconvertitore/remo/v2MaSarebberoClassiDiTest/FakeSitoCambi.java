package com.corso.java.orangee.OtherProjectsAndTest.Euroconvertitore.remo.v2MaSarebberoClassiDiTest;

import com.corso.java.orangee.OtherProjectsAndTest.Euroconvertitore.remo.v1.SitoCambi;

public class FakeSitoCambi extends SitoCambi {

    private double valore;

    FakeSitoCambi(double valore) {
        this.valore = valore;
    }

    double ottieniCambio(String valuta) {
        return valore;
    }
}
