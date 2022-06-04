package com.corso.java.orangee.Array.genericsPrintArray;

public class PrintArrayGenericClient {

	public static void main(String[] args) {
		
		PrintArrayGeneric pag = new PrintArrayGeneric();
		Double d[] = { 11.1, 11.2 };
		Integer i[] = { 12, 13 };
		Character c[] = { 'a', 'b' };
		String s[] = { "sono", "una", "stringa" };
		System.out.print("[ ");
		pag.printArray(d);
		pag.printArray(i);
		pag.printArray(c);
		pag.<String>printArray(s); // sintassi alternativa di invocazione di un metodo
		// generico
		pag.<Double>printArray(d); // oppure così
		System.out.print("]");
		}
		
	}


