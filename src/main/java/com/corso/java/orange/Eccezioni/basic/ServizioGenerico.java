package com.corso.java.orange.Eccezioni.basic;


import java.util.HashMap;
import java.util.Map;

public class ServizioGenerico {

    private Map<String, Integer> dati = new HashMap<>();

    public void metodoChiamatoConEccezionePrecisa(String nome, Integer qta) {
        try {
            verificaDati(nome, qta);
            dati.put(nome, qta);

        } catch (NomeChiaveInvalidoException e) {
            System.err.println("\t\tErrore: " + e.getMessage() + ", tipo errore: " + e.getClass()
                    + " msg esplicito: Errore su nome chiave.");

        } catch (ValoreQtaFuoriRangeException e) {
            System.err.println("\t\tErrore: " + e.getMessage() + ", tipo errore: " + e.getClass()
                    + " msg esplicito: Errore su qta");
        }
    }


    public void metodoChiamatoConEccezioneGenerica(String nome, Integer qta) {
        try {
            verificaDati(nome, qta);
            dati.put(nome, qta);

        } catch (Exception e) {
            System.err.println("\t\tErrore: " + e.getMessage() + ", tipo errore: " + e.getClass()
                    + " msg esplicito: Errore generico, non si sa bene quale eccezione sia.");
        }
    }

    public void metodoChiamatoConEccezioneConCostruttoreDichiarato(String nome, Integer qta) {
        try {
            verificaDati(nome, qta);
            verificaDatiProfonda(nome, qta);
            dati.put(nome, qta);

        } catch (Exception e) {
            System.err.println("\t\t" + e.getMessage());
        }
    }

    public void metodoChiamatoSenzaGestioneDelleEccezioni(String nome, Integer qta) throws ValoreQtaFuoriRangeException, NomeChiaveInvalidoException, QtaComplessivaSuperioreA10Exception {
        verificaDati(nome, qta);
        verificaDatiProfonda(nome, qta);
        dati.put(nome, qta);
    }

    private void verificaDati(String nome, Integer qta) throws ValoreQtaFuoriRangeException, NomeChiaveInvalidoException {
        if (nome == null)
            throw new NomeChiaveInvalidoException();

        if (qta <= 0 || qta > 1500) {
            throw new ValoreQtaFuoriRangeException();
        }
    }

    private void verificaDatiProfonda(String nome, Integer qta) throws QtaComplessivaSuperioreA10Exception {
        Integer valoreChiave = dati.get(nome);
        if (valoreChiave != null && (valoreChiave + qta) > 10)
            throw new QtaComplessivaSuperioreA10Exception("Errore qta raggiunta = " + valoreChiave + qta);
    }
}
