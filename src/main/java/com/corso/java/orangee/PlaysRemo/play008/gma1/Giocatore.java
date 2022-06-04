package com.corso.java.orangee.PlaysRemo.play008.gma1;

public class Giocatore extends Persona {
//Più opportuno CONCORRENTE
	
	private String nome;
	private String cognome;
	
	public Giocatore() {
		
	}
	
	public Giocatore(String nome, String cognome) {
		this.nome = nome;
		this.cognome=cognome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String toString() {
		return "\nIl giocatore di questa sera è: " + getNome() + " " + getCognome();
	}
	
	
}
