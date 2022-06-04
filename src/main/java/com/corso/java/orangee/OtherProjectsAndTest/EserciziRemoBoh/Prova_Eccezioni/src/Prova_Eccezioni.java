package com.corso.java.orangee.OtherProjectsAndTest.EserciziRemoBoh.Prova_Eccezioni.src;

public class Prova_Eccezioni {

	public static void main(String[] args) {
	
		
		int a = 15;
		int b = 25;
		int risultato = 0;
		
		Somma calcolo = new Somma();
		
		risultato = calcolo.SommaNumeri(a, b);
		
		System.out.println("La somma dei valori è : " + risultato);
		
	}

}
