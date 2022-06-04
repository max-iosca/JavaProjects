package com.corso.java.orangee.Collections.Set.basic;
import com.corso.java.orangee.Collections.Maps.basic.libro.Libro;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


/**
 * I set:
 *   - non ammettono duplicati
 *   - non sono ordinati
 *   - ammettono la presenza di un solo elemento null
 *   - il tempo di accesso ad un elemento é mediamente complessitá O(1): buono!
 *   - il tempo di aggiunta di un elemento é mediamente complessitá O(1): buono!
 *   - il tempo attraversamento del set é mediamente complessitá O(h/n): Non buono!
 *
 */
public class CollectionSet {

    public static void main(String[] args) {
        // questa é la sintassi corretta per creare insieme di oggetti
        // Questo insieme: puó contenere SOLO elementi di tipo 'Libro' (o suoi sottotipi)
        Set<Libro> sacco = new HashSet<>();

        // creiamo i libri
        Libro libro1 = new Libro("Moby Dick", "Herman Melville");
        Libro libro2 = new Libro("I promessi sposi", "Alessandro Manzoni");
        Libro libro3 = new Libro("Patterns Of Enterprise Application Architecture", "Martin Fowler");
        Libro libro4 = new Libro("Design Patterns", "GoF");
        Libro libro5 = new Libro("Expert One-on-One J2EE Design and Development", "Rod Johnson");

        sacco.add(libro1);
        sacco.add(libro2);
        sacco.add(libro3);
        sacco.add(libro4);

        libro4.setTitolo("Design Patterns Vol.2");

        System.out.println("\ncaricati 4 libri nel sacco...");
        stampaSacco(sacco);

        // Proviamo ad aggiungere due volte lo stesso oggetto al set
        System.out.println("\nAggiungiamo per la seconda volta il 'Design Patterns' al sacco...");
        boolean esitoOperazione = sacco.add(libro4);
        System.out.println("\til libro '"+ libro4.getTitolo()+ "'" + (esitoOperazione?" é stato aggiunto.":" NON é stato aggiunto."));
        stampaSacco(sacco);

        // cerchiamo un libro nel sacco
        System.out.println("\nCerchiamo il libro di 'Rod Johnson' nel sacco..");
        System.out.println("\til libro '"+ libro5.getTitolo()+ "'" + (sacco.contains(libro5)?" é nel sacco":" NON é nel sacco."));

        // verifichiamo se il sacco é vuoto
        System.out.println("\nIl sacco " + (sacco.isEmpty()?"é vuoto":"non é vuoto")  +  " !");

        // chiediamo al sacco quanti elementi contiene
        System.out.println("\nIl sacco contiene " + sacco.size() +  " elementi !");

        // togliamo il libro 'Design Patterns' dal sacco
        System.out.println("\nTogliamo il libro '"+ libro4.getTitolo()+ "' dal sacco...");
        esitoOperazione = sacco.remove(libro4);
        System.out.println("\til libro '"+ libro4.getTitolo()+ "'" + (esitoOperazione?" é stato rimosso.":" NON é stato rimosso."));
        stampaSacco(sacco);

        /* Non possiamo mai usare un ciclo 'for..each' per rimuovere 1 o piú elementi da un set...
           otterremo una eccezione strana: 'java.util.ConcurrentModificationException', ma sensata!
           for(Libro libro: sacco) {
               elenco.remove(libro);
           }
        */

        // come al solito é necessario utilizzare un Iteratore...
        // ...ce lo facciamo dare dal set...
        Iterator<Libro> iteratore = sacco.iterator();
        //... e poi lo usiamo in un while
        while(iteratore.hasNext()) {
            Libro libro = iteratore.next();
            if (libro!=null)
                iteratore.remove();
        }
    }

    public static void stampaSacco(Set<Libro> sacco) {
        for(Libro libro: sacco) {
            System.out.println("\tlibro " + libro.getTitolo() + " (hashcode = " + libro.hashCode()+")");
        }
    }
}

