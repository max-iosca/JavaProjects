package com.corso.java.orange.OtherProjectsAndTest.EserciziRemoBoh.Play011.src;

import java.util.ArrayList;
import java.util.List;

public class Famiglia {

	private Persona padre;
	private Persona madre;
	
	private List<Persona> figli;
	private List<Persona> nonni;
	public Famiglia() {
	}

	public Famiglia(Persona padre, Persona madre) {
		this.padre = padre;
		this.madre = madre;
		figli = new ArrayList<>();
		nonni = new ArrayList<>();

	}

	public void aggiungiFiglio(Persona figlio) {
		figli.add(figlio);
	}
	public boolean aggiungiNonno(Persona individuo) {		
		if( individuo == null || individuo.getEta() < 65) {
			return false;
		}
		if (nonni.size() >= 4) {
			return false;
		}
		int contaNonnoM = 0;
		int contaNonnoF = 0;
		for( Persona nonno: nonni) {
			if(nonno.getGenere().equals(Genere.MASCHIO)) {
				contaNonnoM++;
			}
			if(nonno.getGenere().equals(Genere.FEMMINA)) {
				contaNonnoF++;
			}
		}
		
		if(contaNonnoM < 2 && individuo.getGenere().equals(Genere.MASCHIO)) {
			nonni.add(individuo);
			return true;
		}
		if(contaNonnoF < 2 && individuo.getGenere().equals(Genere.FEMMINA)) {
			nonni.add(individuo);
			return true;
		}
		return false;
	}
	
	
	public void stampaStatoDiFamiglia() {

		System.out.println("La famiglia è composta da: " + padre.getNome() + "| " + madre.getNome());

		
		for (Persona figlio : figli) {
			System.out.println(" Nome figlio:" + figlio.getNome() + "| Età figlio: " + figlio.getEta());
		}
		if (figli.isEmpty()) {
			System.out.println("\n La famiglia non ha prole");
		}
	}

	public List<Persona> getFigli() {
		return figli;
	}

	

}
