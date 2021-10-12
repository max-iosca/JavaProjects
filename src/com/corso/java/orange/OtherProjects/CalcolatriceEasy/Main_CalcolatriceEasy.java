package com.corso.java.orange.OtherProjects.CalcolatriceEasy;

public class Main_CalcolatriceEasy {

    public static void main(String[] args) {

        Operazione somma = new Addizione();
        int risultatoSomma = somma.calcola(10, 25);
        System.out.println("La somma é: " + risultatoSomma +"\n");

        Operazione sottrazione = new Sottrazione();
        int risultatoSottrazione = sottrazione.calcola(10,25);
        System.out.println("La sottrazione é: " + risultatoSottrazione+"\n");

        Operazione moltiplicazione = new Moltiplicazione();
        int risultatoMoltiplicazione = moltiplicazione.calcola(10, 25);
        System.out.println("La moltiplicazione é: " + risultatoMoltiplicazione+"\n");

        Operazione divisione = new Divisione();
        int risultatoDivisione = divisione.calcola(10, 25);
        System.out.println("La divisione é: " + risultatoDivisione+"\n");

    }
}
