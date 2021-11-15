package com.corso.java.orange.InterfacceComparableComparator.ordinamento.ordinamentoSiInterfaccia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Famiglia> listaFamiglia = new ArrayList<>();
/*
        Famiglia fam01 = new Famiglia("ABC", 11);
        Famiglia fam02 = new Famiglia("AAB", 15);
        Famiglia fam03 = new Famiglia("ZZZ", 12);
        Famiglia fam04 = new Famiglia("ABC", 19);
        Famiglia fam05 = new Famiglia("ZAZ", 15);
        Famiglia fam06 = new Famiglia("ABC", 19);
        Famiglia fam09 = new Famiglia("ABC",21);
        Famiglia fam07 = new Famiglia("ABC", 00);
        Famiglia fam08 = new Famiglia("ABC",null);
*/

        Famiglia fam01 = new Famiglia("ABC", 1);
        Famiglia fam02 = new Famiglia("AAB", 5);
        Famiglia fam03 = new Famiglia("ZZZ", 2);
        Famiglia fam04 = new Famiglia("ABC", 7);
        Famiglia fam05 = new Famiglia("ZAZ", 5);
        Famiglia fam06 = new Famiglia("ABC", 9);
        Famiglia fam09 = new Famiglia("ABC",1);
        Famiglia fam07 = new Famiglia("ABC", 00);
        Famiglia fam08 = new Famiglia("ABC",null);

        listaFamiglia.add(fam01);
        listaFamiglia.add(fam02);
        listaFamiglia.add(fam03);
        listaFamiglia.add(fam04);
        listaFamiglia.add(fam05);
        listaFamiglia.add(fam06);
        listaFamiglia.add(fam07);
        listaFamiglia.add(fam08);
        listaFamiglia.add(fam09);

        List<Famiglia> lista02 = new ArrayList<>(listaFamiglia);

        Collections.sort(lista02);
        System.out.println("- STAMPO LA LISTA FAMIGLIA PER COGNOME");
        stampaLista(lista02);
        System.out.println("\n- STAMPO LA LISTA FAMIGLIA PER COGNOME E NUMERO FIGLI -");
        Collections.sort(lista02, new OrdinaListaPerNomeENumFigli());
        stampaLista(lista02);

    }

    public static void stampaLista(List<Famiglia> famiglia){
        for(Famiglia elemento : famiglia) {
            System.out.println(elemento.getCognome()+" "+ elemento.getNrFigli());
        }
    }
}
