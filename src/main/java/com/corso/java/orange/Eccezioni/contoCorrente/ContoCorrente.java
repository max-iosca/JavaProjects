package com.corso.java.orange.Eccezioni.contoCorrente;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * La classe ContoCorrente incapsula il concetto di un C/C bancario.<br>
 * E' previsto obbligatoriamente che, all'apertura del conto, sia versato un importo iniziale.<br>
 * Non é possibile prelevare dal conto píú soldi di quanti sono disponibili.<br>
 * Al conto corrente é necessario assegnare il cliente proprietario del conto.
 *
 */
public class ContoCorrente {

    private Long saldoIniziale;
    private List<Long> operazioni;
    private Cliente cliente;
    private int massimoScoperto;


    /**
     * Crea il conto e la lista dei movimenti vuota.
     *
     * E' obbligatorio indicare anche il cliente proprietario del conto.
     *
     * @param cliente proprietario del conto
     * @param saldoIniziale importo iniziale versato sul conto
     * @param massimoScoperto la soglia oltre alla quale non é possibile indebitarsi
     */
    public ContoCorrente(Cliente cliente, Long saldoIniziale, int massimoScoperto) {
        this.operazioni = new ArrayList<>();
        this.saldoIniziale = saldoIniziale;
        this.cliente=cliente;
        this.massimoScoperto=massimoScoperto;
    }

    /**
     * Gestisce l'azione di versamento sul c/c
     *
     * L'importo deve essere diverso da null
     *
     * @param importo importo da versare
     */
    public void versamento(Long importo) throws ValoreImportoNonValido {
        if (importo==null) {
            throw new ValoreImportoNonValido("Importo non puó essere null");
        }
        operazioni.add(importo);
        System.out.println("Versamento di " + importo + " euro");
    }


    /**
     * Gestisce l'azione di prelievo del sul c/c
     *
     * L'importo deve essere diverso da null.
     * Non é possibile prelevare piú di quanto é disponibile sul conto.<br>
     * Usa il metodo calcolaSaldo() per verificare il saldo corrente.
     *
     * @param importo importo da prelevare
     */
    public void prelievo(Long importo) throws ValoreImportoNonValido, SuperamentoMassimoScopertoException {
        if (importo==null) {
            throw new ValoreImportoNonValido();
        }
        Long saldoCorrente = calcolaSaldo();
        if (saldoCorrente-importo<(-massimoScoperto)) {
            throw new SuperamentoMassimoScopertoException("Superato massimo scoperto!");
        }
        this.operazioni.add(importo * (-1));
        System.out.println("Prelevamento di " + importo + " euro");
    }


    /**
     * Calcola il saldo corrente
     * @return il saldo corrente
     */
    private Long calcolaSaldo(){
        Long result = this.saldoIniziale;
        for(Long importo: operazioni) {
            result += importo;
        }
        return result;
    }


    /**
     * Stampa l'estratto conto considerando anche il saldo inziale
     */
    public void stampaEstrattoConto() {
        System.out.println("\n--- Estratto conto ad oggi ---");
        System.out.println("Versamento iniziale: " + this.saldoIniziale);
        System.out.print("Entrate");
        System.out.print("\t\tUscite\n");
        for(Long importo: operazioni) {
            if (importo<0)
                System.out.println("\t\t\t"+importo);
            else
                System.out.println(importo);
        }
        System.out.println("--- Saldo finale "+calcolaSaldo()+" ---");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContoCorrente that = (ContoCorrente) o;
        return Objects.equals(cliente, that.cliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cliente);
    }

    public Cliente getCliente() {
        return cliente;
    }
}

