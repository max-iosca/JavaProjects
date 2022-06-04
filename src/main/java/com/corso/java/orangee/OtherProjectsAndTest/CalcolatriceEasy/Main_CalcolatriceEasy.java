package com.corso.java.orangee.OtherProjectsAndTest.CalcolatriceEasy;

public class Main_CalcolatriceEasy {

    public static void main(String[] args) {
/**
 * E' NA MERDA CON TUTTI QUESTI TRY/CATCH MA DURANTE LA LEZIONE DI UNIT TEST....C'ARRANGIAMO COSI'
 * LA SOLUZIONE POTREBBE ESSERE QUELLA DI CREARE UN METODO QUI NELLA CLASSE MAIN CHE FUNGE DA CHIAMANTE
 * AL METODO calcola(), e li utilizzare il try e catchare l'eccezione....sarebbe un pochino meglio.
 */
        int num1 = 10;
        int num2 = 25;
        System.out.println("NUMERI IN INGRESSO - N1: "+num1+" N2: "+num2);
        Operazione somma = new Addizione();
        int risultatoSomma = 0;
        try {
            risultatoSomma = somma.calcola(num1, num2);
        } catch (DivisionePerZeroException e) {
            e.printStackTrace();
        }
        System.out.println("La somma é: " + risultatoSomma +"\n");

        Operazione sottrazione = new Sottrazione();
        int risultatoSottrazione = 0;
        try {
            risultatoSottrazione = sottrazione.calcola(num1,num2);
        } catch (DivisionePerZeroException e) {
            e.printStackTrace();
        }
        System.out.println("La sottrazione é: " + risultatoSottrazione+"\n");

        Operazione moltiplicazione = new Moltiplicazione();
        int risultatoMoltiplicazione = 0;
        try {
            risultatoMoltiplicazione = moltiplicazione.calcola(num1, num2);
        } catch (DivisionePerZeroException e) {
            e.printStackTrace();
        }
        System.out.println("La moltiplicazione é: " + risultatoMoltiplicazione+"\n");

        Operazione divisione = new Divisione();
        int risultatoDivisione = 0;
        try {
            risultatoDivisione = divisione.calcola(num1, num2);
        } catch (DivisionePerZeroException e) {
            e.printStackTrace();
        }
        System.out.println("La divisione é: " + risultatoDivisione+"\n");
    }
}
