package com.corso.java.orangee.OtherProjectsAndTest.EserciziRemoBoh.Main.src;

public class Cliente {
	
	//metodi: nodoppilibri, max3libri
	
	private String identificativo;
	private int numlibriinaffitto;
	private int max3libri; //utile per condizione di controllo
	
	public Cliente () {}
	
	public Cliente (String identificativo, int numlibriinaffitto)
	{
	 this.identificativo = identificativo;
	 this.numlibriinaffitto = numlibriinaffitto;
	}
	
}
