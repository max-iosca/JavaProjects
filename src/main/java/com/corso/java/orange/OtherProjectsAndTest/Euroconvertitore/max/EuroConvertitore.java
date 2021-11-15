package com.corso.java.orange.OtherProjectsAndTest.Euroconvertitore.max;

public class EuroConvertitore {

    private SitoCambi sitoCambi;

    EuroConvertitore(SitoCambi sitoCambi) {
        this.sitoCambi = sitoCambi;
    }

    // calcola il valore in euro a partire da una valuta
    double convertiInEuro(double importo, String valuta) {
        double valCambio = sitoCambi.ottieniCambio(valuta);
        return valCambio * importo;
    }
}
