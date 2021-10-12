package com.corso.java.orange.Collections.Set.esercizi.esercizio2;

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

        persone.add(persona6);
        System.out.println("\nStampa l'elenco");
        stampaSet(persone);

        System.out.println("\nLa persona " + persona2.getConome() + (persone.contains(persona2) ? " é presente nell'elenco" : " non é presente nell'elenco"));
        System.out.println("\nLa persona " + persona5.getConome() + (persone.contains(persona5) ? " é presente nell'elenco" : " non é presente nell'elenco"));
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

