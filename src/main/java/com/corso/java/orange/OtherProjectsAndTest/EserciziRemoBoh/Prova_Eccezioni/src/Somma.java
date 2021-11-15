package com.corso.java.orange.OtherProjectsAndTest.EserciziRemoBoh.Prova_Eccezioni.src;

public class Somma {

	public Somma() {

	}

	public int SommaNumeri(int x, int y) {

		int somma = 0;

		try {

			if (x < 0 || y < 0) {
				throw new OperandiNegativiException();
			}

			somma = x + y;
			if (somma > 40) {
				throw new SommaException();
			}

		} catch (SommaException | OperandiNegativiException e)

		{

			System.out.println("attenzione, superato il limite fissato a 40");

		}

		/*
		 * catch (OperandiNevativiException e){
		 * 
		 * System.out.println("attenzione, uno dei due operandi è negativo");
		 * 
		 * }
		 */

		return somma;

	}
}
