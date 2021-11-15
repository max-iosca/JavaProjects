package com.corso.java.orange.Collections.Maps.basic.libro;
import com.corso.java.orange.ColoringConsole.ColoringConsole;

import java.util.*;

/**
 * Caratteristiche:
 * <ul>
 *  <li>richiedono una chiave K ed un valore V</li>
 *  <li>sono l'implementazione di array associativi user-oriented</li>
 *  <li>non possono consentire chiavi duplicate</li>
 *  <li>possono contenere valori nulli (HashMap, LinkedHashMap)</li>
 * </ul>
 *
 *  <p>Nelle mappe il valore di K e di V viene determinato dal programmatore (da noi!).
 *  Possiamo quindi, ad esempio, facilmente creare un dizionario della lingua italiana.
 *  In K mettiamo il vocabolo ed in V mettiamo il suo significato.
 *  Sia la chiave che il suo corrispondente valore sono di tipo Stringa:
 *                  <pre>{@code Map<String, String> nomeMappa = new ...}</pre>
 *
 **/
public class CollectionMap {

    /**
     *  Qui viene usata la sintassi corretta per creare una Mappa di oggetti.
     *
     *  <p>Questa Mappa é tipizzata: puó contenere SOLO elementi di tipo 'Libro' (o suoi sottotipi)
     *  La mappa prevede due dimensioni:
     *          Chiave (K) - Valore (V)
     *  In questa mappa ci mettiamo: in chiave (K) il codice ISBN del libro ed in valore (V) il libro.
     *
     *
     * @param args argomenti del main
     */
    public static void main(String[] args) {
        Map<String, Libro> mappa = new HashMap<>();

        // creiamo i libri
        Libro libro1 = new Libro("Moby Dick", "Herman Melville", "78-81-7525-766-6");
        Libro libro2 = new Libro("I promessi sposi", "Alessandro Manzoni", "99-81-7525-766-4");
        Libro libro3 = new Libro("Patterns Of Enterprise Application Architecture", "Martin Fowler", "78-87-6525-766-3");
        Libro libro4 = new Libro("Design Patterns", "GoF", "78-81-7525-441-1");
        Libro libro5 = new Libro("Expert One-on-One J2EE Design and Development", "Rod Johnson", "78-81-7525-841-5");

        // aggiungiamo i libri alla mappa
        System.out.println(ColoringConsole.GREEN_BOLD + "\ncaricati 4 libri nella mappa..."+ ColoringConsole.RESET);
        mappa.put(libro1.getIsbn(), libro1);
        mappa.put(libro2.getIsbn(), libro2);
        mappa.put(libro3.getIsbn(), libro3);
        mappa.put(libro4.getIsbn(), libro4);


        for(String chiave: mappa.keySet()) {
            System.out.println("\tTrovato il libro " + mappa.get(chiave).getTitolo());
        }
        stampaMappa(mappa);

        // cerchiamo un elemento nella mappa tramite la chiave
        System.out.println(ColoringConsole.GREEN_BOLD + "\nCerchiamo il libro 'Design Patterns' nella mappa.."+ ColoringConsole.RESET);
        Libro libro = mappa.get(libro4.getIsbn());
        if (libro!=null)
            System.out.println("\til libro '"+ libro.getTitolo()+ "' é stato trovato nella mappa!");
        else
            System.out.println("\til libro '"+ libro4.getTitolo()+ "' NON é stato trovato nella mappa!");

        // Proviamo ad aggiungere due volte lo stesso oggetto alla mappa, ma in realtá non é una aggiunta,
        // perché le mappe hanno le chiavi e quindi viene eseguita a, tutti gli effetti, una sostituzione di un oggetto
        // associato a quella chiave.
        System.out.println(ColoringConsole.GREEN_BOLD + "\nAggiungiamo per la seconda volta il 'Design Patterns' alla mappa..."+ ColoringConsole.RESET);
        Libro libroAggiunto = mappa.put(libro4.getIsbn(), libro4);
        System.out.println("\til libro '"+ libroAggiunto.getTitolo()+ "' é sempre lui, non viene aggiunto due volte");
        stampaMappa(mappa);


        // copiamo il contenuto della mappa in una nuova mappa mappaCopiata
        System.out.println(ColoringConsole.GREEN_BOLD + "\nCopiamo la mappa in un altra mappa..."+ ColoringConsole.RESET);
        Map<String, Libro> mappaCopiata = new HashMap<>();
        mappaCopiata.putAll(mappa);
        System.out.println("\tStampiamo la nuova mappa");
        stampaMappaSliceOrizzontale(mappaCopiata);

        // possiamo cancellare il contenuto della nuova mappa
        System.out.println(ColoringConsole.GREEN_BOLD + "\nCancelliamo il contenuto della nuova mappa..."+ ColoringConsole.RESET);
        mappaCopiata.clear();
        System.out.println("\tProviamo a ristampare il contenuto della mappaCopiata");
        if (mappaCopiata.isEmpty())
            System.out.println("\tIl mappaCopiata é vuota!");
        else
            stampaMappa(mappaCopiata);


        // rimuove un elemento della mappa
        System.out.println(ColoringConsole.GREEN_BOLD + "\nRimuoviamo il libro con codice '"+ libro4.getIsbn()+"' dalla mappa..."+ ColoringConsole.RESET);
        Libro libroRimosso = mappa.remove(libro4.getIsbn());
        System.out.println("\tIl libro " + libro.getTitolo() + (libroRimosso==null?"non":"")  +  " é stato rimosso dalla mappa!");


        // rimozione di elementi da una mappa tramite l'iteratore
        System.out.println(ColoringConsole.GREEN_BOLD + "\nRimuoviamo tutti i libri dalla mappa usando un iteratore..."+ ColoringConsole.RESET);
        Iterator<String> iteratore = mappa.keySet().iterator();
        while(iteratore.hasNext()) {
            String isbn = iteratore.next();
            if (isbn!=null) {
                iteratore.remove();
            }
        }
        System.out.println("\tI libri sono stati tutti rimossi dalla mappa. Nr elementi nella mappa: " + mappa.size());
    }


