package com.corso.java.orange.Collections.List.contocorrente.contocorrenteInClasseMassimo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Banca {

    private Set<ContoCorrente> contiCorrenti;

    public Banca() {
        contiCorrenti = new HashSet<>();
    }

    public void aperturaConto(Cliente cliente, long versamentoIniziale) {
        if (cliente == null)
            return;

        contiCorrenti.add(new ContoCorrente(versamentoIniziale, cliente, 2000));
    }

    public void versamento(Cliente cliente, long importoDaVersare) {
        if (importoDaVersare <= 0 || cliente == null)
            return;
        boolean clienteTrovato = false;
        for (ContoCorrente conto : contiCorrenti) {
            if (conto.getCliente().equals(cliente)) {
                conto.versamento(importoDaVersare);
                clienteTrovato = true;
                break;
            }
        }
    }

    public void versamento(ContoCorrente contoCorrente, long importo) {
        if(contiCorrenti.contains(contoCorrente)){
           contoCorrente.versamento(importo);
        } else{
            System.out.println("CLIENTE NON TROVATO CON QUESTO CONTO CORRENTE");
        }
    }

    public void prelievo(Cliente cliente, long importoDaPrelevare) {
        if (importoDaPrelevare <= 0 || cliente == null)
            return;
        for (ContoCorrente conto : contiCorrenti) {
            if (conto.getCliente().equals(cliente)) {
                conto.prelievo(importoDaPrelevare);
                break;
            }
        }
    }

    public void chiusuraConto(Cliente cliente) {
        if (cliente == null)
            return;
//DA QUI USO L'ITERATOR.....PRENDI SPUNTO DA QUESTO PER RICORDARTELO, SEMPRE!!!
        Iterator<ContoCorrente> iterator = contiCorrenti.iterator();
        while (iterator.hasNext()) {
            ContoCorrente conto = iterator.next();
            if (conto.getCliente().equals(cliente)) {
                iterator.remove();
                break;
            }
        }
    }

    public void stampaEstrattoConto(Cliente cliente) {
        if (cliente == null)
            return;
        for (ContoCorrente conto : contiCorrenti) {
            if (conto.getCliente().equals(cliente)) {
                conto.stampaEstrattoConto();
            }
        }
    }

    public ContoCorrente getContoCorrente(Cliente cliente) {
        if (cliente == null)
            return null;
        for (ContoCorrente conto : contiCorrenti) {
            if (conto.getCliente().equals(cliente))
                return conto;
        }
        return null;
    }

}