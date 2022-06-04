package com.corso.java.orangee.OtherProjectsAndTest.Euroconvertitore.remo.v1;

public class SitoCambiGoogle extends SitoCambi {

    // Questo metodo accede all'eserno per sapere quali sono i cambi del giorno.
    double ottieniCambio(String valuta) {
        if (valuta.equals("USD"))
            return 1.5d;
        if (valuta.equals("JPN"))
            return 2.0d;

        return 1.4d;
    }
}