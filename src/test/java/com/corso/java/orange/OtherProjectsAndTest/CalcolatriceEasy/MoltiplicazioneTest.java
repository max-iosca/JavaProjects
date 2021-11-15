package com.corso.java.orange.OtherProjectsAndTest.CalcolatriceEasy;

import org.junit.Assert;
import org.junit.Test;

public class MoltiplicazioneTest {

    @Test
    public void esegui() throws DivisionePerZeroException {
        Operazione moltiplicazione = new Moltiplicazione();
        int risultato = moltiplicazione.calcola(10,20);

        /*UTILIZZIAMO LE ASSERZIONI
        assert.assertEquals
        vi richiede 3 parametri:
        - messaggio facoltativo quando fallisce
        - valore atteso
        - variabile che contiene il valore atteso

        assert.assertTrue compara dati primitivi
        vi richiede 2 parametri:
        - un messaggio facoltativo se fallisce
        - una condizione booleana
        */
        Assert.assertTrue("Moltiplicazione non eseguita correttamente", risultato==200);
    }
}