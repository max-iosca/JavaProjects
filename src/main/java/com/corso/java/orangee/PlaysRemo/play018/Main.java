package com.corso.java.orangee.PlaysRemo.play018;

import com.corso.java.orangee.ColoringConsole.ColoringConsole;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

    private static List<Persona> popolazioneCurr = new LinkedList<>();

    public static void main(String[] args) {
        List<Persona> popolazioneBase = new LinkedList<>();

        popolazioneBase.add(new Persona("Albert", "Einstein", "ENSBRT", "maschio"));
        popolazioneBase.add(new Persona("Lise", "Meitner", "MRRCRR", "femmina"));
        popolazioneBase.add(new Persona("Niels", "Bohr", "NLSBHR", "maschio"));
        popolazioneBase.add(new Persona("Leonardo", "Da Vinci", "DVNLNR", "maschio"));
        popolazioneBase.add(new Persona("Rosalind", "Franklin", "MRRCRR", "femmina"));
        popolazioneBase.add(new Persona("Marie", "Curie", "MRRCRR", "femmina"));
        popolazioneBase.add(new Persona("Galileo", "Galilei", "GLLGLL", "maschio"));
        popolazioneBase.add(new Persona("Fabiola", "Gianotti", "MRRCRR", "femmina"));
        popolazioneBase.add(new Persona("Charles", "Darwin", "DRWCHR", "maschio"));
        popolazioneBase.add(new Persona("Jocelyn", "Bell", "MRRCRR", "femmina"));

        List<Famiglia> famiglie = new LinkedList<>();
        List<Persona> popolazione = new ArrayList<>(popolazioneBase);
        System.out.println(ColoringConsole.GREEN + " Modo 1 -------------->> "+ColoringConsole.RESET);
        long startTime = System.nanoTime();
        soluzioneNumero1(popolazione, famiglie);
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        stampaFamiglie(famiglie, timeElapsed);


        System.out.println(ColoringConsole.GREEN + "\n Modo 2 -------------->> "+ColoringConsole.RESET);
        startTime = System.nanoTime();
        popolazione = new ArrayList<>(popolazioneBase);
        soluzioneNumero2(popolazione, famiglie);
        endTime = System.nanoTime();
        timeElapsed = endTime - startTime;
        stampaFamiglie(famiglie, timeElapsed);


        System.out.println(ColoringConsole.GREEN + "\n Modo 3 -------------->> "+ColoringConsole.RESET);
        startTime = System.nanoTime();
        popolazione = new ArrayList<>(popolazioneBase);
        soluzioneNumero3(popolazione, famiglie);
        endTime = System.nanoTime();
        timeElapsed = endTime - startTime;
        stampaFamiglie(famiglie, timeElapsed);


        System.out.println(ColoringConsole.GREEN + "\n Modo 4 -------------->> "+ColoringConsole.RESET);
        startTime = System.nanoTime();
        popolazione = new ArrayList<>(popolazioneBase);
        soluzioneNumero4(popolazione, famiglie);
        endTime = System.nanoTime();
        timeElapsed = endTime - startTime;
        stampaFamiglie(famiglie, timeElapsed);
    }

    /**
     * Usa l'iteratore e appena trova un candidato lo rimuove dalla lista salvandolo in una variabile.
     * Se le variabili moglie e marito sono valorizzate allora crea la famiglia.
     * Il ciclo superiore serve a rieseguire il tutto per riprocessare le persone scartate in precedenza
     *
     * @param popolazione
     * @param famiglie
     */
    private static void soluzioneNumero1(List<Persona> popolazione, List<Famiglia> famiglie) {
        famiglie.clear();
        Persona marito = null;
        Persona moglie = null;
        while (popolazione.size()>0) {
            Iterator<Persona> popolazioneIterator = popolazione.listIterator();
            while (popolazioneIterator.hasNext()) {
                Persona persona = popolazioneIterator.next();

                if (marito == null && persona.getGenere().equals("maschio")) {
                    marito = persona;
                    popolazioneIterator.remove();
                }
                if (moglie == null && persona.getGenere().equals("femmina")) {
                    moglie = persona;
                    popolazioneIterator.remove();
                }

                if (marito != null && moglie != null) {
                    Famiglia famiglia = new Famiglia();
                    famiglia.setMarito(marito);
                    famiglia.setMoglie(moglie);
                    famiglie.add(famiglia);
                    marito = null;
                    moglie = null;
                }
            }
        }
    }

    /**
     * Usa un iteratore due volte: una volta per creare le famiglie con solo i mariti e li rimuove dalla popolazione.
     * La seconda volta usa l'iteratore per cercare solo le femmine e, rileggendosi le famiglie assegna la moglie
     * se non null.
     * Questa fra tutte sembra essere la soluzione piú performante
     *
     * @param popolazione
     * @param famiglie
     */
    private static void soluzioneNumero2(List<Persona> popolazione, List<Famiglia> famiglie) {
        famiglie.clear();
        Iterator<Persona> popolazioneIterator = popolazione.listIterator();
        while (popolazioneIterator.hasNext()) {
            Persona persona = popolazioneIterator.next();
            if (persona.getGenere().equals("maschio")) {
                Famiglia famiglia = new Famiglia();
                famiglia.setMarito(persona);
                popolazioneIterator.remove();
                famiglie.add(famiglia);
            }
        }
        popolazioneIterator = popolazione.listIterator();
        while (popolazioneIterator.hasNext()) {
            Persona persona = popolazioneIterator.next();
            if (persona.getGenere().equals("femmina")) {
                for(Famiglia famiglia: famiglie) {
                    if (famiglia.getMoglie()==null) {
                        famiglia.setMoglie(persona);
                        break;
                    }
                }
                popolazioneIterator.remove();
            }
        }
    }

    /**
     * Questá e' una soluzione piú furba perché usa due cicli for each per trovare un marito ed una moglie.
     * Poi crea la famiglia e poco dopo rimuove le due persone dalla popolazione.
     * Ripere le stesse operazioni fintanto che la popolazione é vuota o é rimasto un soggetto non accoppiabile.
     *
     * @param popolazione
     * @param famiglie
     */
    private static void soluzioneNumero3(List<Persona> popolazione, List<Famiglia> famiglie) {
        Persona marito = null;
        Persona moglie = null;
        famiglie.clear();
        boolean completato = false;
        do {
            // cerca il primo maschio candidato a formare la famiglia
            for(Persona persona: popolazione) {
                if (persona.getGenere().equals("maschio")) {
                    marito = persona;
                    break;
                }
            }
            // cerca la prima femmina candidata a formare la famiglia
            for(Persona persona: popolazione) {
                if (persona.getGenere().equals("femmina")) {
                    moglie = persona;
                    break;
                }
            }

            // costruisce la famiglia (programmazione difensiva!)
            if (marito != null && moglie != null) {
                Famiglia famiglia = new Famiglia();
                famiglia.setMarito(marito);
                famiglia.setMoglie(moglie);
                famiglie.add(famiglia);
                popolazione.remove(marito);
                popolazione.remove(moglie);
                marito = null;
                moglie = null;
            }

            // determino la condizione di uscita:
            //      lista della popolazione vuota
            //      un maschio o una femmina non sono accoppiabili perché la popolazione é dispari
            if (popolazione.isEmpty() || popolazione.size()==1)
                completato=true;

        } while(!completato);
    }


    /**
     * Questá e' una soluzione usa java avanzato. Non é ottimizzata in termini di performances, ma
     * utilizza gli streams che sono un concetto avanzato di programmazione funzionale presnete da java 1.8.
     * Ricalca la soluzione nr3.
     *
     * @param popolazione
     * @param famiglie
     */
    private static void soluzioneNumero4(List<Persona> popolazione, List<Famiglia> famiglie) {
        Persona marito = null;
        Persona moglie = null;
        boolean completato = false;
        famiglie.clear();

        do {

            // cerca il primo maschio candidato a formare la famiglia
            marito = popolazione.parallelStream().filter(p->p.getGenere().equals("maschio")).findFirst().orElse(null);
            // cerca la prima femmina candidata a formare la famiglia
            moglie = popolazione.parallelStream().filter(p->p.getGenere().equals("femmina")).findFirst().orElse(null);


            // costruisce la famiglia (programmazione difensiva!)
            if (marito != null && moglie != null) {
                Famiglia famiglia = new Famiglia();
                famiglia.setMarito(marito);
                famiglia.setMoglie(moglie);
                famiglie.add(famiglia);
                popolazione.remove(marito);
                popolazione.remove(moglie);
                marito = null;
                moglie = null;
            }

            // determino la condizione di uscita:
            //      lista della popolazione vuota
            //      un maschio o una femmina non sono accoppiabili perché la popolazione é dispari
            if (popolazione.isEmpty() || popolazione.size()==1)
                completato=true;

        } while(!completato);
    }


    private static void stampaFamiglie(List<Famiglia> famiglie, long tempoDiEsecuzione) {
        for(Famiglia famiglia: famiglie) {
            System.out.println("\tFamiglia " + famiglia.getMarito().getCognome()
                    + ", marito: " + famiglia.getMarito().getNome()
                    + ", moglie: " + famiglia.getMoglie().getNome() + " " + famiglia.getMoglie().getCognome());
        }
        System.out.println("Tempo di esecuzione richiesto: " + tempoDiEsecuzione + " nano secondi");
    }

}
