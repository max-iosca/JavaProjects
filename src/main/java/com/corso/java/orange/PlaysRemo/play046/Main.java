package com.corso.java.orange.PlaysRemo.play046;

import com.corso.java.orange.PlaysRemo.play018.Persona;

import java.util.*;

public class Main {

    public static final int FAMIGLIA_IDX_0 = 0;
    public static final int FAMIGLIA_IDX_1 = 1;
    public static final int FAMIGLIA_IDX_2 = 2;
    public static final int FAMIGLIA_IDX_3 = 3;
    public static final int FAMIGLIA_IDX_4 = 4;

    public static void main(String[] args) {

        List<Famiglia> famiglie = creaFamiglie();

        // simula le prenotazioni, modifiche e disdette
        Teatro teatrini = new Teatro();

        // prenotazioni nuove
        teatrini.prenotazione(famiglie.get(FAMIGLIA_IDX_0), generateRandomNumber(1, famiglie.get(FAMIGLIA_IDX_0).getNrComplessivoComponenti()));
        teatrini.prenotazione(famiglie.get(FAMIGLIA_IDX_2), generateRandomNumber(1, famiglie.get(FAMIGLIA_IDX_2).getNrComplessivoComponenti()));
        teatrini.prenotazione(famiglie.get(FAMIGLIA_IDX_3), famiglie.get(FAMIGLIA_IDX_3).getNrComplessivoComponenti());
        teatrini.prenotazione(famiglie.get(FAMIGLIA_IDX_4), famiglie.get(FAMIGLIA_IDX_4).getNrComplessivoComponenti());

        // prenotazione modifica
        teatrini.cambiaPrenotazione(famiglie.get(FAMIGLIA_IDX_0), generateRandomNumber(1, famiglie.get(FAMIGLIA_IDX_0).getNrComplessivoComponenti()));

        // prenotazione nuova
        teatrini.prenotazione(famiglie.get(FAMIGLIA_IDX_1), generateRandomNumber(1, famiglie.get(FAMIGLIA_IDX_1).getNrComplessivoComponenti()));

        // prenotazione disdetta
        teatrini.disdettaPrenotazione(famiglie.get(FAMIGLIA_IDX_0));

        // produce un report delle prenotazioni in essere
        teatrini.reportPrenotazioni();
    }


    /**
     * Crea le famiglie utilizzando una copia del codice usato nell'esercizio play018 - family list.
     *
     * Genera, quindi, persone in una popolazione e produce delle famiglie con marito e moglie.<br>
     * @return elenco delle famiglie generate
     */
    public static List<Famiglia> creaFamiglie() {
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
        aggiungeComponenti(popolazione, famiglie);
        return famiglie;
    }


    /**
     * Algoritmo di aggiunta dei componenti Marito e Moglie in ogni famiglia a
     * partire dalla popolazione
     * @param popolazione popolazione di oggetti Persona
     * @param famiglie elenco di famiglie da popolare
     */
    public static void aggiungeComponenti(List<Persona> popolazione, List<Famiglia> famiglie) {
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
                    Famiglia famiglia = new Famiglia(marito, moglie, generateRandomNumber(1, 5));
                    famiglie.add(famiglia);
                    marito = null;
                    moglie = null;
                }
            }
        }
    }

    private static int generateRandomNumber(int nrMin, int nrMax) {
        Random random = new Random();
        return random.nextInt(nrMax - nrMin) + nrMin;
    }
}
