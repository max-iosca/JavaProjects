package com.corso.java.orange.OtherProjectsAndTest.EserciziRemoBoh.Play011.src;

import java.util.ArrayList;
import java.util.List;

public class Main_play011 {

	public static void main(String[] args) {

		List<Persona> individui = new ArrayList<>();
		individui.add(new Persona(Genere.MASCHIO, "Massimo", 31));
		individui.add(new Persona(Genere.MASCHIO, "Massimo", 31));
		individui.add(new Persona(Genere.FEMMINA, "Laura", 26));
		individui.add(new Persona(Genere.MASCHIO, "Pippo", 41));
		individui.add(new Persona(Genere.FEMMINA, "Filippa", 40));
		individui.add(new Persona(Genere.MASCHIO, "Moreno", 25));
		individui.add(new Persona(Genere.MASCHIO, "Fausto", 24));
		individui.add(new Persona(Genere.FEMMINA, "Claudia", 26));

		// ELENCO DI POSSIBILI NONNI
		List<Persona> nonni = new ArrayList<>();
		nonni.add(new Persona(Genere.MASCHIO, "Pino", 60)); // too young
		nonni.add(new Persona(Genere.FEMMINA, "Fausta", 66));
		nonni.add(new Persona(Genere.MASCHIO, "Fausto", 99));
		nonni.add(new Persona(Genere.FEMMINA, "Vanessa", 97));
		nonni.add(new Persona(Genere.MASCHIO, "Gianpiero", 63)); // too young
		nonni.add(new Persona(Genere.FEMMINA, "Claudia", 63)); // too young
		nonni.add(new Persona(Genere.MASCHIO, "Odoacre", 78));
		nonni.add(new Persona(Genere.FEMMINA, "Cleopatra", 73));
		nonni.add(new Persona(Genere.MASCHIO, "Agamennone", 73));
		nonni.add(new Persona(Genere.FEMMINA, "Poppea", 66));
		nonni.add(new Persona(Genere.MASCHIO, "Ariosto", 70));
		nonni.add(new Persona(Genere.FEMMINA, "Silvia", 64)); // too young

		List<Persona> figli = new ArrayList<>();
		figli.add(new Persona(Genere.MASCHIO, "Pedro", 18));
		figli.add(new Persona(Genere.MASCHIO, "Pablo", 21));
		figli.add(new Persona(Genere.FEMMINA, "Piera", 4));
		figli.add(new Persona(Genere.FEMMINA, "Paola", 6));

		/*
		 * List<Famiglia> famiglie = new ArrayList<>(); famiglie.add(new
		 * Famiglia(individui.get(0), individui.get(1))); famiglie.add(new
		 * Famiglia(individui.get(2), individui.get(3)));
		 */

		List<Famiglia> famiglie = creaFamiglie(individui);
		creaFigli(individui, famiglie);

		for (Famiglia famiglia : famiglie) {
			famiglia.stampaStatoDiFamiglia();
		}

	}

	public static void creaNonni(List<Persona> persone, List<Famiglia> famiglie) {
		/*boolean verificaNonnoAggiunto = false;
		int contaGenereM = 0;
		int contaGenereF = 0;
		List<Persona> nonni = new ArrayList<>();
		if (persone != null) {
			for (Persona persona : persone) {
				if (persona != null && persona.getEta() >= 65) {
					if (persona.getGenere().equals(Genere.MASCHIO) && contaGenereM <= 2) {
						nonni.add(persona);
						contaGenereM++;
						verificaNonnoAggiunto = true;
					}
					if (persona.getGenere().equals(Genere.FEMMINA) && contaGenereF <= 2) {
						nonni.add(persona);
						contaGenereF++;
						verificaNonnoAggiunto = true;
					}
				}
			}*/
			for (int i = 0; i < persone.size() - 1; i++) {
				for (Famiglia famiglia : famiglie) {
					boolean verificaNonnoAggiunto = famiglia.aggiungiNonno(persone.get(i));
					if (verificaNonnoAggiunto) {
						break;
					}
				}
			}
	}

	public static void creaFigli(List<Persona> persone, List<Famiglia> famiglie) {
		List<Persona> minorenni = new ArrayList<>();
		if (persone != null)
			return;
		for (Persona persona : persone) {
			if (persona != null && persona.getEta() < 18) {
				minorenni.add(persona);
			}
			if (minorenni.isEmpty())
				return;
			for (int i = 0; i < minorenni.size() - 1; i++) {
				Persona minorenne = minorenni.get(i);
				for (Famiglia famiglia : famiglie) {
					if (famiglia.getFigli().isEmpty()) {
						famiglia.aggiungiFiglio(minorenne);
						System.out.println(" l'output del metodo creaFigli è: " + famiglia);
						break;
					}
				}
			}
		}

	}

	public static List<Famiglia> creaFamiglie(List<Persona> individui) {
		List<Persona> maschi = new ArrayList<>();
		List<Persona> femmine = new ArrayList<>();
		for (Persona individuo : individui) {
			if (individuo.getGenere().equals(Genere.MASCHIO)) {
				maschi.add(individuo);
			} else {
				femmine.add(individuo);
			}
		}
		List<Famiglia> famiglie = new ArrayList<>();
		for (int i = 0; i < maschi.size() - 1; i++) {
			Persona padre = maschi.get(i);
			Persona madre = femmine.get(i);
			if (padre != null && madre != null) {
				famiglie.add(new Famiglia(padre, madre));
			}
		}
		return famiglie;
	}
}
