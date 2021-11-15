package com.corso.java.orange.Eccezioni.esempioGuida;

public class MainConEccezione {

    public static void main(String[] args) {
        String risultato = null;
        try {
            //risultato = eseguiCose("prova");
            risultato = eseguiCose("ciao! ");
            System.out.println(risultato);
            inviaSMS();
        } catch (DatiNonDeveEssereValorizzatoConProvaExcetion e) {
            System.out.println("Errore!");
        }
    }

    private static String eseguiCose(String dati) throws DatiNonDeveEssereValorizzatoConProvaExcetion {
        if (dati.equals("prova")) {
            throw new DatiNonDeveEssereValorizzatoConProvaExcetion();
        }

        return dati.concat(" giusti!");
    }


    private static void inviaSMS() {
        System.out.println("...invia sms...");
    }

}
