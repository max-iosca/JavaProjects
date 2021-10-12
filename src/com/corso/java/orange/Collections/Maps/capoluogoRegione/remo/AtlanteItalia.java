package com.corso.java.orange.Collections.Maps.capoluogoRegione.remo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


    /**
     * Esempio piú OOP che usa una mappa tipizzata con oggetti custom Regione e Capoluogo
     */
    public class AtlanteItalia {

        public static void main(String[] args) {

            Map<Regione, Capoluogo> regioniCapoluoghi = new HashMap<>();

            regioniCapoluoghi.put(new Regione("Toscana"), new Capoluogo("Firenze", "00302"));
            regioniCapoluoghi.put(new Regione("Lazio"), new Capoluogo("Roma", "00303"));
            regioniCapoluoghi.put(new Regione("Umbria"), new Capoluogo("Perugia", "00304"));
            regioniCapoluoghi.put(new Regione("Marche"), new Capoluogo("Ancona", "00305"));
            regioniCapoluoghi.put(new Regione("Veneto"), new Capoluogo("Venezia", "00306"));
            regioniCapoluoghi.put(new Regione("Sicilia"), new Capoluogo("Palermo", "00307"));
            regioniCapoluoghi.put(new Regione("Sardegna"), new Capoluogo("Cagliari", "00308"));

            String nomeRegione = chiediAllUtente();
            Regione regioneDaCercare = new Regione(nomeRegione);

            Capoluogo capoluogoTrovato = regioniCapoluoghi.get(regioneDaCercare);
            if (capoluogoTrovato!=null) {
                System.out.println("Il capoluogo della regione " + regioneDaCercare.getNome() + " é "
                        + capoluogoTrovato.getNome() + ". Il cap é: " + capoluogoTrovato.getCap());
            } else {
                System.out.println("Non é stato trovato il capoluogo per la regione " + regioneDaCercare.getNome());
            }
        }

        private static String chiediAllUtente() {
            Scanner input = new Scanner(System.in);
            System.out.println("Nome regione da cercare: ");
            return input.nextLine();
        }


    }



