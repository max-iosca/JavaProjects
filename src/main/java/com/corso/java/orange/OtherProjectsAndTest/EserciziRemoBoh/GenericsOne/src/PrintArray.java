package com.corso.java.orange.OtherProjectsAndTest.EserciziRemoBoh.GenericsOne.src;

public class PrintArray {

	public PrintArray() {}

	public void printArray (Integer el[]) {  // stampa array di interi
		for (Integer i : el)
			System.out.print(i +" ");
	}
	
	public void priuntArray (Double el[]) { // stampa array di double
		for (Double i: el)
			System.out.print(i + " ");
	}
	
	public void printArray (Character el []) { // stampa array di caratteri
		for (Character i: el)
			System.out.print(i + " ");
	}
}
