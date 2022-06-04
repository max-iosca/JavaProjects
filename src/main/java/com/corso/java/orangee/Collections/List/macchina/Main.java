package com.corso.java.orangee.Collections.List.macchina;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Macchina> elencoMacchine = new ArrayList<Macchina>();

        elencoMacchine.add(new Macchina("Ford Fiesta", 2010));
        elencoMacchine.add(new Macchina("Ford Focus", 2020));
        elencoMacchine.add(new Macchina("Ford Mustang", 2010));
        elencoMacchine.add(new Macchina("BMW M3", 2020));
        elencoMacchine.add(new Macchina("Ferrari 848", 2010));

        for (Macchina macchina : elencoMacchine){
            if(macchina.getAnno() == 2010){
                System.out.println("Modello macchina: " + macchina.getModello());
            }
        }
    }
}
