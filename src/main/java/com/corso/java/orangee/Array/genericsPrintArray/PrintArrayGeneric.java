package com.corso.java.orangee.Array.genericsPrintArray;

public class PrintArrayGeneric {
	public PrintArrayGeneric() {
	}

	public <E> void printArray(E el[]) {
		for (E i : el) // stampa in modo generico gli elementi dell'array di differente tipo
			System.out.print(i + " ");
	}
}