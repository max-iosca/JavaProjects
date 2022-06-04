package com.corso.java.orangee.Array.stringaInversa;

public class Utility {

    public void invertiStringa(String[] stringaIngresso) {
        String stringa = "";
        for (String ogniLettera : stringaIngresso)
            stringa += ogniLettera;
        char[] arrayStringaIngresso = stringa.toCharArray();
        for (char singolaLettera : arrayStringaIngresso) {
            System.out.print(singolaLettera + " / ");
        }
        System.out.println();
        char[] arrayStringaUscita = new char[arrayStringaIngresso.length];
        for (int i = arrayStringaUscita.length - 1; i >= 0; i--) {
            System.out.print(arrayStringaIngresso[i] + " / ");
        }
    }


/*
    public void continuaLaStampa(char[] parolaentrante) {
        System.out.println("questa è la parola che voglio continuare a stampare per 50 volte: ");
        for (int i = 0; i < parolaentrante.length; i++) {
            System.out.print(parolaentrante[i]);
        }
        System.out.println("ora stampo di fila 50 volte: ");
        int j = 0;
        for (int i = 0; i <= 50; i++) {
            System.out.print(parolaentrante[j]);
            j++;
            if (j > 5) {
                j = 0;
            }
        }
    }
*/
}