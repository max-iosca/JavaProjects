package com.corso.java.orange.Collections.List.contocorrente.contocorrenteInClasseV2;

import com.corso.java.orange.Collections.List.contocorrente.contocorrenteInClasseDavid_Remo.Cliente;
import com.corso.java.orange.Collections.List.contocorrente.contocorrenteInClasseDavid_Remo.ContoCorrente;

public class Main {
    public static void main(String[] args) {

        BancaBNL bnl = new BancaBNL();
        BancaUnicredit uniCred = new BancaUnicredit();
        Cliente massimo = new Cliente("Massimo", "Iosca", "SCIMSM90");
        Cliente laura = new Cliente("Laura", "Malerba", "NLSLRA95");
        Cliente pippo = new Cliente("Pippo", "Baudo", "NLSPPP88");
        bnl.aperturaConto(100, massimo);
        bnl.aperturaConto(200, massimo);
        bnl.aperturaConto(500, laura);
        bnl.aperturaConto(10000, pippo);
        uniCred.aperturaConto(10000, pippo);

        quantiContiAttiviInTutteLeBanche(bnl,uniCred);
        quantiContiChiusiInTutteLeBanche(bnl, uniCred);

        bnl.chiusuraConto(massimo);
        bnl.chiusuraConto(laura);
        quantiContiChiusiInTutteLeBanche(bnl, uniCred);
        uniCred.chiusuraConto(pippo);
        quantiContiChiusiInTutteLeBanche(bnl, uniCred);


    }

    /**
     * LA RICHIESTA DELL'ESERCIZIO ERA DI POTER GESTIRE PIU BANCHE (MA ANCHE SOLO DUE).
     * HO SCELTO DI VINCOLARE IL CODICE ALLE SOLE DUE BANCHE.
     *
     * PROBABILMENTE, SE NON AVESSI SCELTO DI VINCOLARE LA SCELTA A SOLO DUE BANCHE...
     * UNA CLASSE PADRE DI NOME BANCA CON DERIVANTI DA ESSA ALTRE CLASSI (ES. BancaBnl, BancaUnicred, BancaNonLoSo ecc)
     * AVREBBE COMPORTATO ULTERIORI MODIFICHE ED IMPLEMENTAZIONI AL CODICE.
     *
     * @param bnl
     * @param uniCred
     */

    public static void quantiContiAttiviInTutteLeBanche(BancaBNL bnl, BancaUnicredit uniCred) {
        System.out.print("\nCONTI CORRENTI ATTIVI IN BNL: ");
        int contaConti = 0;
        int contaTutti = 0;
        for (ContoCorrente item : bnl.getContiCorrentiBNL()) {
            contaConti++;
        }
        System.out.println(contaConti);
        contaTutti += contaConti;
        System.out.print("CONTI CORRENTI ATTIVI IN UNICREDIT: ");
        contaConti = 0;
        for (ContoCorrente item : uniCred.getContiCorrentiUnicredit()) {
            contaConti++;
        }
        System.out.println(contaConti);
        contaTutti += contaConti;
        System.out.println("TOTALE CONTI ATTIVI: "+contaTutti+"\n");
    }

    public static void quantiContiChiusiInTutteLeBanche(BancaBNL bnl, BancaUnicredit unicred){
        System.out.println("TOTALE CONTI CORRENTI CHIUSI: "+(bnl.getContaContiChiusi()+unicred.getContaContiChiusi()));
    }
}