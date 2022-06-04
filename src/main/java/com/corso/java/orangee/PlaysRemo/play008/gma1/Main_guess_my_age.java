package com.corso.java.orangee.PlaysRemo.play008.gma1;
import java.util.Scanner;
public class Main_guess_my_age {

	public static void main(String[] args) {
		
		System.out.println("======================");
		System.out.println("Play008 Guess My Age - conduce Enric...REMO CANDELI");
		System.out.println("======================");
		Persona personaDaIndovinare = new Persona(); 
		Giocatore giocatore = new Giocatore("Mario", "Rossi");
		Regolamento regolamento = new Regolamento();
		regolamento.regoleDelGioco();
			
		System.out.println("(Il CONDUTTORE apre la busta contenente l'et� esatta da indovinare. E': "+ personaDaIndovinare.getEta() + ")");
		
		System.out.println(giocatore.toString());
		iniziaIlGioco(personaDaIndovinare);		
	}
	
	public static void iniziaIlGioco(Persona persona) {
		for(int i = 1; i <= 5; i++) {
			Scanner input = new Scanner(System.in);
			System.out.println("Tentativo n� " + i + "\n");
			System.out.println("QUAL'E' L'ETA' DELL'IGNOTO???");
			int tentativo = input.nextInt();
			if(tentativo < persona.getEta()) {
				System.out.println("Ti stai avvicinando...ma l'et� da te espressa � INFERIORE rispetto all'et� corretta");
			}
			if(tentativo > persona.getEta()) {
				System.out.println("Ti stai avvicinando...ma l'et� da te espressa � MAGGIORE rispetto all'et� corretta");
			}
			if(tentativo == persona.getEta()) {
				System.out.println("RISPOSTA ESATTA!!!");
				break;
			}
		}
			System.out.println("Il gioco � terminato");
			System.out.println("GRAZIE PER AVER PARTECIPATO");
		}

}
