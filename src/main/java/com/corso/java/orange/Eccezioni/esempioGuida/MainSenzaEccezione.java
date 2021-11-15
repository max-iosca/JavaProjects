package com.corso.java.orange.Eccezioni.esempioGuida;

public class MainSenzaEccezione {

    public static void main(String[] args) {
        String risultato = eseguiCose("prova");

        // se risultato <> "ERRORE" allora stampa risultato e manda SMS
        if (!risultato.equals("ERRORE")) {
            System.out.println(risultato);
            inviaSMS();
        } else {
            // errore quindi non fa nulla
        }
    }

    private static String eseguiCose(String dati) {
        if (dati.equals("prova")) {
            System.out.println("Dati non puó essere valorizzato con 'prova'");
            return "ERORE";
        }

        return dati.concat(" giusti!");
    }


    private static void inviaSMS() {
    }

}
