package com.corso.java.orange.PlaysRemo.play190;

import com.corso.java.orange.ColoringConsole.ColoringConsole;

public class RptCliAziendaNotifiche extends ReportClientiNotifiche {

    @Override
    protected void stampaTitolo() {
        System.out.println("========================================================================================");
        System.out.println(ColoringConsole.GREEN_BOLD + "Stampa l'elenco ordinato per Azienda dei clienti registrati "+ ColoringConsole.RESET);
        System.out.println("========================================================================================");
    }

    @Override
    protected void stampaDettaglio(Cliente cliente, String notificaSMS, String notificaEmail) {
        System.out.println("Azienda: " + cliente.getAzienda() + "Cliente: " + cliente.getCognome() + " " + cliente.getNome() + " Notifiche: " +  notificaEmail + notificaSMS);
    }
}
