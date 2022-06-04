package com.corso.java.orangee.OtherProjectsAndTest.GuessMyAge.v2;

import java.util.*;

public class Main_guess_my_age {

	public static void main(String[] args) {

		List<Giocatore> giocatori = new ArrayList<>();
		Main_guess_my_age guessMyAge = new Main_guess_my_age();
		popolaListaGicatori(giocatori);
		Persona personaDaIndovinare = new Persona("Agamennone", "Il Greco", null);
		visualizzaTitolo();
		visualizzaRegolamento();
		System.out.println(giocatori.toString());
		guessMyAge.iniziaIlGioco(personaDaIndovinare, giocatori);
		Collections.sort(giocatori, Collections.reverseOrder());
		visualizzaClassificaFinale(giocatori);
	}

	public static void visualizzaTitolo() {
		System.out.println("\nPlay008 Guess My Age Versione 3.0 EXPERT con LAST CHANCE");
	}

	public String iniziaIlGioco(Persona persona, List<Giocatore> giocatori) {
		Scanner input = new Scanner(System.in);
		String scelta;

		System.out.println("L'Ignoto di questa sera si chiama " + persona.getNome() + " " + persona.getCognome());
		for (Giocatore giocatoreAttuale : giocatori) {

			System.out.println(
					"Turno del Giocatore: " + giocatoreAttuale.getNome() + " " + giocatoreAttuale.getCognome());
			do {
				System.out.println("(Il CONDUTTORE è l'unico a sapere che l'età corretta da indovinare E': "
						+ persona.getEta() + ")");

				/* DISCREPANZA */ Integer discrepanza = 99; /* DISCREPANZA */ /* DISCREPANZA */ /* DISCREPANZA */
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
		return "GUESS MY AGE " + "\n GAME OVER";
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

	public static void popolaListaGicatori(List<Giocatore> giocatori) {
		giocatori.add(new Giocatore("Mario", "Rossi", 45));
		giocatori.add(new Giocatore("Paolo", "Gialli", 45));
		giocatori.add(new Giocatore("Mario", "Blu", 45));
	}

	public static void visualizzaRegolamento() {
		System.out.println("[--!--] REGOLE DEL GIOCO [--!--]\n");
		System.out.println(""
				+ "[1] TU, GIOCATORE...dovrai indovinare l'età della persona entro un numero NUM MAX di 5 tentativi."
				+ "\n[2] Se fallirai un tentativo, verrai avvisato in caso di avvicinamento per eccesso o difetto."
				+ "\n[3]Se non indovinerai l'età entro i tentativi a disposizione verrà dichiarata la fine del gioco!"
				+ "\n[4]E TU AVRAI PERSOO!!! Mahuhahuahua...." + "\nGOOD LUCK!");
	}

	public static void visualizzaClassificaFinale(List<Giocatore> giocatori) {
		System.out.println("CLASSIFICA FINALE:");
		for (Giocatore giocatore : giocatori) {
			System.out.println(giocatore + " Vittorie: " + giocatore.getNumeroDiVittorie() + "\n");
		}
	}

	public static void visualizzaTestoFinale(Giocatore giocatori, Persona persona) {
		System.out.println("PARTITA CONCLUSA! GRAZIE PER AVER PARTECIPATO!");
		System.out.println("Numero VITTORIE attuali: " + giocatori.getNumeroDiVittorie());
		System.out.println("L'età dell'ignoto è: " + persona.getEta());
		System.out.println("Vuoi giocare un'altra partita? Y/N");
	}
}
