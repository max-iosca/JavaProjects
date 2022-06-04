package com.corso.java.orangee.OtherProjectsAndTest.EserciziRemoBoh.coseprova.src;

public class coseProva {
	public static void main(String[] args) {
		
		String s1 = new String ("Sono una stringa!");
		char c[] = new char[20];
		s1.getChars(9, 15, c, 5);
		System.out.println(c);	
		
		String t1 = new String ("mammamao");
		String t2 = new String ("lammamao");
		int r1 = t1.compareTo(t2);
		System.out.println(r1);
		
	}

}
