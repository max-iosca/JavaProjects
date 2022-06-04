package com.corso.java.orangee.InterfacceComparableComparator.istitutiDiCredito;

import com.corso.java.orangee.ColoringConsole.ColoringConsole;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Persona marito1 = new Persona("marito", "massimo", "rossi", 60);
        Persona moglie1 = new Persona("moglie", "laura", "cognomeInventato", 55);
        Persona figlio1 = new Persona("figlio", "marco", "rossi", 15);
        Persona figlio2 = new Persona("figlio", "riccardo", "rossi", 31);

        List<Persona> figliFamigliaProva = new ArrayList<>();
        figliFamigliaProva.add(figlio1);
        figliFamigliaProva.add(figlio2);

        Famiglia famigliaProva = new Famiglia(marito1, moglie1, figliFamigliaProva, 10000);

        Banca banca = new Banca("UniCredit");
        Posta posta = new Posta("PosteItaliane", "Roma", 0020);
        IstitutoFinanziario istFinanz = new IstitutoFinanziario("KKK");

        System.out.print(ColoringConsole.GREEN_BOLD_BRIGHT + "FAMIGLIA " + marito1.getCognome());
        banca.incrementaCapitale(famigliaProva, 4000);
        posta.incrementaCapitale(famigliaProva, 3000);
        istFinanz.incrementaCapitale(famigliaProva, 3000);

        System.out.println(ColoringConsole.GREEN_BOLD_BRIGHT + "\n||||" + ColoringConsole.WHITE_BOLD_BRIGHT + "||||" + ColoringConsole.RED_BOLD_BRIGHT + "||||" + ColoringConsole.RESET);
    }
}