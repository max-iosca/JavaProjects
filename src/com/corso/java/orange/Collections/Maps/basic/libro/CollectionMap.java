package com.corso.java.orange.Collections.Maps.basic.libro;

import java.util.*;

/**
 * Caratteristiche:
 *  - richiedono una chiave K ed un valore V
 *  - sono l'implementazione di array associativi user-oriented
 *  - non possono consentire chiavi duplicate
 *  - possono contenere valori nulli (HashMap, LinkedHashMap)
 *
 *  Nelle mappe il valore di K e di V viene determinato dal programmatore (da noi!).
 *  Possiamo quindi, ad esempio, facilmente creare un dizionario della lingua italiana.
 *  In K mettiamo il vocabolo ed in V mettiamo il suo significato.
 *  Sia la chiave che il suo corrispondente valore sono di tipo Stringa:
 *                  Map<String, String> nomeMappa = new ...
 *
 */
public class CollectionMap {

    public static void main(String[] args) {
        // questa é la sintassi corretta per creare una Mappa di oggetti
        // Questa Mappa é tipizzata: puó contenere SOLO elementi di tipo 'Libro' (o suoi sottotipi)
        // La mappa prevede due dimensioni: Chiave (K) - Valore (V)
        // In questa mappa ci mettiamo: in chiave (K) il codice ISBN del libro ed in valore (V) il libro.
        Map<String, Libro> mappa = new HashMap<>();

        // creiamo i libri
        Libro libro1 = new Libro("Moby Dick", "Herman Melville", "78-81-7525-766-6");
        Libro libro2 = new Libro("I promessi sposi", "Alessandro Manzoni", "99-81-7525-766-4");
        Libro libro3 = new Libro("Patterns Of Enterprise Application Architecture", "Martin Fowler", "78-87-6525-766-3");
        Libro libro4 = new Libro("Design Patterns", "GoF", "78-81-7525-441-1");
        Libro libro5 = new Libro("Expert One-on-One J2EE Design and Development", "Rod Johnson", "78-81-7525-841-5");

        // aggiungiamo i libri alla mappa
        System.out.println("\ncaricati 4 libri nella mappa...");
        mappa.put(libro1.getIsbn(), libro1);
        mappa.put(libro2.getIsbn(), libro2);
        mappa.put(libro3.getIsbn(), libro3);
        mappa.put(libro4.getIsbn(), libro4);

        //mappa.put(null, libro5);


        stampaMappa(mappa);

        // cerchiamo un elemento nella mappa tramite la chiave
        System.out.println("\nCerchiamo il libro 'Design Patterns' nella mappa..");
        Libro libro = mappa.get(libro4.getIsbn());
        if (libro!=null)
            System.out.println("\til libro '"+ libro.getTitolo()+ "' é stato trovato nella mappa!");
        else
            System.out.println("\til libro '"+ libro4.getTitolo()+ "' NON é stato trovato nella mappa!");

        // Proviamo ad aggiungere due volte lo stesso oggetto alla mappa, ma in realtá non é una aggiunta,
        // perché le mappe hanno le chiavi e quindi viene eseguita a, tutti gli effetti, una sostituzione di un oggetto
        // associato a quella chiave.
        System.out.println("\nAggiungiamo per la seconda volta il 'Design Patterns' alla mappa...");
        Libro libroAggiunto = mappa.put(libro4.getIsbn(), libro4);
        System.out.println("\til libro '"+ libroAggiunto.getTitolo()+ "' é sempre lui, non viene aggiunto due volte");
        stampaMappa(mappa);


        // copiamo il contenuto della mappa in una nuova mappa mappaCopiata
        System.out.println("\nCopiamo la mappa in un altra mappa...");
        Map<String, Libro> mappaCopiata = new HashMap<>();
        mappaCopiata.putAll(mappa);
        System.out.println("\tStampiamo la nuova mappa");
        stampaMappaSliceOrizzontale(mappaCopiata);

        // possiamo cancellare il contenuto della nuova mappa
        System.out.println("\nCancelliamo il contenuto della nuova mappa...");
        mappaCopiata.clear();
        System.out.println("\tProviamo a ristampare il contenuto della mappaCopiata");
        if (mappaCopiata.isEmpty())
            System.out.println("\tIl mappaCopiata é vuota!");
        else
            stampaMappa(mappaCopiata);


        //
        System.out.println("\nRimuoviamo il libro con codice '"+ libro4.getIsbn()+"' dalla mappa...");
        Libro libroRimosso = mappa.remove(libro4.getIsbn());
        System.out.println("\tIl libro " + libro.getTitolo() + (libroRimosso==null?"non":"")  +  " é stato rimosso dalla mappa!");
    }



    public static void stampaMappa(Map<String, Libro> mappa) {
        // per navigare una mappa eseguire una operazione di 'slice' verticale.
        // possiamo chiedergli di tornarci un set di chiavi
        // oppure possiamo chiedergli di navigare un set di valori
        // in ambo i casi possiamo poi navigare il set come sappiamo gia' fare.
        for(String chiave: mappa.keySet()) {
            System.out.println("\tTrovato il libro " + mappa.get(chiave).getTitolo());
        }
    }

    public static void stampaMappaSliceOrizzontale(Map<String, Libro> mappa) {
        // esiste un ulteriore modo per navigare la mappa operando uno 'slice' orizzontale.
        // cosi facendo otteniamo ad ogni ciclo di for..loop un oggetto che contiene sempre sia la chiave che il valore
        // dell'elemento della mappa.
        for(Map.Entry<String, Libro> item: mappa.entrySet()) {
            System.out.println("\tTrovato il libro " + item.getValue().getTitolo() + " con chiave " + item.getKey());
        }
    }
}
