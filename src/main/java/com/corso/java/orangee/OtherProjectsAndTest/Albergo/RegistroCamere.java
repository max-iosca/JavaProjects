package com.corso.java.orangee.OtherProjectsAndTest.Albergo;

import java.util.List;

/**
 * Quando qualuque attributo di classe viene dichiarato con una istruzione tipo:
 * class ClassA {
 *     private RegistroCamere registroCamere;
 *     ....
 * }
 * l'unica azione che puó essere eseguita con la variabile "registroCamere" é lanciare il
 * metodo getCamere() che ritorna una lista di camere.
 * Questo comportamento é utile poiché, nel nostro caso, le implementazini di Assegnazione hanno
 * bisogno solo di questo metodo per ottenere la lista delle camere.
 * Quindi, qualunque sia la classe che implementa l'interfaccia RegistroCamere dovrá
 * per forza implementare il metodo getCamere()
 */
public interface RegistroCamere {
    List<Camera> getCamere();
}
