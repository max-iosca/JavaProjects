package com.corso.java.orange.OtherProjects.LaLibreria;

public class LibroNonInPossessoDelClienteException extends Exception {

	public LibroNonInPossessoDelClienteException() 
	{
		System.out.println("Il Cliente NON possiede questo libro. Non posso rimetterlo a scaffale.");
	}
}
