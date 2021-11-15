package com.corso.java.orange.Collections.Set.intermediate;

import java.util.HashSet;
import java.util.Set;

/**
 * <ul>
 *     <li>Contiene elementi unici, il che significa che non consente valori duplicati</li>
 *     <li>Non é ordinato.</li>
 *      <li>Non ha alcun indice e quindi non possiamo accedere ad alcun elemento in base alla posizione.</li>
 * </ul>
 */
public class CollectionSet {

    public static void main(String[] args) {

        Set<Persona> sacco = new HashSet<>();
        Impiegato impiegato = new Impiegato();
        System.out.println(sacco.add(impiegato));
        System.out.println(sacco.add(impiegato));

        sacco.add(new Stagista());

        // errore di compilazione se il Set sacco é di tipo Impiegato o
        //stampaSets(sacco);
        //sacco.remove(impiegato);

        stampaSets(sacco);
    }

    public static void stampaSets(Set<Persona> persone) {
        for(Persona p: persone) {
            System.out.println("person = " + p);
        }
    }


    public static void inserisci(Set sacco, String value) {
        boolean res = sacco.add(value);
        System.out.println((res)?("inserito: "+ value):("Non inserito: "+value));
    }
}
