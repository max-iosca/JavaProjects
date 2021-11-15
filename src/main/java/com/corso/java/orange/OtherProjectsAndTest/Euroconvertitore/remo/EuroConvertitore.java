package com.corso.java.orange.OtherProjectsAndTest.Euroconvertitore.remo;

public class EuroConvertitore {

    private SitoCambi sitoCambi;

    EuroConvertitore(SitoCambi sitoCambi) {
        this.sitoCambi = sitoCambi;
    }


    // calcola il valore in euro a partire da una valuta
    public double convertiInEuro(double importo, String valuta) {
        double valCambio = sitoCambi.ottieniCambio(valuta);
        return valCambio * importo;
    }

    public double convertiInEuro(double importo, String valuta, SitoCambi sitoCambi) {
        double valCambio = sitoCambi.ottieniCambio(valuta);
        return valCambio * importo;
    }


    public void setSitoCambi(SitoCambi sitoCambi) {
        this.sitoCambi = sitoCambi;
    }
}
