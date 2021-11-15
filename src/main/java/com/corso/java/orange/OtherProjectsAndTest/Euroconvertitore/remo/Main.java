package com.corso.java.orange.OtherProjectsAndTest.Euroconvertitore.remo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Dimmi a chi di vuoi collegare.");
        String scelta  = input.nextLine();

        SitoCambi sitoCambi = null;
        if (scelta.equals("I")) {
            sitoCambi = new SitoCambi();
        }
        if (scelta.equals("G")) {
            sitoCambi  = new SitoCambiGoogle();
        }
        if (scelta.equals("A")) {
            sitoCambi  = new SitoCambiAmazon();
        }

        EuroConvertitore euroConvertitore = new EuroConvertitore(sitoCambi);
    }
}
