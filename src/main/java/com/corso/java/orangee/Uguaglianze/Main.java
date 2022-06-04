package com.corso.java.orangee.Uguaglianze;

import java.time.LocalDate;

public class Main {


    public static void main(String[] args) {

        Person persona1 = new Person("Remo", "Candeli", "CNDRME",
                LocalDate.of(1970, 11, 10),"M");

        Person persona2 = new Person("Albert", "Einstein", "NSTLBR",
                LocalDate.of(1975, 7, 15),"M");

        Person persona3 = new Person("Marie", "Curie", "MRCRIE",
                LocalDate.of(1975, 7, 15),"M");


        Person persona4 = new Person("Niels", "Bohr", "BHRNLS",
                LocalDate.of(1976, 3, 18),"M");



        // NOOOOOOOO!
        // l'operatore '==' in comparazione tra due oggetti cerca di comparare i riferimenti ad essi
        // in questo caso cerca di capire se 'persona1' e 'persona2' stanno puntando allo stesso oggetto.
        if (persona1==persona2) {
            System.out.println("NON CI ENTRA MAI!");
        }

        // confronto diretto tra due stringhe presenti nei due oggetti
        // non molto oop. Notare, cmq, il corretto uso del metodo equals che, in questo caso, compara
        // correttamente le due stringhe per capire se sono uguali.
        if (persona1.getFiscalCode().equals(persona2.getFiscalCode())) {
            System.out.println("Persona1 e Persona2 sono uguali");
        } else {
            System.out.println("Persona1 e Persona2 NON sono uguali");
        }

        // equals tra due oggetti confronta i due oggetti chiamando il metodo equals che dovrebbe essere implementato.
        // in questo caso viene chiamato il metodo equals da 'persona2', ma é indifferente il verso
        // poiché il metodo equals ha senso applicarlo tra due oggetti della stessa classe/gerarchia (IS-A)
        if (persona2.equals(persona3)) {
            System.out.println("Persona2 e Persona3 sono uguali");
        }

        if (persona1.equals(persona4)) {
            System.out.println("Persona1 e Persona4 sono uguali");
        }
    }
}
