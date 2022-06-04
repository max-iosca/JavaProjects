package com.corso.java.orangee.OtherProjectsAndTest.EserciziRemoBoh.GenericsOne.src;

public class PrintArrayClient {

	public static void main(String[] args) {

		PrintArray pa = new PrintArray();
		
		Double d[] = { 11.1, 11.2, 11.3 };
		Integer i[] = { 12, 13, 14};
		Character c[] = {'a', 'b', 'c'};
		
		System.out.print("[ ");
		
		pa.printArray(c);
		pa.printArray(i);
		pa.printArray(c);
		
		System.out.print(" ]");
		
	}

}
