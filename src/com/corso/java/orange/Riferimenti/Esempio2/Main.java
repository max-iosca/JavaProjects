package com.corso.java.orange.Riferimenti.Esempio2;


/**
 * Questo esempio mostra come funzionano i riferimenti quando vengono
 * passati ad un metodo.
 * Il passaggio di un oggetto ad un metodo avviene sempre per riferimento, mai per valore.
 * Questo vuol dire che se eseguiamo una modifica sui dati di dell'oggetto ricevuto
 * questa modifica viene applicata sull'oggetto originale e non su una sua copia.
 *
 */
public class Main {

    public static void main(String[] args) {

        // creiamo due istanza di Persona
        Persona mario = new Persona("Mario", "Rossi", "Maschio");
        Persona paola = new Persona("Paola", "Bianchi", "Femmina");

        // le stampiamo
        System.out.println(mario);
        System.out.println(paola);

        // creiamo l'istanza della classe Casablanca
        Casablanca casablanca = new Casablanca();

        // passiamo al metodo 'cambiaGenerePersona' le due varibili di tipo Persona
        casablanca.cambiaGenerePersona(mario);
        casablanca.cambiaGenerePersona(paola);
        System.out.println("Dopo l'intervento a Casablanca....");

        // quando proviamo a ristampare le due variabili possiamo verificare che i cambiamenti
        // applicati nel metodo 'cambiaGenerePersona' sono stati applicati effettivamente sugli
        // oggetti originali creati nel main.
        System.out.println(mario);
        System.out.println(paola);
    }
}

