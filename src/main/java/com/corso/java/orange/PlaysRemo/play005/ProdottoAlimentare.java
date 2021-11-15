package com.corso.java.orange.PlaysRemo.play005;

/**
 * Questa classe non fa quasi nulla, tranne assegnare per default un valore allo sconto.
 * Se avessimo voluto usare solo la classe Prodotto avremmo dovuto assegnare un valore allo sconto
 * dal main, ma in questo modo non avremmo ottenuto un corretto incapsulamento.
 * Con questa implementazione, invece é la classe stessa che decide quale sconto va applicato
 * ai prodotti generati tramite essa.
 *
 *
 */
public class ProdottoAlimentare extends Prodotto {

    /**
     * Nei costruttori delle sottoclassi, l'ordine di costruzione degli oggetti parte sempre dall'oggetto
     * superiore (super, la superClasse, in questo caso Prodotto).
     * Nei casi in cui i costruttori richiedano argomenti é necessario che la prima istruzione sia sempre la chiamata
     * al costruttore della classe superiore.
     * Se provate a commentare questa istruzione "super(codice, nome, prezzoUnitario);" il compilatore produce un errore.
     *
     * @param codice
     * @param nome
     * @param prezzoUnitario
     */
    public ProdottoAlimentare(String codice, String nome, int prezzoUnitario) {
        super(codice, nome, prezzoUnitario);
        super.setScontoPercentuale(10);
    }
}
