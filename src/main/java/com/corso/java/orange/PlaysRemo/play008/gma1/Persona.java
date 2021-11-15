package com.corso.java.orange.PlaysRemo.play008.gma1;
import java.util.Random;

public class Persona {

	private static int eta = calcRandomByRange(18, 90);

	public Persona() {
	}
	public Persona(int eta) {
		this.eta =  eta;
	}
	public static  int getEta() {
		return eta;
	}
	public void setEta(int eta) {
		this.eta = eta;
	}
	
	private static int calcRandomByRange(int min, int max) {
		Random random = new Random();
		return random.nextInt(max) + min;
	}
}
