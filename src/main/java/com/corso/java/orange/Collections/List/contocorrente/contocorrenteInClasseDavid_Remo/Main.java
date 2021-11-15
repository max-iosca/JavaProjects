package com.corso.java.orange.Collections.List.contocorrente.contocorrenteInClasseDavid_Remo;


/**
 * ===============================<br>
 * Play116 - Banca con piú C/C<br>
 * ===============================<br>
 * Scrivere una applicazione per la gestione di conti correnti bancari.
 *
 * L'applicazione deve registrare alcuni clienti e contestualmente aprire
 * il c\c con una somma iniziale di denaro ed una soglia di scoperto (decidete voi l'importo).<br>
 * Ogni cliente effettua prelievi e versamenti (importi a vostra scelta).<br>
 * Alla fine occorre stampare l'estratto conto per singolo correntista.
 *
 */
public class Main {

    public static void main(String[] args) {

        Banca monteDeiPascoli = new Banca();
        Cliente mario = new Cliente("mario","rossi","abcdef");

        monteDeiPascoli.aperturaConto(50,mario);

        monteDeiPascoli.versamento(mario,1000);
        monteDeiPascoli.prelievo(mario,2000);
        monteDeiPascoli.prelievo(mario,2000);
        ContoCorrente contoMario = monteDeiPascoli.getContoCorrente(mario);
        monteDeiPascoli.stampaEstrattoConto(mario);
        monteDeiPascoli.chiusuraConto(mario);
        monteDeiPascoli.versamento(mario,1);

        if(mario!=null)
            monteDeiPascoli.versamento(contoMario,200);
    }

}
