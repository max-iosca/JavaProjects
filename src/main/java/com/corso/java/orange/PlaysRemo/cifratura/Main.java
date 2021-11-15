package com.corso.java.orange.PlaysRemo.cifratura;

/**
 * Realizzare il seguente programma:
 * Dato un array di n caratteri alfabetici in ingresso, ed un array contenente una chiave numerica di 6 cifre.
 * Cifra la parola in ingresso spostando le lettere sull'alfabeto in base alle cifre della chiave assegnata.
 *
 *  Vediamo un esempio:
 *  L'array parola contiene "ciao" e la chiave è la serie di numeri 135427.
 *  Quindi la lettera "c" viene shiftata di un carattere e rimpiazzata dalla lettera "d", la lettera "i" viene
 *  shiftata di tre caratteri e rimpiazzata dalla lettera "l" e così via.
 *  Alla fine del processo la parola "ciao" risulterà cifrata in "dlfs"
 *
 *  La chiave di cifratura rispetta le seguenti regole:
 *  - se nella chiave compre il numero 0, la lettera corrispondente non viene shiftata.
 *  - se la parola da cifrare è più lunga della chiave, le cifre chiave data vengono ripetute partendo dall'inizio
 *  per quante sono le lettere aggiuntive.
 *  - se il conteggio della cifratura supera la lettera "z", si riparte a contare dalla lettera "a" per le cifre rimanenti"
 *
 */
public class Main {
    public static void main(String[] args) {
        Cifratore cifratore = new Cifratore("12345");
        String textToCrypt = "remo e paperino";
        String criptedText = cifratore.encrypt(textToCrypt);
        System.out.println("Cifratura di "+textToCrypt+": " + criptedText);
        String decriptedText = cifratore.decrypt(criptedText);
        System.out.println("Decifratura di " + criptedText+ " : " + decriptedText);
    }
}
