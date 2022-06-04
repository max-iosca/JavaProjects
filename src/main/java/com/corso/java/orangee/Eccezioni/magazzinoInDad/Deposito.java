package com.corso.java.orangee.Eccezioni.magazzinoInDad;

import com.corso.java.orangee.ColoringConsole.ColoringConsole;

import java.util.HashMap;
import java.util.Map;

// dobbiamo implementare carico e scarico prodotti dal deposito
public class Deposito {

    private Map<Prodotto, Integer> esistenzeProdotti;

    public Deposito() {
        esistenzeProdotti = new HashMap<>();
    }

    public Map<Prodotto, Integer> getEsistenzeProdotti() {
        return esistenzeProdotti;
    }

    public void scaricoProdotto(Prodotto prodotto, int qta) throws ProdottoNonValidoException, ProdottoNonPresenteInDeposito, QtaProdottoNonDisponibileException {
        if (prodotto == null)
            throw new ProdottoNonValidoException();
        Integer qtaProdottoInMagazzino = esistenzeProdotti.get(prodotto);
        if (qtaProdottoInMagazzino == null)
            throw new ProdottoNonPresenteInDeposito();
        if ((qtaProdottoInMagazzino - qta) < 0)
            throw new QtaProdottoNonDisponibileException();
        esistenzeProdotti.put(prodotto, (qtaProdottoInMagazzino - qta));
    }

    public void scaricoProdottoBis(Prodotto prodotto, int qta) {
        try {
            if (prodotto == null)
                throw new ProdottoNonValidoException();
            Integer qtaProdottoInMagazzino = esistenzeProdotti.get(prodotto);
            if (qtaProdottoInMagazzino == null)
                throw new ProdottoNonPresenteInDeposito();
            if ((qtaProdottoInMagazzino - qta) < 0)
                throw new QtaProdottoNonDisponibileException();
            esistenzeProdotti.put(prodotto, (qtaProdottoInMagazzino - qta));
            System.out.println(ColoringConsole.YELLOW_BOLD_BRIGHT+"PRODOTTO: "+prodotto.getDescription()+ " RIMOSSA QTA: "+qta+ColoringConsole.RESET);
        } catch (ProdottoNonValidoException e) {
            System.out.println(ColoringConsole.RED_BOLD_BRIGHT+"PRODOTTO NON VALIDO - HAI INSERITO NULL!");
        } catch (ProdottoNonPresenteInDeposito e) {
            System.out.println(ColoringConsole.RED_BOLD_BRIGHT+"PRODOTTO NON PRESENTE IN DEPOSITO");
        } catch (QtaProdottoNonDisponibileException e) {
            System.out.println(ColoringConsole.RED_BOLD_BRIGHT+"QTA PRODOTTO NON DISPONIBILE"+ColoringConsole.RESET);
        }
    }

    /**
     * PERCHE' CHIAMARLO 'CARICO'? NON SAREBBE MEGLIO 'PRELIEVO PRODOTTO'? VABBE'..
     *
     * @param prodotto
     * @param qta
     */
    public void caricoProdotto(Prodotto prodotto, int qta) {
        try {
            if (prodotto == null)
                throw new ProdottoNonValidoException();
            Integer qtaProdottoGiaImmgazzinata = esistenzeProdotti.get(prodotto); // fornisco la chiave nelle () e mi restituisce il Valore corrispondente! ficcati in testa sta get!
            /* if ((qtaProdottoGiaImmgazzinata + qta) > 99)
               throw new QtaProdottoEccessivaException();      NON FUNGE
             */
        } catch (ProdottoNonValidoException e) {
            System.out.println(ColoringConsole.RED_BOLD_BRIGHT+" PRODOTTO" + prodotto.getDescription() + "NON VALIDO! NON PUOI CARICARE UN NULL!"+ColoringConsole.RESET);
        }
        esistenzeProdotti.put(prodotto, qta);
        System.out.println(ColoringConsole.CYAN_BOLD_BRIGHT+"PRODOTTO: " + prodotto.getDescription() + " - CARICATA QTA: " + qta+ColoringConsole.RESET);
        /*catch (QtaProdottoEccessivaException e) {
            System.out.println("QUANTITA' PRODOTTO OLTRE LIMITE DEL MAGAZZINO!");
        }*/
    }

    /**
     * STAMPO LA MAPPA CON SLICE ORIZZONTALE
     *
     * @param mappaEsistenze è LA MIA LISTA esistenzeProdotti
     */
    public void stampaEsistenze(Map<Prodotto, Integer> mappaEsistenze) {
        System.out.print(ColoringConsole.GREEN_BOLD_BRIGHT + "\nPRODOTTO");
        System.out.println("\t\tQUANTITA'");
        System.out.println("==============================");
        for (Map.Entry<Prodotto, Integer> item : mappaEsistenze.entrySet()) {
            System.out.print(item.getKey().getDescription());
            System.out.println("\t\t\t\t" + item.getValue());
        }
        System.out.println("=============================="+ColoringConsole.RESET);
    }
}
