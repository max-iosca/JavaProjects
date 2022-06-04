package com.corso.java.orangee.OtherProjectsAndTest.GuessMyAge.v2;

public class Giocatore extends Persona implements Comparable<Giocatore> {
	private int numeroDiVittorie = 0;

	public Giocatore(String nome, String cognome, int eta) {
		super(nome, cognome, eta);
		this.numeroDiVittorie = 0;
	}

	public int getNumeroDiVittorie() {
		return numeroDiVittorie;
	}

	public int incrementaVittorie() {
		return numeroDiVittorie++;

	}

	public String toString() {
		return "\nIl giocatore di questa sera è: " + getNome() + " " + getCognome() + " di età: " + getEta();
	}

	public int compareTo(Giocatore giocatore) {
		if (this.numeroDiVittorie > giocatore.getNumeroDiVittorie())
			return 1;
		if (this.numeroDiVittorie < giocatore.getNumeroDiVittorie())
			return -1;
		return 0;
	}
}
