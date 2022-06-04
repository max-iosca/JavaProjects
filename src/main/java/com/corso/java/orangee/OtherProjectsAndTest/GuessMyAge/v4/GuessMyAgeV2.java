package com.corso.java.orangee.OtherProjectsAndTest.GuessMyAge.v4;

import java.util.List;
import java.util.Scanner;

public class GuessMyAgeV2 extends Guess_my_age_abstract {
	
	public void visualizzaTitolo() {
		System.out.println("===" + "\nPlay008 Guess My Age Versione 2.0 con LAST CHANCE" + "\n===");
	}
	
	public void iniziaIlGioco(Persona persona, List<Giocatore> giocatori) {
		Scanner input = new Scanner(System.in);
		String scelta;
		System.out.println("L'Ignoto di questa sera si chiama " + persona.getNome() + " " + persona.getCognome());
		for (Giocatore giocatoreAttuale : giocatori) {
			System.out.println("Turno del Giocatore: " + giocatoreAttuale.getNome() + " " + giocatoreAttuale.getCognome());
			do {
				System.out.println("(Il CONDUTTORE è l'unico a sapere che l'età corretta da indovinare E': "+ persona.getEta() + ")");
				Integer discrepanza = 99;
				for (int i = 1; i <= 3; i++) {
					System.out.println("\nTentativo n° " + i);
					System.out.println("QUAL'E' LA SUA ETA'??");
					int tentativo = input.nextInt();
					discrepanza = valutaEta(tentativo, persona, giocatoreAttuale, discrepanza);
				}
				if (discrepanza != 0) {
					ultimoTentativo(giocatoreAttuale, persona, discrepanza);
				}
				visualizzaTestoFinale(giocatoreAttuale, persona);
				scelta = input.next();
				if (scelta.equalsIgnoreCase("y")) {
					persona = new Persona("Agamennone", "Il Greco", null);
				}
			} while (scelta.equalsIgnoreCase("y"));
		}
		input.close();
		System.out.println("GUESS MY AGE " + "\n GAME OVER");
	}

	private void ultimoTentativo(Giocatore giocatore, Persona persona, Integer discrepanza) {
		Scanner input = new Scanner(System.in);
		int ultimoTentativo;
		System.out.println("Ci sei quasi...la differenza dall'età corretta è di: " + discrepanza + " anni");
		System.out.println("Ultimo tentativo....buona fortuna!\n");
		ultimoTentativo = input.nextInt();

		if (ultimoTentativo != persona.getEta()) {
			System.out.println("Mi spiace, non è l'età corretta");
		}

		if (ultimoTentativo == persona.getEta()) {
			System.out.println("RISPOSTA ESATTA!!!");
			giocatore.incrementaVittorie();
		}
		input.close();

	}

	private Integer valutaEta(int etaEspressaDalGiocatore, Persona persona, Giocatore giocatore, Integer discrepanza) {
		Integer discrepanzaLocale = null;

		if (etaEspressaDalGiocatore < persona.getEta()) {
			discrepanzaLocale = persona.getEta() - etaEspressaDalGiocatore;
			if (discrepanzaLocale < discrepanza) {
				discrepanza = discrepanzaLocale;
				return discrepanza;
			}
		}
		if (etaEspressaDalGiocatore > persona.getEta()) {
			discrepanzaLocale = etaEspressaDalGiocatore - persona.getEta();
			if (discrepanzaLocale < discrepanza) {
				discrepanza = discrepanzaLocale;
				return discrepanza;
			}
		}
		if (etaEspressaDalGiocatore == persona.getEta()) {
			discrepanza = 0;
		}

		return discrepanza;
	}
	
	public void iniziaIlGioco() {
	}
}
