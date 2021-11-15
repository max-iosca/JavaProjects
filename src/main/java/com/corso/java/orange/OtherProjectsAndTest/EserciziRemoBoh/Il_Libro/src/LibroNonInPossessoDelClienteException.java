package com.corso.java.orange.OtherProjectsAndTest.EserciziRemoBoh.Il_Libro.src;

public class LibroNonInPossessoDelClienteException extends Exception {

	public LibroNonInPossessoDelClienteException() 
	{
		System.out.println("Il Cliente NON possiede questo libro. Non posso rimetterlo a scaffale.");
	}
}
