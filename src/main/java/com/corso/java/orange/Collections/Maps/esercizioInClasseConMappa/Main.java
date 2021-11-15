package com.corso.java.orange.Collections.Maps.esercizioInClasseConMappa;

import com.corso.java.orange.Collections.List.esercizioinclasse.Numero;
import com.corso.java.orange.ColoringConsole.ColoringConsole;

import java.util.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
/**
 * data una lista di elementi interi(1-200)
 * calcolare la somma del valore degli elementi nella lista.
 */
//CREO UNA LISTA ELEMENTI DI TIPO INTEGER
        List<Integer> listaElementi = new ArrayList<>();

//ISTANZIO E ASSEGNO UN NUMERO AD OGNI OGGETTO NUMERO.
        Numero numero1 = new Numero(99);
        listaElementi.add(numero1.getNumero());
        Numero numero2 = new Numero(5);
        listaElementi.add(numero2.getNumero());
        Numero numero2bis = new Numero(99);
        listaElementi.add(numero2bis.getNumero());
        Numero numero3 = new Numero(7);
        listaElementi.add(numero3.getNumero());
        Numero numero4 = new Numero(9);
        listaElementi.add(numero4.getNumero());
        Numero numero5 = new Numero(12);
        listaElementi.add(numero5.getNumero());
        Numero numero5bis = new Numero(12);
        listaElementi.add(numero5bis.getNumero());
        Numero numero6 = new Numero(15);
        listaElementi.add(numero6.getNumero());
        Numero numero7 = new Numero(18);
        listaElementi.add(numero7.getNumero());
        Numero numero8 = new Numero(151);
        listaElementi.add(numero8.getNumero());
        Numero numero8bis = new Numero(151);
        listaElementi.add(numero8bis.getNumero());
        Numero numero8bisbis = new Numero(151);
        listaElementi.add(numero8bisbis.getNumero());
        Numero numero9 = new Numero(1);
        listaElementi.add(numero9.getNumero());


//STAMPO LA LISTA NUMERI
        System.out.print(ColoringConsole.PURPLE_BOLD_BRIGHT + "LISTA NUMERI: ");
        for (Integer numero : listaElementi) {
            System.out.print(ColoringConsole.PURPLE_BOLD_BRIGHT + numero + ", ");
        }


//STAMPO LA SOMMA DI TUTTI I NUMERI PRESENTI NELLA LISTA
        Integer somma = 0;
        for (Integer elementoAttuale : listaElementi) {
            somma += elementoAttuale;
        }
        System.out.println(ColoringConsole.BLUE_BOLD_BRIGHT + "\nSOMMA NUMERI COMPLESSIVA: " + somma + ColoringConsole.RESET);


//STAMPO LA SOLA SOMMA DEI NUM PARI
        Integer sommaNumPari = 0;
        int modulo = 0;
        for (Integer elementoAttuale : listaElementi) {
            modulo = elementoAttuale % 2;
            //  sommaNumPari += (elementoAttuale % 2 == 0 ? elementoAttuale : 0);
            if (modulo == 0) {
                sommaNumPari += elementoAttuale;
            }
        }
        System.out.println(ColoringConsole.YELLOW_BOLD_BRIGHT + "SOMMA NUMERI PARI: " + sommaNumPari + ColoringConsole.RESET);


//STAMPO IL NUMERO PIU PICCOLO
        int numPiuPiccolo = 999;
        for (Integer elementoAttuale : listaElementi) {
            if (elementoAttuale <= numPiuPiccolo) {
                numPiuPiccolo = elementoAttuale;
            }
        }
        System.out.println(ColoringConsole.RED_BOLD_BRIGHT + "NUMERO PIU' PICCOLO: " + numPiuPiccolo + ColoringConsole.RESET);


//STMAPO IL NUMERO PIU GRANDE
        int numPiuGrande = 0;
        for (Integer elementoAttuale : listaElementi) {
            if (elementoAttuale >= numPiuGrande) {
                numPiuGrande = elementoAttuale;
            }
        }
        System.out.println(ColoringConsole.GREEN_BOLD_BRIGHT + "NUMERO PIU' GRANDE: " + numPiuGrande + ColoringConsole.RESET);


//STAMPO UNA NUOVA LISTA DEI NUMERI PARI....PRESI DALLA LISTA INIZIALE
        modulo = 0;
        List<Integer> listaSoliNumPari = new ArrayList<>();
        for (Integer elementoAttuale : listaElementi) {
            modulo = elementoAttuale % 2;
            if (modulo == 0) {
                listaSoliNumPari.add(elementoAttuale);
            }
        }
        System.out.print(ColoringConsole.CYAN_BOLD_BRIGHT + "LISTA DEI SOLI NUMERI PARI: " + ColoringConsole.RESET);
        for (Integer numeroPariLista : listaSoliNumPari) {
            System.out.print(ColoringConsole.CYAN_BOLD_BRIGHT + numeroPariLista + ", " + ColoringConsole.RESET);
        }


//STAMPARE LE OCCORRENZE IN UNA LISTA, QUANTE VOLTE RISCONTRIAMO UN DETERMINATO NUMERO, MA NON VIENE Xd
        /*
        List<Integer> listaOccorrenze = new ArrayList<>();
        for(int i=0 ; i<listaElementi.size() ; i++){
            int numOccorrenze = 0;
            for(Integer elementoLista : listaElementi){
                if (elementoLista == elementoLista){
                    numOccorrenze++;
                }
                listaOccorrenze.add(numOccorrenze);
            }
        }
        System.out.println("\nLISTA NUMERO OCCORRENZE");
        for(Integer elementoListaOccorrenze : listaOccorrenze){
            System.out.print(elementoListaOccorrenze+", ");
        }
*/

// MA CON UNA MAPPA
//la get lavora SOLO sulle chiavi, ragiona con "DAMMI LA CHIAVE...TI RITORNO UN VALORE" ---> qualcosa.get(nomeChiave)
        System.out.println("\n");
        Map<Integer, Integer> mappaOccorrenze = new HashMap<>();
        for (Integer numeroPresoDallaLista : listaElementi) {
            Integer occorrenzaTrovata = mappaOccorrenze.get(numeroPresoDallaLista);
            if (occorrenzaTrovata == null)
                mappaOccorrenze.put(numeroPresoDallaLista, 1);
            else
                mappaOccorrenze.put(numeroPresoDallaLista, occorrenzaTrovata + 1);
        }
        //for(Map.Entry<Integer, Integer> item: mappaOccorrenze.entrySet()) {
        for (Integer chiave : mappaOccorrenze.keySet()) { // keySet tira fuori le chiavi
            System.out.println(ColoringConsole.WHITE_BOLD_BRIGHT + "L'OCCORRENZA DI " + chiave + " e': " + mappaOccorrenze.get(chiave) + ColoringConsole.RESET);
        }
    }
}
