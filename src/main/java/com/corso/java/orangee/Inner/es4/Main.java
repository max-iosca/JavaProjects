package com.corso.java.orangee.Inner.es4;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Padre padre = new Padre("Remo", LocalDate.of(1970, 10, 11));
        System.out.println(padre.stampa());
    }
}
