package com.corso.java.orangee.Array.cifratura;

public class Main {
    public static void main(String[] args) {


        Parola cifraQuestaParola = new Parola();
        Cifratura cifratura = new Cifratura();

        char[]risultato = cifratura.cifraLaParola(cifraQuestaParola.getParola());
        System.out.println(risultato);

    }
}
