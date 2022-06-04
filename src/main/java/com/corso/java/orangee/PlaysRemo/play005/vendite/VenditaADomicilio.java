package com.corso.java.orangee.PlaysRemo.play005.vendite;
import com.corso.java.orangee.PlaysRemo.play005.Prodotto;
/**
 * La classe VenditaADomicilio si occupa di applicare i calcoli inerenti vendite a docmicilio
 *
 */
public class VenditaADomicilio extends Vendita{


    /**
     * Per ogni esecuzione vengono ricevuti l'oggetto di tipo Prodotto e la qta venduta.
     * Per ciascuna transazione viene eseguito il metodo calcolaPrezzoDiVendita del Prodotto.
     *
     * @param prodotto
     * @param qta
     */
    public void esegui(Prodotto prodotto, int qta) {
        float valore = prodotto.calcolaPrezzoVendita(qta);
        Float costoConsegna = null;

        // questa possibile soluzione non fa uso di 'if' complessi qui perché potrebbero risultare
        // difficoltosi da leggere man mano che le condizioni si complicano, ma delega ad ogni metodo la applicabilitá del calcolo
        // se quella condizione si verifica il calcolo viene eseguito.
        // La condizione risulta applicata quando 'costoConsegna' é diverso da 'null'.
        if (costoConsegna==null)
            costoConsegna = maggiorazioneBaseConsegna(valore);
        if (costoConsegna==null)
            costoConsegna = scontoBaseConsegna(valore);
        if (costoConsegna==null)
            costoConsegna = scontoMaxiConsegna(valore);

        if (costoConsegna==null)
            costoConsegna=0f;

        super.setTotaleComplessivoVendite(getTotaleComplessivoVendite() + (valore + costoConsegna));
        System.out.println("--- vendita di " + prodotto.getNome() + " qta = " + qta + " al p.unitario = "
                + prodotto.getPrezzoUnitario() + " con sconto = " + prodotto.getScontoPercentuale() + ". Euro = " + valore);
    }

    private Float maggiorazioneBaseConsegna(float valore) {
        Float result = null;
        if (valore < 50.0) {

        }
        return result;
    }

    private Float scontoBaseConsegna(float valore) {
        Float result = null;
        if (valore == 100.0) {

        }
        return result;
    }

    private Float scontoMaxiConsegna(float valore) {
        Float result = null;
        if (valore > 100.0) {

            // torna un numero negativo per favorire la somma algebrica con il valore del prodotto.
            result = result * (-1f);
        }
        return result;
    }
}
