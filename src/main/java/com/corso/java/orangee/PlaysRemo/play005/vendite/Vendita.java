package com.corso.java.orangee.PlaysRemo.play005.vendite;
import com.corso.java.orangee.PlaysRemo.play005.Prodotto;
/**
 * La classe Vendita si occupa esclusivamente di "utilizzare gli oggetti ed esegue l'azione di venderli
 * ora é diventata astratta perché delega il calcolo del prezzo del prodotto alle sue sottoclassi
 */
public abstract class Vendita {

    private float totaleComplessivoVendite;

    abstract public void esegui(Prodotto prodotto, int qta);

    public float getTotaleComplessivoVendite() {
        return totaleComplessivoVendite;
    }

    /**
     * notare che questo metodo setter é stato dichiarato con visibilitá 'protected'.
     * La visibilitá protected rende visibile l'elemento all'interno di gerarchie a patto che esse siano tutte
     * incluse in un package a se stante.
     * Questo metodo, in effetti ha il potere di alterare il totale complessivo delle vendite e quindi non
     * dovrebbe essere usabile nel Portale perché invaliderebbe quelle effettive.
     * Solo le classi che si occupano di calcolare il venduto reale possono utilizzarlo.
     */
    protected void setTotaleComplessivoVendite(float totaleComplessivoVendite) {
        this.totaleComplessivoVendite = totaleComplessivoVendite;
    }
}
