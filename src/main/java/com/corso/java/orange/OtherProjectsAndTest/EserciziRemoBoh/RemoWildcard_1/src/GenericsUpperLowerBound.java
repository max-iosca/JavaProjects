package com.corso.java.orange.OtherProjectsAndTest.EserciziRemoBoh.RemoWildcard_1.src;

import java.util.ArrayList;
import java.util.List;

/**
 * Quando si "gioca" con i generics e le collections, bisogna sempre tenere a mente che le collections
 * hanno il vincolo di poter gestire un solo tipo al loro interno.
 * Ad esempio:
 * List<Persona> é una lista che puó contenere solo oggetti di tipo Persona e non oggetti ti tipo Impiegato (anche se
 * Impiegato é una classe che estende Persona).
 *
 *
 *
 */
public class GenericsUpperLowerBound {

    public static void main(String args[]) {
        List<Persona> persone = new ArrayList<>();
        final Persona einstein = new Persona("Albert", "Einstein", "ABRMCCD..");
        final Persona bohr = new Persona("Niels", "Bohr", "NLSBHR..");
        final Persona curie = new Persona("Marie", "Curie", "CRMRI..");
        persone.add(einstein);
        persone.add(bohr);
        persone.add(curie);

        stampaPersone(persone);

        List<Impiegato> impiegati = new ArrayList<>();
        final Impiegato einsteinI = new Impiegato("Albert", "Einstein", "ABRMCCD..", "Contabile");
        final Impiegato bohrI = new Impiegato("Niels", "Bohr", "NLSBHR..", "Agente");
        final Impiegato curieI = new Impiegato("Marie", "Curie", "CRMRI..", "Supervisore");
        impiegati.add(einsteinI);
        impiegati.add(bohrI);
        impiegati.add(curieI);

        stampa(impiegati);
        stampaPersone(impiegati);

        List<Programmatore> programmatori = new ArrayList<>();
        final Programmatore einsteinP = new Programmatore("Albert", "Einstein", "ABRMCCD..", "Contabile", "Java");
        final Programmatore bohrP = new Programmatore("Niels", "Bohr", "NLSBHR..", "Agente", "Ruby");
        final Programmatore curieP = new Programmatore("Marie", "Curie", "CRMRI..", "Supervisore" ,"Angular");
        programmatori.add(einsteinP);
        programmatori.add(bohrP);
        programmatori.add(curieP);

        stampaProgramatori(programmatori);
        //provaAStampareProgrammatori(programmatori);  // non gli piace perché questo metodo accetta solo oggetti che sono superclasse di Impiegati
    }

    public static void stampaProgramatori(List<? extends Impiegato> impiegati) {
        System.out.println("Stampa Programmatori: ");
        for(Impiegato item: impiegati)
            System.out.println(item);
    }


    /**
     * E' importante sottolineare che questo formalismo List<? extends Persona> indica semplicemente che questo metodo
     * accetta come parametro una lista di persone e qualunque altra lista che estende persone. Quindi accetterebbe, ad esempio:
     * stampaPersone(impiegati) // dove impiegati = List<Impiegato>
     *
     * @param persone
     */
    public static void stampaPersone(List<? extends Persona> persone) {
        System.out.println("Stampa Persone: ");
        for(Persona item: persone)
            System.out.println(item);
    }

    public static void stampa(List<? super Programmatore> lista) {
        System.out.println("Stampa Impiegati: ");
        lista.stream().forEach(System.out::println);
    }

    public static void provaAStampareProgrammatori(List<? super Impiegato> lista) {
        System.out.println("Stampa Impiegati: ");
        lista.stream().forEach(elem-> System.out.println(elem));
    }
}