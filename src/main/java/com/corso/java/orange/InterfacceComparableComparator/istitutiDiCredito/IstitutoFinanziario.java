package com.corso.java.orange.InterfacceComparableComparator.istitutiDiCredito;

import com.corso.java.orange.ColoringConsole.ColoringConsole;

public class IstitutoFinanziario implements IncrementoCapitaleIniziale {

    private String nome;

    public IstitutoFinanziario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void incrementaCapitale(Famiglia famiglia, Integer valoreCapitaleIniziale) {
        int anni = 10;
        int valoreCapitaleAumentato = 0;
        int valoreAumentoLocale = 0;
        System.out.println(ColoringConsole.PURPLE_BOLD_BRIGHT+"\nL'ISTITUTO DI CREDITO, CON UN CAPITALE INIZIALE DI: "+valoreCapitaleIniziale+ColoringConsole.RESET);
        for (int i = 1; i <= anni; i++) {
            if (i == 5) {
                valoreAumentoLocale = valoreAumentoLocale + (valoreCapitaleIniziale / 100) * 2;
                System.out.println(ColoringConsole.PURPLE_BOLD_BRIGHT+"DOPO 5 ANNI, CAPITALE AUMENTATO DI: " + valoreAumentoLocale+ColoringConsole.RESET);
            }
            if(i == 10){
                valoreCapitaleAumentato = valoreAumentoLocale + ((valoreCapitaleIniziale / 100) * 2);
                System.out.println(ColoringConsole.PURPLE_BOLD_BRIGHT+"E DOPO 10 ANNI: CAPITALE AUMENTATO DI: "+valoreCapitaleAumentato+ColoringConsole.RESET);
            }
        }
        System.out.println(ColoringConsole.PURPLE_BOLD_BRIGHT+"OGNI 10 ANNI -> PER UN TOTALE DI: "+valoreCapitaleAumentato+ColoringConsole.RESET);
    }
}
