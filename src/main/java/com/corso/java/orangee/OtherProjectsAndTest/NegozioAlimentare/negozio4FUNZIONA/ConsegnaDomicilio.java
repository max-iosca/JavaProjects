package com.corso.java.orangee.OtherProjectsAndTest.NegozioAlimentare.negozio4FUNZIONA;

public class ConsegnaDomicilio extends Vendita {

    public void eseguiConsegnaDomicilio(double totale){
        if (totale < 50.0) {
            totale = totale + ((totale / 100) * 3);
            System.out.println("MAGGIORAZIONE DEL 3% - SPESA SOTTO I 50€");
        }
        if (totale > 100.0) {
            totale = totale - ((totale / 100) * 6);
            System.out.println("SCONTO APPLICATO DEL 6% - LA SPESA SUPERA I 100€");
        }
        System.out.println("Il costo totale della consegna a domicilio è: " + totale);
    }
}
