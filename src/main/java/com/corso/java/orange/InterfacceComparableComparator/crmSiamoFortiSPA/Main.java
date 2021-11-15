package com.corso.java.orange.InterfacceComparableComparator.crmSiamoFortiSPA;

import com.corso.java.orange.ColoringConsole.ColoringConsole;

import java.util.*;

public class Main {

    List<Cliente> clientiRegistrati = new ArrayList<>();

    public static void main(String[] args) {
        Main crm = new Main();

        Cliente cliente01 = new Cliente("Pino", "Pini", "AziendaO", "PNOPNI", "email01@gmail.com", true, false);
        Cliente cliente02 = new Cliente("Mino", "Mini", "AziendaZ", "MNOMNI", "email02@gmail.com", false, false);
        Cliente cliente03 = new Cliente("Pino", "Pini", "AziendaO", "PNOPNI", "email01@gmail.com", true, false);
        Cliente cliente04 = new Cliente("Gino", "Gini", "AziendaA", "GNOGNI", "email10@gmail.com", true, true);

        crm.registrazioneUtente(cliente01);
        crm.registrazioneUtente(cliente02);
        crm.registrazioneUtente(cliente03);
        crm.registrazioneUtente(cliente04);

        Collections.sort(crm.clientiRegistrati);
        System.out.println("\nREPORT CLIENTI ORDINATI PER COGNOME / NOME / NOTIFICHE ATTIVE EMAIL/SMS");
        stampaLista(crm.clientiRegistrati);

        Collections.sort(crm.clientiRegistrati, new OrdinaClientiPerNomeAzienda());
        System.out.println("\nREPORT CLIENTI ORDINATI PER NOME AZIENDA / NOTIFICHE ATTIVE EMAIL/SMS");
        stampaLista(crm.clientiRegistrati);


/**
 * FORSE FUNGE ANCHE CON LA LAMBDA? PROVIAMO!
 */
        System.out.println("\n LISTA CLIENTI, PER NOME AZIENDA / NOTIFICHE ATTIVE EMAIL/SMS USANDO LA LAMBDA");
        crm.clientiRegistrati.sort((Cliente c1, Cliente c2) -> c1.getNomeAzienda().compareTo(c2.getNomeAzienda()));
        stampaLista(crm.clientiRegistrati);
    }

    public void registrazioneUtente(Cliente clienteDaVerificare) {
        try {
            checkUtente(clienteDaVerificare);
        } catch (ClienteGiaRegistratoException e) {
            System.out.println(ColoringConsole.RED_BOLD_BRIGHT + "\nERRORE!!! " + clienteDaVerificare.getNome() + " " + clienteDaVerificare.getCognome() + " GIA REGISTRATO" + ColoringConsole.RESET);
        }
    }

    public void checkUtente(Cliente candidatoCliente) throws ClienteGiaRegistratoException {
        if (clientiRegistrati.isEmpty()) {
            clientiRegistrati.add(candidatoCliente);
            System.out.println(ColoringConsole.GREEN_BOLD_BRIGHT + "CLIENTE " + candidatoCliente.getNome() + " " + candidatoCliente.getCognome() + " REGISTRATO CORRETTAMENTE" + ColoringConsole.RESET);
            return;
        } else {
            for (Cliente item : clientiRegistrati) {
                if (candidatoCliente.getCodFisc().concat(candidatoCliente.getEmail()).equals(item.getCodFisc().concat(item.getEmail())))
                    throw new ClienteGiaRegistratoException();
                else
                    clientiRegistrati.add(candidatoCliente);
                System.out.println(ColoringConsole.GREEN_BOLD_BRIGHT + "\nCLIENTE: " + candidatoCliente.getNome() + " " + candidatoCliente.getCognome() + " REGISTRATO CORRETTAMENTE" + ColoringConsole.RESET);
                return;
            }
        }
    }

    public static void stampaLista(List<Cliente> listaDeiClienti) {
        System.out.println("\t CLIENTE - MAIL - SMS - NOME AZIENDA");
        for (Cliente cliente : listaDeiClienti) {
            System.out.println("\t" + cliente.getCognome() + " " + cliente.getNome() + "  " + cliente.isNotificheMail() + "  " + cliente.isNotificheSms() + "   "+ cliente.getNomeAzienda());
        }
    }
}
