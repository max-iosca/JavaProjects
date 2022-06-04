package com.corso.java.orangee.Collections.List.contocorrente.contocorrenteInClasseMassimo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * La classe ContoCorrente incapsula il concetto di un C/C bancario.<br>
 * E' previsto obbligatoriamente che, all'apertura del conto, sia versato un importo iniziale.<br>
 * Non é possibile prelevare dal conto píú soldi di quanti sono disponibili.
 */
public class ContoCorrente {

    private final long massimoScoperto;
    private Long saldoIniziale;
    private List<Long> operazioni;
    private Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }



    /**
     * Crea il conto e la lista dei movimenti vuota
     * @param saldoIniziale importo iniziale versato sul conto
     */
    public ContoCorrente(Long saldoIniziale, Cliente cliente, long massimoScoperto) {
        this.operazioni = new ArrayList<>();
        this.saldoIniziale = saldoIniziale;
        this.cliente = cliente;
        this.massimoScoperto = massimoScoperto;
    }

    /**
     * Gestisce l'azione di versamento del sul c/c
     *
     * L'importo deve essere diverso da null
     *
     * @param importo importo da versare
     */
    public void versamento(Long importo) {
        if (importo==null) {
            System.out.println("L'importo non é corretto!");
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
    public void prelievo(Long importo) {
        if (importo==null) {
            System.out.println("L'importo non é corretto!");
        }
        Long saldoCorrente = calcolaSaldo();
        if (saldoCorrente-importo<(-massimoScoperto)) {
            System.out.println("Non é stato possibile eseguire l'operazione di prelievo di "+ importo +" per mancanza fondi");
            return;
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
}
