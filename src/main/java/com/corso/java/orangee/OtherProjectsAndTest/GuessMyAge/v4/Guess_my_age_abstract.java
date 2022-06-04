package com.corso.java.orangee.OtherProjectsAndTest.GuessMyAge.v4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Guess_my_age_abstract {

	public abstract void iniziaIlGioco(Persona persona, List<Giocatore> giocatori);
	
	public void avviaPartita() {
		List<Giocatore> giocatori = new ArrayList<>();
		Persona personaDaIndovinare = new Persona("Agamennone", "Il Greco", null);
		popolaListaGicatori(giocatori);
		visualizzaTitolo();
		visualizzaRegolamento();
		System.out.println(giocatori.toString());
		iniziaIlGioco(personaDaIndovinare, giocatori);
		Collections.sort(giocatori, Collections.reverseOrder());
		visualizzaClassificaFinale(giocatori);
	}

	protected abstract void visualizzaTitolo();

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
