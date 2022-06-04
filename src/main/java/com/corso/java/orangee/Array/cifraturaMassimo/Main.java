package com.corso.java.orangee.Array.cifraturaMassimo;

public class Main {
    public static void main(String[] args) {

        Cifrario cifrario = new Cifrario("12345");
        String testoDaCifrare = "Massimo e Laura";
        String testoCriptato = cifrario.cripta(testoDaCifrare);
        System.out.println("Cifratura di "+testoDaCifrare+" : " +testoCriptato);
        String testoDecriptato = cifrario.decripta(testoCriptato);
        System.out.println("Decifratura di "+testoCriptato+ " : "+testoDecriptato);

    }
}
