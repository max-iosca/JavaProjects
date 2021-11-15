package com.corso.java.orange.PlaysRemo.play110;

/**
 * =================================<br>
 * Play110 - Conti correnti bancari<br>
 * =================================<br>
 *
 * Scrivere una applicazione per la gestione di un conto corrente bancario.<br>
 * L'applicazione deve registrare tutti i movimenti bancari di un cliente (un solo cliente).<br>
 * requisiti:
 * <ul>
 * <li>a. Quando il c\c viene aperto presso la banca deve essere depositato un valore iniziale diverso da zero
 * sul conto corrente del cliente.</li>
 *
 * <li>b. Il cliente effettua quindi, arbitrariamente (scegliete dunque voi quali) un numero di operazioni
 * di prelievi e versamenti.
 *     <ul>
 *      <li>b1. Non sono accettati prelievi maggiori di 1000 euro.</li>
 *      <li>b2. Non é possibile andare il rosso sul conto.</li>
 *     </ul>
 * <li>c. Alla fine della registrazione di tutte le operazioni prodotte al punto b. é richiesta una stampa
 * dell'estratto conto. La stampa, dunque, deve riportare tutti i movimenti fatti oltre che il saldo finale.</li>
 * </ul>
 */
public class Main {

    public static void main(String[] args) {

        ContoCorrente contoCorrente = new ContoCorrente(1000L);

        contoCorrente.versamento(500L);
        contoCorrente.versamento(500L);
        contoCorrente.prelievo(83L);
        contoCorrente.versamento(65L);
        contoCorrente.versamento(850L);
        contoCorrente.prelievo(2000L);
        contoCorrente.prelievo(2500L);

        contoCorrente.stampaEstrattoConto();
    }
}