package com.corso.java.orange.Array.podistica;

public class Main {
    public static void main(String[] args) {
        Corsa corsaPodistica = new Corsa("Maratona di Roma", 42);

        Atleta atleta1 = new Atleta("Massimo", "Iosca", "SCIMSM90", "nomecognome@gmail.com");
        Atleta atleta2 = new Atleta("Alessandro", "Iosca", "SCIASR90", "cognome.nome@gmail.com");
        Atleta atleta3 = new Atleta("Mario", "Iosca", "SCIMRO90", "cognomenome@gmail.com");
        Atleta atleta4 = new Atleta("Pedro", "Iosca","SCIPDO", "nome.cognome@gmail.com");
        corsaPodistica.iscriviAtleta(atleta1);
        corsaPodistica.iscriviAtleta(atleta2);
        corsaPodistica.iscriviAtleta(atleta3);
        corsaPodistica.iscriviAtleta(atleta4);
        corsaPodistica.iscriviAtleta(null);
        //corsaPodistica.iscriviAtleta(atleta1);
        //corsaPodistica.iscriviAtleta(null);

        corsaPodistica.stampaRegistro();
        corsaPodistica.rimuoviIscrizioneAtleta(atleta2);
        corsaPodistica.stampaRegistro();


    }
}
