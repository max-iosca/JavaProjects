package com.corso.java.orangee.OtherProjectsAndTest.EserciziRemoBoh.Play011.src;

public class Persona {

	private Genere genere;
	private String nome = "";
	private int eta = 0;

	public Persona() {
	}

	public Persona(Genere genere, String nome, int eta) {

		this.genere = genere;
		this.nome = nome;
		this.eta = eta;

	}

	public String getNome() {
		return nome;
	}

	public Genere getGenere() {
		return genere;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

}
