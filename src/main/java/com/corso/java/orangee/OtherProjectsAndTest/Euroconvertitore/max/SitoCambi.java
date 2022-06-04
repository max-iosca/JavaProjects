package com.corso.java.orangee.OtherProjectsAndTest.Euroconvertitore.max;

public class SitoCambi {


    double ottieniCambio(String valuta) {
        if (valuta.equals("USD"))
            return 1.5d;
        if (valuta.equals("JPN"))
            return 2.0d;

        return 1.4d;
    }
}
