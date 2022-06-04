package com.corso.java.orangee.InterfacceComparableComparator.ComparableEComparator.esempio2;

import com.corso.java.orangee.ColoringConsole.ColoringConsole;

import java.util.*;

/**
 *
 *
 */
public class EsercitazioneSet {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Albert", "Einstein", "ENSBRT");
        Persona persona2 = new Persona("Niels", "Bohr", "NLSBHR");
        Persona persona3 = new Persona("Leonardo", "Da Vinci", "DVNLNR");
        Persona persona4 = new Persona("Galileo", "Galilei", "GLLGLL");
        Persona persona5 = new Persona("Charles", "Darwin", "DRWCHR");
        Persona persona6 = new Persona("Karl", "Heisenberg", "HSMKRL");

        Set<Persona> persone = new HashSet<>();
        persone.add(persona1);
        persone.add(persona2);
        persone.add(persona3);
        persone.add(persona4);

        persone.contains(persona1);

        persone.add(persona6);
        System.out.println(ColoringConsole.GREEN_BOLD + "\nStampa l'elenco"+ ColoringConsole.RESET);
        stampaSet(persone);

        System.out.println("\nLa persona " + persona2.getConome() + (persone.contains(persona2) ? " e' presente nell'elenco" : " non e' presente nell'elenco"));
        System.out.println("\nLa persona " + persona5.getConome() + (persone.contains(persona5) ? " e' presente nell'elenco" : " non e' presente nell'elenco"));
        System.out.println(persone.size());
    }

    public static void stampaSet(Set<Persona> collezione) {
        for(Persona persona: collezione) {
            System.out.println("\t" + persona.getConome() + " " + persona.getNome());
        }
    }

    public static void stampaSet(List<Persona> collezione) {
        for(Persona persona: collezione) {
            System.out.println("\t" + persona.getConome() + " " + persona.getNome());
        }
    }

}