    /**
     * Stampa della mappa utilizzando un for..loop che esegue una operazione di 'slice' verticale sulle chiavi (K) della mappa.
     *
     * <p>Questo si ottiene chiedendo alla mappa solo le sue chiavi (tutte).
     * Il metodo keyset() ritorna tutte le chiavi della mappa dentro una collection Set.
     * Con la chiave disponibile ad ogni ciclo possiamo chiedere alla mappa di stampare il valore associato
     * alla chiave.
     * @param mappa la mappa da ciclare
     */
    public static void stampaMappa(Map<String, Libro> mappa) {
        for(String chiave: mappa.keySet()) {
            System.out.println("\tTrovato il libro " + mappa.get(chiave).getTitolo());
        }
    }

    /**
     * Stampa della mappa utilizzando un for..loop che esegue una operazione di 'slice' verticale sui valori (V) della mappa.
     *
     * <p>Questo si ottiene chiedendo alla mappa solo le sue chiavi (tutte).
     * Il metodo keyset() ritorna tutte le chiavi della mappa dentro una collection Set.
     * Con la chiave disponibile ad ogni ciclo possiamo chiedere alla mappa di stampare il valore associato
     * alla chiave.
     * @param mappa mappa da ciclare
     */
    public static void stampaMappaPerValore(Map<String, Libro> mappa) {
        for(Libro libro: mappa.values()) {
            System.out.println("\tTrovato il libro " + libro.getTitolo());
        }
    }

    /**
     * Stampa della mappa utilizzando un for..loop che esegue una operazione di 'slice' orizzontale.
     *
     * <p>Il metodo entrySet() ritorna una collection Set in cui ogni elemento contiene, a sua volta, una coppia (K, V).
     * Ad ogni ciclo, dunque, abbiamo accesso diretto sia alla chiave (item.getKey()) che al valore (item.getValue())
     * @param mappa mappa da ciclare
     */
    public static void stampaMappaSliceOrizzontale(Map<String, Libro> mappa) {
        for(Map.Entry<String, Libro> item: mappa.entrySet()) {
            System.out.println("\tTrovato il libro " + item.getValue().getTitolo() + " con chiave " + item.getKey());
        }
    }
}
