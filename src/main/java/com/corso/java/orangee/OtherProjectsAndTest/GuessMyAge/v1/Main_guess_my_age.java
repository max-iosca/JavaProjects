package com.corso.java.orangee.OtherProjectsAndTest.GuessMyAge.v1;


import java.util.*;

public class Main_guess_my_age {

	public static void main(String[] args) {

		List<Giocatore> giocatori = new ArrayList<>();
		popolaListaGicatori(giocatori);
		Persona personaDaIndovinare = new Persona("Agamennone", "Il Greco", null);
		visualizzaTitolo();
		visualizzaRegolamento();
		System.out.println(giocatori.toString());
		iniziaIlGioco(personaDaIndovinare, giocatori);
		Collections.sort(giocatori, Collections.reverseOrder());
		visualizzaClassificaFinale(giocatori);
	}

	public static void iniziaIlGioco(Persona persona, List<Giocatore> giocatori) {
		Scanner input = new Scanner(System.in);
		Scanner inputscelta = new Scanner(System.in);
		String scelta;
		System.out.println("L'Ignoto di questa sera si chiama " + persona.getNome() + " " + persona.getCognome());
		for (Giocatore giocatoreAttuale : giocatori) {
			System.out.println("Turno del Giocatore: " + giocatoreAttuale.getNome() + giocatoreAttuale.getCognome());
			do {
				System.out.println("(Il CONDUTTORE apre la busta contenente l'età esatta da indovinare. E': "
						+ persona.getEta() + ")");
				
				for (int i = 1; i <= 5; i++) {
					System.out.println("\nTentativo n° " + i);
					System.out.println("QUAL'E' LA SUA ETA'??");
					int tentativo = input.nextInt();

					if (tentativo < persona.getEta()) {
						System.out.println("Ti stai avvicinando...ma l'età da te espressa è INFERIORE rispetto all'età corretta");
					}
					if (tentativo > persona.getEta()) {
						System.out.println("Ti stai avvicinando...ma l'età da te espressa è MAGGIORE rispetto all'età corretta");
					}
					if (tentativo == persona.getEta()) {
						System.out.println("RISPOSTA ESATTA!!!");
						giocatoreAttuale.incrementaVittorie();
						break;
					}
				}
				visualizzaTestoFinale(giocatoreAttuale, persona);
				scelta = inputscelta.next();
				if (scelta.equalsIgnoreCase("y")) {
					persona = new Persona("Agamennone", "Il Greco", null);
				}
			} while (scelta.equalsIgnoreCase("y"));
		}
		System.out.println("GUESS MY AGE " + "\n GAME OVER");
		input.close();
		inputscelta.close();
	}			
	
	public static void popolaListaGicatori(List<Giocatore> giocatori) {
		  giocatori.add(new Giocatore("Mario", "Rossi", 45));
		  giocatori.add(new Giocatore("Paolo", "Gialli", 45));
		  giocatori.add(new Giocatore("Mario", "Blu", 45));
		}
	
	public static void visualizzaTitolo() {
		System.out.println("======================" + "\nPlay008 Guess My Age Versione 1.0 BASIC" + "\n======================");
		}

	public static void visualizzaRegolamento() {
		System.out.println("[--!--] REGOLE DEL GIOCO [--!--]\n");
		System.out.println(""
				+ "[1] TU, GIOCATORE...dovrai indovinare l'età della persona entro un numero NUM MAX di 5 tentativi."
				+ "\n[2] Se fallirai un tentativo, verrai avvisato in caso di avvicinamento per eccesso o difetto."
				+ "\n[3]Se non indovinerai l'età entro i tentativi a disposizione verrà dichiarata la fine del gioco!"
				+ "\n[4]E TU AVRAI PERSOO!!! Mahuhahuahua...."
				+ "\nGOOD LUCK!");
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
