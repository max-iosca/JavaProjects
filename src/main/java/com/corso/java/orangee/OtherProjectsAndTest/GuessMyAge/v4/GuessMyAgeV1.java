package com.corso.java.orangee.OtherProjectsAndTest.GuessMyAge.v4;

import java.util.List;
import java.util.Scanner;

public class GuessMyAgeV1 extends Guess_my_age_abstract {
	
	public void visualizzaTitolo() {

		System.out.println("===" + "\nPlay008 Guess My Age Versione 1.0" + "\n===");
	}
	
	public void iniziaIlGioco(Persona persona, List<Giocatore> giocatori) {
		Scanner input = new Scanner(System.in);
		String scelta;
		System.out.println("L'Ignoto di questa sera si chiama " + persona.getNome() + " " + persona.getCognome());
		for (Giocatore giocatoreAttuale : giocatori) {
			System.out.println("Turno del Giocatore: " + giocatoreAttuale.getNome() + " " + giocatoreAttuale.getCognome());
			do {
				System.out.println("(Il CONDUTTORE è l'unico a sapere che l'età corretta da indovinare E': " + persona.getEta() + ")");
				
				for (int i = 1; i <= 5; i++) {
					System.out.println("\nTentativo n° " + i);
					System.out.println("QUAL'E' LA SUA ETA'??");
					int tentativo = input.nextInt();
					valutaEta(tentativo, persona, giocatoreAttuale);
				}
				visualizzaTestoFinale(giocatoreAttuale, persona);
				scelta = input.next();
				if (scelta.equalsIgnoreCase("y")) {
					persona = new Persona("Agamennone", "Il Greco", null);
				}
			} while (scelta.equalsIgnoreCase("y"));
		}
		System.out.println("GUESS MY AGE " + "\n GAME OVER");
		input.close();
	}
	
	private boolean valutaEta(int etaEspressaDalGiocatore, Persona persona, Giocatore giocatore) {
		boolean risultato = false;
		
		if(etaEspressaDalGiocatore < persona.getEta()) {
			System.out.println("Ti stai avvicinando...ma l'età da te espressa è INFERIORE rispetto all'età corretta");			
		}
		if(etaEspressaDalGiocatore > persona.getEta()) {
			System.out.println("Ti stai avvicinando...ma l'età da te espressa è MAGGIORE rispetto all'età corretta");			
		}
		if(etaEspressaDalGiocatore == persona.getEta()) {
			System.out.println("RISPOSTA ESATTA!!!");
			giocatore.incrementaVittorie();
			risultato = true;
		}		
		return risultato;
	}
	
	public void iniziaIlGioco() {
	}
	
}
