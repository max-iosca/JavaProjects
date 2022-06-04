package com.corso.java.orangee.OtherProjectsAndTest.EserciziRemoBoh.Uguali.src;
/*
 Scrivere una classe Java Uguali(con metodo Portale) che chiede all'utente di inserire due numeri interi...
 Si stamperà il messaggio "sono uguali!" se i due numeri sono uguali e "non sono uguali!" altrimenti...
 Eseguire l'esercizio utilizzando prima il costrutto if/else e dopo l'peratore ternario.
*/

import java.util.Scanner;

public class Uguali {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Inserisci il primo numero: ");
		int nA = input.nextInt();
		System.out.println("Inserisci il secondo numero: ");
		int nB = input.nextInt();

		System.out.println("Come vuoi risolvere l'esercizio?");
		System.out.println(" Digita a) if/else Oppure b) Operatore Ternario");
		int scelta = input.nextInt();

		
		String variabileUno = "";

		switch (scelta) {
		case 'a':
			if (nA == nB) {
				System.out.println("Sono uguali!");
			} else {
				System.out.println("Non sono uguali");
			}
			break;
		case 'b':
			variabileUno = ((nA == nB) ? "Sono uguali" : "Non sono uguali");

			break;
		default:
			System.out.println("Scelta errata");
		}
		
		System.out.println(variabileUno);
		System.out.println("Arrivederci");
	}
}
