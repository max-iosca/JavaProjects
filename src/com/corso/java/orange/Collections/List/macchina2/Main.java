package com.corso.java.orange.Collections.List.macchina2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Macchina> macchine = new ArrayList<>();
        macchine.add(new Macchina("Fiat 500", 2001, new Motore(500)));
        macchine.add(new Macchina("Fiesta 505", 2001, new Motore(500)));
        macchine.add(new Macchina("Ferrari GT", 2005, new Motore(1400)));
        macchine.add(new Macchina("Yaris I", 2005, new Motore(1400)));
        macchine.add(new Macchina("Punto X", 2005, new Motore(500)));

        System.out.println("\nSolo le macchine con cilindrata 1400");
        stampaMacchine(macchine, 1400);
    }


    private static void stampaMacchine(List<Macchina> macchine, Integer cilindrata) {
        for(Macchina macchina: macchine) {
            if (cilindrata!=null && cilindrata.equals(macchina.getMotore().getCilindrata())) {
                System.out.println("Macchina: " + macchina.getModello() + ", anno: " + macchina.getAnno()
                        + ", cilindrata: " + macchina.getMotore().getCilindrata());
            }
        }
    }

}
