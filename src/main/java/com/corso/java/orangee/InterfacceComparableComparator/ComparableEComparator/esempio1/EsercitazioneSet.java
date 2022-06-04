package com.corso.java.orangee.InterfacceComparableComparator.ComparableEComparator.esempio1;

import com.corso.java.orangee.ColoringConsole.ColoringConsole;

import java.util.*;

/**
 *
 *
 */
public class EsercitazioneSet {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Albert", "Einstein", "ENSBRT", 48);
        Persona persona2 = new Persona("Niels", "Bohr", "NLSBHR", 65);
        Persona persona3 = new Persona("Leonardo", "Da Vinci", "DVNLNR", 39);
        Persona persona4 = new Persona("Galileo", "Galilei", "GLLGLL", 78);
        Persona persona5 = new Persona("Charles", "Darwin", "DRWCHR", 56);
        Persona persona6 = new Persona("Karl", "Heisenberg", "HSMKRL", 81);

        Set<Persona> persone = new HashSet<>();
        persone.add(persona1);
        persone.add(persona2);
        persone.add(persona3);
        persone.add(persona4);
        persone.add(persona5);
        persone.add(persona6);
        System.out.println(ColoringConsole.GREEN_BOLD + "\nStampa l'elenco delle persone in modo disordinato"+ ColoringConsole.RESET);
        stampaSet(persone);

        // vorremmo provare ad ordinare l'elenco in ordine alfabetico per cognome+Nome
        List<Persona> personeList = new ArrayList<>(persone);
        Collections.sort(personeList);
        System.out.println(ColoringConsole.GREEN_BOLD + "\nStampa l'elenco delle persone in ordine alfabetico usando il .sort"+ ColoringConsole.RESET);
        stampaSet(personeList);

        // vorremmo provare ad ordinare l'elenco in ordine alfabetico per cognome+Nome
        Set<Persona> personeInOrdineAlfabetico = new TreeSet<>();
        personeInOrdineAlfabetico.addAll(persone);
        System.out.println(ColoringConsole.GREEN_BOLD + "\nStampa l'elenco delle persone in ordine alfabetico usando TreeSet"+ ColoringConsole.RESET);
        stampaSet(personeInOrdineAlfabetico);

        // se vogliamo usare un differente ordine di ordinamento ci serve utilizzare l'interfaccia Comparator.
        Collections.sort(personeList, new OrdinaPersonePerEta());
        System.out.println(ColoringConsole.GREEN_BOLD + "\nStampa l'elenco delle persone in ordine di eta usando Comparator"+ ColoringConsole.RESET);
        stampaSet(personeList);

        // con la lambda expresion
        personeList.sort((Persona p1, Persona p2)-> p1.getConome().compareTo(p2.getConome()));
        System.out.println(ColoringConsole.GREEN_BOLD + "\nStampa l'elenco delle persone in ordine di cognomi usando Comparator con la lambda "+ ColoringConsole.RESET);
        stampaSet(personeList);

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
