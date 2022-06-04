package com.corso.java.orangee.PlaysRemo.play190;

import com.corso.java.orangee.ColoringConsole.ColoringConsole;

public class RptCliNomeCognomeNotifiche extends ReportClientiNotifiche {

    @Override
    protected void stampaTitolo() {
        System.out.println("========================================================================================");
        System.out.println(ColoringConsole.GREEN_BOLD + "Stampa l'elenco ordinato per Cognome, Nome dei clienti registrati "+ ColoringConsole.RESET);
        System.out.println("========================================================================================");
    }

    @Override
    protected void stampaDettaglio(Cliente cliente, String notificaSMS, String notificaEmail) {
        System.out.println("Cliente: " + cliente.getCognome() + " " + cliente.getNome() + " Notifiche: " +  notificaEmail + notificaSMS);
    }
}
