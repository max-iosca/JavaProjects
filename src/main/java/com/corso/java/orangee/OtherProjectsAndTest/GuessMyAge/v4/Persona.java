package com.corso.java.orangee.OtherProjectsAndTest.GuessMyAge.v4;
public class Persona {

	private String nome;
	private String cognome;
	private Integer eta;

	public Persona(String nome, String cognome, Integer eta) {
		this.nome = nome;
		this.cognome = cognome;
		if (eta == null) {
			this.eta = calcRandomByRange(18, 90);
		} else {
			this.eta = eta;
		}
	}

	public int getEta() {
		return eta;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	private int calcRandomByRange(int min, int max) {
		return (int) ((Math.random() * (max - min)) + min);
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public void setEta(Integer eta) {
		this.eta = eta;
	}
}
