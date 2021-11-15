package com.corso.java.orange.PlaysRemo.play003;

public class Main {

    public static void main(String[] args) 	{

        Operazione somma = new Somma();
        int risultato = somma.calcola(10, 25);
        System.out.println("La somma di " + somma.getOperando1() + " e " + somma.getOperando2()+ " e': " + risultato);

        Operazione sottrazione = new Sottrazione();
        risultato = sottrazione.calcola(10, 2);
        System.out.println("La sottrazione " + sottrazione.getOperando1() + " meno " + sottrazione.getOperando2()+ " e': " + risultato);

        Operazione moltiplicazione = new Moltiplicazione();
        risultato = moltiplicazione.calcola(10, 2);
        System.out.println("La moltiplicazione " + moltiplicazione.getOperando1() + " per " + moltiplicazione.getOperando2()+ " e': " + risultato);

        Operazione divisione = new Divisione();
        risultato = divisione.calcola(10, 2);
        System.out.println("La divisione " + divisione.getOperando1() + " diviso " + divisione.getOperando2()+ " e': " + risultato);
    }

}


