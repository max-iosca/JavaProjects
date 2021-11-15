package com.corso.java.orange.Eccezioni.esercizioMagazzinoInDad;

import java.util.HashMap;
import java.util.Map;

public class Deposito {

    private Map<Prodotto, Integer> esistenzeProdotti;

    public Deposito() {
        esistenzeProdotti = new HashMap<>();
    }

    public void scaricoProdotto(Prodotto prodotto, int qta) throws ProdottoNonValidoException, ProdottoNonPresenteInDeposito, QtaProdottoNonDisponibileException {
        if(prodotto==null)
            throw new ProdottoNonValidoException();

        Integer qtaProdottoInMagazzino = esistenzeProdotti.get(prodotto); //"LA GET, GLIFORNISCO UNA CHIAVE, MI RITORNA UN VALORE, NEL NOSTROCASO è DI TIPO INTEGER, ALTRIMENTI SE NON TROVASSE NEANCHE LA CHIAVE, RITORNA NULL
        if(qtaProdottoInMagazzino==null) {
            throw new ProdottoNonPresenteInDeposito();
        }
        if((qtaProdottoInMagazzino - qta)<0 )
            throw new QtaProdottoNonDisponibileException();
        esistenzeProdotti.put(prodotto, (qtaProdottoInMagazzino - qta));


    }

    public void stampaEsistenze(){
        //ciclo per stampare le esistenze
    }
}


/*

  Prodotto         Esistenza
==============================
   Dixan               8
   Dentifricio         1
==============================

 */