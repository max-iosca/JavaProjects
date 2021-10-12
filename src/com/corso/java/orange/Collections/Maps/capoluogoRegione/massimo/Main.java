package com.corso.java.orange.Collections.Maps.capoluogoRegione.massimo;

import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Main main = new Main();

        Regione rgAbruzzo = new Regione("Abruzzo","L'Aquila");
        Regione rgBasilicata = new Regione("Basilicata","Potenza");
        Regione rgCalabria = new Regione("Calabria","Catanzaro");
        Regione rgCampania = new Regione("Campania","Napoli");
        Regione rgEmiliaRomagna = new Regione("Emilia-Romagna","Bologna");
        Regione rgFriuliVenGen = new Regione("FriuliVenGen","Trieste");
        Regione rgLazio = new Regione("Lazio","Roma");
        Regione rgLiguria = new Regione("Liguria","Genova");
        Regione rgLombardia = new Regione("Lombardia","Milano");
/*
        Map<String, String> mappa = new HashMap<>();
        mappa.put(rgAbruzzo.getNomeRegione().toLowerCase(), rgAbruzzo.getCittàCapoluogo());
        mappa.put(rgBasilicata.getNomeRegione().toLowerCase(), rgBasilicata.getCittàCapoluogo());
        mappa.put(rgCalabria.getNomeRegione().toLowerCase(), rgCalabria.getCittàCapoluogo());
        mappa.put(rgCampania.getNomeRegione().toLowerCase(), rgCampania.getCittàCapoluogo());
        mappa.put(rgEmiliaRomagna.getNomeRegione().toLowerCase(),rgEmiliaRomagna.getCittàCapoluogo());
        mappa.put(rgFriuliVenGen.getNomeRegione().toLowerCase(),rgFriuliVenGen.getCittàCapoluogo());
        mappa.put(rgLazio.getNomeRegione().toLowerCase(),rgLazio.getCittàCapoluogo());
        mappa.put(rgLiguria.getNomeRegione().toLowerCase(),rgLiguria.getCittàCapoluogo());
        mappa.put(rgLombardia.getNomeRegione().toLowerCase(), rgLombardia.getCittàCapoluogo());


        stampaMappa(mappa);

        Scanner richiestaCitta = new Scanner(System.in);
        System.out.println("Chiedimi la regione e ti dirò qual'è il suo capoluogo: ");
        String regioneInInput = richiestaCitta.nextLine();
        main.estrazioneCapoluogo(mappa,regioneInInput);
*/

    }
    public static void stampaMappa(Map<String, String> mappa) {
        for(Map.Entry<String, String> item : mappa.entrySet()) {
            System.out.println("Il Capoluogo della Regione" +item.getValue() +   " è: " +item.getKey());
        }
    }

    public void estrazioneCapoluogo(Map<String, String> mappa, String regioneRichiesta) {

            String capoluogoTrovato = mappa.get(regioneRichiesta.toLowerCase());
            if(capoluogoTrovato!=null){
            System.out.println("Il capoluogo è: " + capoluogoTrovato);
            } else {
                System.out.println(" Errore! Inserisci una regione italiana valida");
            }
    }
}
