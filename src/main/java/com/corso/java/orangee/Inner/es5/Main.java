package com.corso.java.orangee.Inner.es5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        Padre classePadre = new Padre("Remo", LocalDate.of(1970, 10, 11),
                "Sara", LocalDate.parse("03/05/2010", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Padre: " + classePadre.getNome() + ", data nascita: " + classePadre.getDataNascita().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("\tFiglio: " + classePadre.getNomeFiglio() + ", data nascita: " + classePadre.getDataNascitaFiglio().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

    }
}
