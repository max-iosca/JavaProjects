package com.corso.java.orangee.OtherProjectsAndTest.GuessMyAge_V1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Giocatore giocatore = new Giocatore("Massimo" , 31);
        Ignoto ignoto = new Ignoto("Arnaldo" , null);
        iniziaPartita(giocatore , ignoto);
        visualizzaTestoFinale(giocatore);
    }

    private static void iniziaPartita(Giocatore giocatore, Ignoto ignoto){
        Scanner inputEtaDaIndovinare = new Scanner(System.in);
        Scanner sceltaNuovaPartita = new Scanner(System.in);
        System.out.println("L'ignoto di questa sera si chiama: " + ignoto.getNome());
        System.out.println("Il concorrente si chiama: " +giocatore.getNome());
        String scelta;
        do {
            System.out.println("(ETA' DA INDOVINARE: "+ ignoto.getEta()+")");

            for(int i=1 ; i<=3 ; i++){
                System.out.println("Tentativo n° " + i);
                System.out.println("QUAL'E' L'ETA' DELL'IGNOTO");
                int tentativo = inputEtaDaIndovinare.nextInt();

                if (tentativo < ignoto.getEta()){
                    System.out.println("L'ETA' INSERITA E' INFERIORE A QUELLA DELL'IGNOTO");
                }

                if(tentativo > ignoto.getEta()){
                    System.out.println("L'ETA INSERITA E' MAGGIORE A QUELLA DELL'IGNOTO");
                }

                if(tentativo == ignoto.getEta()){
                    System.out.println("!!__!! RISPOSTA ESATTA !!__!!");
                    giocatore.aggiungiVittorie();
                    break;
                }
            }
            visualizzaTestoFinale(giocatore);
            scelta = sceltaNuovaPartita.nextLine();
            if(scelta.equalsIgnoreCase("y")){
                ignoto = new Ignoto("Tizio", null);
            }
        } while (scelta.equalsIgnoreCase("y"));
        inputEtaDaIndovinare.close();
        sceltaNuovaPartita.close();
    }

    private static void visualizzaTestoFinale(Giocatore giocatore) {
        System.out.println("PARTITA CONCLUSA! GRAZIE PER AVER PARTECIPATO!");
        System.out.println("Numero VITTORIE attuali: " + giocatore.getNumeroDiVittorie());
        System.out.println("Vuoi giocare un'altra partita? Y/N");
    }
}
