package com.corso.java.orange.PlaysRemo.play190;

import java.util.*;

public class CRM {

    private Set<Cliente> clientiRegistrati;

    public CRM() {
        this.clientiRegistrati = new HashSet<>();
    }

    public void registrazione(FormRichiestaClienteDTO richiestaCliente) {
        try {
            this.validaRichiestaCliente(richiestaCliente);
            Cliente cliente = buildCliente(richiestaCliente);
            this.clientiRegistrati.add(cliente);
        } catch (RichiestaClienteNonValidaException | ClienteGiaRegistratoException e) {
            System.err.println(e.getMessage());
        }
    }

    private void validaRichiestaCliente(FormRichiestaClienteDTO richiestaCliente) throws RichiestaClienteNonValidaException, ClienteGiaRegistratoException {
        if (richiestaCliente.isNotificaEmail() && richiestaCliente.isNotificaSMS())
            throw new RichiestaClienteNonValidaException(richiestaCliente.getCognome() + " deve scegliere una sola delle due notifiche disponibili");

        this.checkIfClienteEsiste(richiestaCliente);
    }

    private Cliente buildCliente(FormRichiestaClienteDTO richiestaCliente) {
        Cliente result = new Cliente();
        result.setNome(richiestaCliente.getNome());
        result.setCognome(richiestaCliente.getCognome());
        result.setCf(richiestaCliente.getCf());
        result.setEmail(richiestaCliente.getEmail());
        result.setAzienda(richiestaCliente.getAzienda());
        result.setNotificaSMS(richiestaCliente.isNotificaSMS());
        result.setNotificaEmail(richiestaCliente.isNotificaEmail());
        return result;
    }

    private void checkIfClienteEsiste(FormRichiestaClienteDTO clienteRichiedente) throws ClienteGiaRegistratoException {
        for(Cliente clienteRegistrato: clientiRegistrati){
            if ((clienteRegistrato.getCf().equals(clienteRichiedente.getCf())) || clienteRegistrato.getEmail().equals(clienteRichiedente.getEmail()))
                throw new ClienteGiaRegistratoException("Il cliente " + clienteRichiedente.getCognome() + " risulta essere giá registrato");
        }
    }

    private void checkIfClienteEsiste(Cliente clienteRichiedente) throws ClienteGiaRegistratoException {
        for(Cliente clienteRegistrato: clientiRegistrati){
            if (clienteRegistrato.equals(clienteRichiedente))
                throw new ClienteGiaRegistratoException("Il cliente " + clienteRichiedente.getCognome() + " risulta essere giá registrato");
        }
    }

    /**
     * Qui si fa uso di OCP per rendere i Report non legati al CRM:
     * Se servono altri tipi di report si aggiungono classi e tutto resta intatto.
     * @param report
     * @param comparator
     */
    public void stampaReport(ReportClientiNotifiche report, Comparator<Cliente> comparator) {
        report.stampa(this.clientiRegistrati, comparator);
    }

}
