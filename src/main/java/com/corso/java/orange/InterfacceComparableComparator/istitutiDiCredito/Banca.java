package com.corso.java.orange.InterfacceComparableComparator.istitutiDiCredito;

import com.corso.java.orange.ColoringConsole.ColoringConsole;

import java.util.ArrayList;
import java.util.List;

public class Banca implements IncrementoCapitaleIniziale {

    private String nome;
    private String indirizzo;


    public Banca(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public void incrementaCapitale(Famiglia famiglia, Integer valoreCapitaleIniziale) {
        System.out.print(ColoringConsole.CYAN_BOLD_BRIGHT + "\n\nLA BANCA " + nome + " OFFRE " + ColoringConsole.RESET);
        System.out.println(ColoringConsole.CYAN_BOLD_BRIGHT + "CON UN CAPITALE INIZIALE DI: " + valoreCapitaleIniziale + ColoringConsole.RESET);
        Integer aumentoCapitaleAnnuo = 0;

        List<Persona> figli = new ArrayList<>();
        figli.addAll(famiglia.getFigli());

        for (Persona figlio : figli) {
            if (figlio.getRuolo().equals("figlio") && figlio.getEta() < 30) {
                aumentoCapitaleAnnuo = ((valoreCapitaleIniziale / 100) * 5);
                System.out.println(ColoringConsole.CYAN_BOLD_BRIGHT + "PER OGNI FIGLIO UNDER 30 -> AUMENTO CAPITALE DEL 5% -> PER UN TOTALE DI: " + aumentoCapitaleAnnuo + ColoringConsole.RESET);
            }
            if (figlio.getRuolo().equals("figlio") && figlio.getEta() >= 30) {
                aumentoCapitaleAnnuo = ((valoreCapitaleIniziale / 100) * 10);
                System.out.println(ColoringConsole.CYAN_BOLD_BRIGHT + "PER OGNI FIGLIO OVER 30 -> AUMENTO CAPITALE DEL 10% -> PER UN TOTALE DI: " + aumentoCapitaleAnnuo + ColoringConsole.RESET);
            }
        }
    }
}


