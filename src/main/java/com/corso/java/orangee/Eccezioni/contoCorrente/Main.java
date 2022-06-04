package com.corso.java.orangee.Eccezioni.contoCorrente;

/**
 * Questo é il Play116 con l'integrazione delle eccezioni.
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
