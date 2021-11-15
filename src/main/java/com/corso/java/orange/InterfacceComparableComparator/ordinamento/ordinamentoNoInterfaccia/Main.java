package com.corso.java.orange.InterfacceComparableComparator.ordinamento.ordinamentoNoInterfaccia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Famiglia> listaFamiglia = new ArrayList<>();

        Famiglia fam01 = new Famiglia("ABC", 10);
        Famiglia fam02 = new Famiglia("AAB", 5);
        Famiglia fam03 = new Famiglia("ZZZ", 2);
        Famiglia fam04 = new Famiglia("ABC", 9);
        Famiglia fam05 = new Famiglia("ZAZ", 5);

        listaFamiglia.add(fam01);
        listaFamiglia.add(fam02);
        listaFamiglia.add(fam03);
        listaFamiglia.add(fam04);
        listaFamiglia.add(fam05);

        Collections.sort(listaFamiglia);
        stampaLista(listaFamiglia);
        listaFamiglia.sort((Famiglia p1, Famiglia p2) -> p1.getCognome().compareTo(p2.getCognome()));
        stampaLista(listaFamiglia);

    }

    public static void stampaLista(List<Famiglia> listaFam){
        System.out.println("\n");
        for(Famiglia fam : listaFam){
            System.out.println("COGNOME: "+fam.getCognome()+" NR FIGLI: "+fam.getNrFigli());
        }

    }
}
