package com.corso.java.orangee.Ricorsione.intermediate;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<Persona> popolazione;

    public static void main(String[] args) {

        popolazione = new ArrayList<>();
        for(int i = 0; i<10; i++) {
            popolazione.add(new Persona("cognome-"+(i+1), "CF-"+(i+1)));
        }

        scrivi(popolazione.get(popolazione.size()-1), popolazione.size()-1);
        leggi(popolazione.get(popolazione.size()-1), 1);
    }


    /**
     * Ricorsione in lettura
     *
     * @param persona
     * @param counter
     */
    private static void leggi(Persona persona, int counter) {
        if (persona.getFiglio()!=null) {
            for(int i=0; i<counter; i++) {
                System.out.print("\t");
            }
            System.out.println(persona.getCognome() + " é il padre di " + persona.getFiglio().getCognome());
            leggi(persona.getFiglio(), ++counter);
        }
        else {
            System.out.println(" fine albero ");
        }
    }

    /**
     * Ricorsione in scrittura
     * @param persona
     * @param counter
     */
    private static void scrivi(Persona persona, int counter) {
        if (counter>0) {
            Persona figlio = persona.aggiungiFiglio(popolazione.get(counter-1));
            scrivi(figlio, counter-1);
        } else{
            return;
        }
    }


}
