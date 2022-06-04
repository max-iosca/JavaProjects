package com.corso.java.orangee.Eccezioni.basic;

import com.corso.java.orangee.ColoringConsole.ColoringConsole;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws ValoreQtaFuoriRangeException, NomeChiaveInvalidoException, QtaComplessivaSuperioreA10Exception {

        ServizioGenerico servizioGenerico = new ServizioGenerico();

        System.err.println(ColoringConsole.GREEN + "\n metodoChiamatoConEccezionePrecisa -------------->> "+ColoringConsole.RESET);
        servizioGenerico.metodoChiamatoConEccezionePrecisa("Remo", 0);

        System.err.println(ColoringConsole.GREEN + "\n metodoChiamatoConEccezioneGenerica -------------->> "+ColoringConsole.RESET);
        servizioGenerico.metodoChiamatoConEccezioneGenerica("Remo", 0);

        System.err.println(ColoringConsole.GREEN + "\n metodoChiamatoConEccezioneConCostruttoreDichiarato -------------->> "+ColoringConsole.RESET);
        servizioGenerico.metodoChiamatoConEccezioneConCostruttoreDichiarato("Remo", 9);
        servizioGenerico.metodoChiamatoConEccezioneConCostruttoreDichiarato("Remo", 2);

        //System.err.println(ColoringConsole.GREEN + "\n metodoChiamatoSenzaGestioneDelleEccezioni -------------->> "+ColoringConsole.RESET);
        //servizioGenerico.metodoChiamatoSenzaGestioneDelleEccezioni("Remo", 11);

        esempioConUsoDiReflection();

        /*
        // lamica (mi raccomando non scrivere cosi) mandava email.
        // l'amica  mandava email.
        //List<String> lista = null;
        List<String> lista = new ArrayList<>();
        try {
            lista.add("Remo");
        } catch(NullPointerException e) {
            System.out.println("errore da non fare");
        }
         */

    }


    /**
     * Questo é un semplice esempio di uso della Reflection (con annesso utilizzo del try...catch).
     *
     * Un meccanismo molto potente per poter interagire direttamente a runtime con la VM.
     * Si puó chiedere alla VM di ottenere informazioni a runtime sulla esistenza o meno.
     *
     */
    private static void esempioConUsoDiReflection() {
        try {
            Class classe = Class.forName("org.corso.orangee.eccezioni.contocorrente.Banca");
            Method[] arrayDiMetodi = classe.getDeclaredMethods();
            List<Method> metodiDellaClasseBanca = Arrays.asList(arrayDiMetodi);
            for(Method metodo: metodiDellaClasseBanca) {
                System.out.println(" - " + metodo.getName());
            }
        } catch (ClassNotFoundException e) {
            System.err.println("La classe Banca non é stata trovata!");
        }
    }
}
