package com.corso.java.orangee.Array.cifraturaRemo;

public class Main {
    public static void main(String[] args) {

        Cifratore cifratore = new Cifratore("12345");
        String textToCrypt = "remo e paperino";
        String criptedText = cifratore.encrypt(textToCrypt);
        System.out.println("Cifratura di "+textToCrypt+": " + criptedText);
        String decriptedText = cifratore.decrypt(criptedText);
        System.out.println("Decifratura di " + criptedText+ " : " + decriptedText);

    }
}
