package com.corso.java.orange.Collections.Maps.spettacoliTeatro.massimo.v1;

import com.corso.java.orange.ColoringConsole.ColoringConsole;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//NEW DI LISTE E MAPPA
        List<Famiglia> famiglie = new ArrayList<>();
        List<Prenotazione> prenotazioni = new ArrayList<>();
        Map<Integer, Prenotazione> mappaTeatro = new HashMap<>();

//'FROCERIA'..
        System.out.println(ColoringConsole.GREEN_BOLD_BRIGHT+"\n\t\t======================================"+ColoringConsole.RESET);
        System.out.println(ColoringConsole.GREEN_BOLD_BRIGHT+"\t\t========== PLAY045 TEATRINI =========="+ColoringConsole.RESET);
        System.out.println(ColoringConsole.GREEN_BOLD_BRIGHT+"\t\t======================================\n"+ColoringConsole.RESET);

//CREO OGGETTI MOGLIE ED I MARITO
        Persona marito01 = new Persona("Mino");
        Persona marito02 = new Persona("Pino");
        Persona marito03 = new Persona("Gino");
        Persona marito04 = new Persona("Lino");
        Persona marito05 = new Persona("Leio");
        Persona marito06 = new Persona("Paolo");

        Persona moglie01 = new Persona("Mina");
        Persona moglie02 = new Persona("Gina");
        Persona moglie03 = new Persona("Tina");
        Persona moglie04 = new Persona("Lina");
        Persona moglie05 = new Persona("Leia");
        Persona moglie06 = new Persona("Paola");

//LI ACCOPPIO E CREO OGGETTI FAMIGLIA ASSEGNANDO ANCHE DEI FIGLI
        Famiglia famiglia01 = new Famiglia(marito01,moglie01,3);
        famiglie.add(famiglia01);
        Famiglia famiglia02 = new Famiglia(marito02, moglie02, 2);
        famiglie.add(famiglia02);
        Famiglia famiglia03 = new Famiglia(marito03, moglie03, 5);
        famiglie.add(famiglia03);
        Famiglia famiglia04 = new Famiglia(marito04, moglie04, 1);//
        famiglie.add(famiglia04);
        Famiglia famiglia05 = new Famiglia(marito05, moglie05,3);
        famiglie.add(famiglia05);
        Famiglia famiglia06 = new Famiglia(marito06, moglie06,7);

        stampaFamiglie(famiglie);

// PRENOTO LE FAMIGLIE ALLO SPETTACOLO
        Prenotazione prenotazione01 = new Prenotazione(famiglia01, 4);
        prenotazioni.add(prenotazione01);
        Prenotazione prenotazione02 = new Prenotazione(famiglia02, 3);
        prenotazioni.add(prenotazione02);
        Prenotazione prenotazione03 = new Prenotazione(famiglia03, 7);
        prenotazioni.add(prenotazione03);
        Prenotazione prenotazione04 = new Prenotazione(famiglia04, 3);
        prenotazioni.add(prenotazione04);
        Prenotazione prenotazione05 = new Prenotazione(famiglia05, 5); //qui stiamo a 22.
        prenotazioni.add(prenotazione05);
        Prenotazione prenotazione06 = new Prenotazione(famiglia06, 9); //

        stampaPrenotazioni(prenotazioni);

        /**
         * ricordati che la mappa che hai 'creato' è fatta così
         * Map<Integer, Prenotazione> mappaTeatro = new HashMap<>();
         */

        mappaTeatro.put(prenotazione01.getProgressivoPrenotazione(),prenotazione01);
        mappaTeatro.put(prenotazione02.getProgressivoPrenotazione(),prenotazione02);
        mappaTeatro.put(prenotazione03.getProgressivoPrenotazione(),prenotazione03);
        mappaTeatro.put(prenotazione04.getProgressivoPrenotazione(),prenotazione04);
        mappaTeatro.put(prenotazione05.getProgressivoPrenotazione(),prenotazione05);
        mappaTeatro.put(prenotazione06.getProgressivoPrenotazione(),prenotazione06);

        generaMappaSliceOrizzontale(mappaTeatro);
        //NE STAMPA SOLO UNO PERCHE' LA CHIAVE E' SEMPRE LA STESSA, ERGO SOVRASCRIVE.

//MODIFICA DI UNA PRENOTAZIONE PRENOTAZIONE

    }
    public static void stampaFamiglie(List<Famiglia> famiglie) {
        System.out.println(ColoringConsole.BLUE_BOLD_BRIGHT +"- - - - - - - - - - LISTA DELLE FAMIGLIE - - - - - - - - - - -"+ ColoringConsole.RESET);
        for (Famiglia famiglia : famiglie) {
            System.out.print("Marito: "+ famiglia.getMarito().getNome()+" -|- Moglie: "+ famiglia.getMoglie().getNome());
            System.out.println(" --> figli: "+famiglia.getNrfigli()+"== NR COMPONENTI: "+famiglia.getNrComponenti());
        }
        System.out.println(ColoringConsole.BLUE_BOLD +"- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n"+ ColoringConsole.RESET);
    }

    public static void stampaPrenotazioni(List<Prenotazione> prenotazioni) {
        System.out.println(ColoringConsole.RED_BOLD_BRIGHT +"- - - - - - - - - - LISTA DELLE PRENOTAZIONI - - - - - - - - -"+ ColoringConsole.RESET);
        for(Prenotazione prenotazione: prenotazioni){
            System.out.println("PRENOTAZIONE ["+prenotazione.getProgressivoPrenotazione()+"]: --> A NOME DI: '"+prenotazione.getFamiglia().getMarito().getNome()+"' == POSTI PRENOTATI: "+prenotazione.getPostiAttualmenteOccupati());
            System.out.println("Posti ancora liberi in teatro: "+prenotazione.getPostiAttualmenteOccupati());
        }
        System.out.println(ColoringConsole.RED_BOLD +"- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n"+ ColoringConsole.RESET);

    }

//STAMPA MAPPA CON 'SLICE' ORIZZONTALE
    private static void generaMappaSliceOrizzontale(Map<Integer, Prenotazione> mappaDaStampare){
        System.out.println(ColoringConsole.YELLOW_BOLD_BRIGHT +"- - - - - MAPPA DELLE PRENOTAZIONI - - - - -"+ ColoringConsole.RESET);
        for(Map.Entry<Integer, Prenotazione> item : mappaDaStampare.entrySet()){
            System.out.print("Prenotazione["+item.getKey()+"] ");
            System.out.println("Posti prenotati/occupati: "+item.getValue().getPostiPrenotati());
        }
        System.out.println(ColoringConsole.YELLOW_BOLD_BRIGHT +"- - - - - - - - - - -  - - - - - - - - - - -\n"+ ColoringConsole.RESET);
    }
}
