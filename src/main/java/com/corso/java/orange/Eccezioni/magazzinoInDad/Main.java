package com.corso.java.orange.Eccezioni.magazzinoInDad;


import com.corso.java.orange.ColoringConsole.ColoringConsole;

import java.util.Map;

public class Main {

    public static void main(String[] args) throws EsistenzeProdottiVuotaException, QtaProdottoEccessivaException, DepositoErroreScaricoException {

        Deposito deposito = new Deposito();
        Prodotto prodotto001 = new Prodotto("001", "Detersivo");
        Prodotto prodotto002 = new Prodotto("002", "Sapone");
        Prodotto prodotto003 = new Prodotto("003", "WD40");
        Prodotto prodotto004 = new Prodotto("004", "Catena");
        Prodotto prodotto005 = new Prodotto("005", "Piatto");
        Prodotto prodotto006 = new Prodotto("006", "Lampada");

        /**
         * PERCHE' FARE IL TRY NEL MAIN PER QUESTO CASO?!
         * SE VOLESSI 'SCARICARE' UN'ALTRA SERIE DI PRODOTTI, MAGARI 10, E GIA ALL'AGGIUNTA DEL TERZO PRODOTTO...
         * SCATENASSI UN ECCEZIONE...GLI ALTRI 7 NON VERREBBERO AGGIUNTI, GIUSTO?!
         */
        try {
            deposito.scaricoProdotto(prodotto001, 5);
            //infatti, lanciando il debug, non esegue le altre istruzioni!
            deposito.caricoProdotto(prodotto003,50);
            deposito.scaricoProdotto(prodotto002,20);
            deposito.scaricoProdotto(null, 0);
        } catch (DepositoErroreScaricoException e) {
            System.out.println(ColoringConsole.RED_BOLD_BRIGHT+"ERRORE, PRODOTTO NON PRESENTE"+ColoringConsole.RESET);
        }

        /**
         * QUINDI SAREBBE PIU OPPORTUNO AVERE LA STRUTTURA DEL METODO 'SCARICOPRODOTTO' DIVERSA?!
         * PROVIAMO A VEDERE CHE SUCCEDE COSì
         */
        deposito.scaricoProdottoBis(prodotto004, 20);
        deposito.caricoProdotto(prodotto002, 15);
        deposito.caricoProdotto(prodotto003, 20);
        deposito.scaricoProdottoBis(prodotto002, 15);
        deposito.scaricoProdottoBis(prodotto002, 14);
        deposito.caricoProdotto(prodotto005,30);
        deposito.caricoProdotto(prodotto006,50);
        deposito.scaricoProdottoBis(prodotto006, 40);
        deposito.scaricoProdottoBis(prodotto005, 15);
        deposito.scaricoProdottoBis(null, 5);
        // delegaCarico(deposito,prodotto002);
        // delegaCarico(deposito,prodotto003);

        /**
         * MENTRE QUI FORSE, ESEGUENDO UNA SOLA OPERAZIONE, QUINDI UN SOLO METODO...
         * SE LA MAPPA VIENE STAMPATA, BENE. ALTRIMETI LANCIA E "ACCHIAPPA" SUBITO L'ECCEZIONE!!!
         */
        try {
            deposito.stampaEsistenze(deposito.getEsistenzeProdotti());
            if (deposito.getEsistenzeProdotti().isEmpty())
                throw new EsistenzeProdottiVuotaException();
        } catch (EsistenzeProdottiVuotaException e) {
            System.out.println(ColoringConsole.RED_BOLD_BRIGHT+"Mappa esistenze/giacenze prodotti vuota!!!"+ColoringConsole.RESET);
        }
    }

    /**
     * NON LO POSSO FARE!!!
     * PERCHè MI VINCOLA LE QUANTITA PER TUTTE LE CHIAMATE A QUEL METODO.
     * QUINDI CON 1 METODO, NON POSSO AGGIUNGERE SINGOLARMENTE UN PRODOTTO PER 'X' QUANTITA' ED UN ALTRO PRODOTTO PER 'Y' QUANTITA'
     * @param deposito
     * @param prodotto
     */
/*
    public static void delegaCarico(Deposito deposito, Prodotto prodotto, int qta) {
        try {
            deposito.caricoProdotto(prodotto, 10); //MALE!!! AD OGNI CHIAMATA DEL METODO, LA QTA E' VINCOLATA!
        } catch (DepositoErroreCaricoException e) {
            System.out.println(e.getMessage());
        } catch (ProdottoNonValidoException e) {
            System.out.println(e.getMessage());
        }
    }
*/

}
