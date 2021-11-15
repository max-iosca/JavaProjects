package com.corso.java.orange.OtherProjectsAndTest.EserciziRemoBoh.RemoGenerics.src;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Questa classe prevede che le quantit� movimentate possano essere anch�esse generiche.
 * Questa immplementazione supera il problema della versione precedente perch� ora � stata aggiunta anche la
 * verifica del tipo di movimento al fine di sommare algebricamente le quantit� in base al tipo di movimento
 * effettuato.
 *
 * @param <T> - � un placeholder (tipo parametrico) per individuare il tipo di elemento gestito dal magazzino
 * @param <Q> - � un plachehiolder (tipo parametrico) per individuare il tipo associato alla quantit�
 */
public class Magazzino<T, Q> {

    private List<TransazioneMagazzino<T, Q>> transazioni;

    public Magazzino() {
        transazioni = new ArrayList<>();
    }

    public void carico(T prodotto, Q quantita) {
        transazioni.add(new TransazioneMagazzino<T, Q>(prodotto, quantita, TipoMovimento.CARICO));
    }

    public void scarico(T prodotto, Q quantita) {
        transazioni.add(new TransazioneMagazzino<T, Q>(prodotto, quantita, TipoMovimento.SCARICO));
    }

    public List<TransazioneMagazzino<T, Q>> movimenti() {
        return transazioni;
    }

    public List<TransazioneMagazzino<T, Q>> esistenza(Predicate<T> predicate) {
        List<TransazioneMagazzino<T, Q>> result = new ArrayList<>();
        for(TransazioneMagazzino<T, Q> item: transazioni) {
            if (predicate.test(item.getSoggetto())) {
                result.add(item);
            }
        }
        return result;
    }

    public <S> Q esistenza(Predicate<T> predicate, SommaFunc<Q, S> somma) {
        Q result = null;
        for(TransazioneMagazzino<T, Q> item: transazioni) {
            if (predicate.test(item.getSoggetto())) {
                if (result==null) {
                    result = item.getQuantita();
                } else {
                    result = somma.sum(result, item.getQuantita(), (S)item.getMovimento());
                }
            }
        }
        return result;
    }
}