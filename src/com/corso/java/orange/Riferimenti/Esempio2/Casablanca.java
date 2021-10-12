package com.corso.java.orange.Riferimenti.Esempio2;

public class Casablanca {

    /**
     * Questo metodo puó ricevere solo un parametro di tipo Persona
     * Nella sua implementazione cambia il genere della persona.
     * Questa modifica é eseguita direttamente sull'oggetto originale che
     * é stato ricevuto come parametro.
     * @param persona
     */
    public void cambiaGenerePersona(Persona persona) {
        if (persona.getGenere().equals("Maschio"))
            persona.setGenere("Femmina");
        else
            persona.setGenere("Maschio");
    }
}
