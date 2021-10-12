package com.corso.java.orange.Riferimenti.Esempio1;

/**
 * Questo esempio mostra come funzionano i riferimenti in java.
 *
 */
public class Main {

    public static void main(String[] args) {

        // creiamo una istanza 'remo' di tipo Persona
        Persona remo = new Persona("Remo", "Candeli");
        remo.setResidenza("Latina");    // assegnamo la residenza a remo

        // creiamo una istanza 'gino' di tipo Persona
        Persona gino = new Persona("Gino", "Bianchi");
        gino.setResidenza("Roma");      // assegnamo la residenza a gino

        // stampiamo le istanze (verrá chiamato in automatico il metodo toString() definito
        // nella classe Persona. Se non é definito li viene chiamato quello nella classe Object.
        System.out.println(remo);
        System.out.println(gino);

        // qui viene usata una nuova variabile e ad essa viene assegnato il puntatore (riferimento)
        // all'istanza di 'gino' creata prima.
        // ora 'variabileIstanzaPersona' e 'gino' puntano tutte e due allo stesso oggetto istanza.
        Persona variabileIstanzaPersona = gino;


        // se provo a cambiare la residenza dell'istanza 'gino'...
        gino.setResidenza("Roma Nord");

        // ..e poi chiedo di stampare l'oggetto puntato dalla variabile 'variabileIstanzaPersona'
        // noteró che anche per questa variabile il contenuto di 'residenza' é stato cambiato.
        System.out.println(variabileIstanzaPersona);

        // questo é il modo in cui funzionano i riferimenti che, di fatto, so puntatori.

    }
}
