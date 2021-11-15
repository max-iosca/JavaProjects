package com.corso.java.orange.OtherProjectsAndTest.EserciziRemoBoh.EserEccez.src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class EserEccez {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		System.out.println("Cerchiamo di capire le eccezioni");
try {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci il nome del file: ");
		String miofile = input.next();
		String percorso = "C://Utenti/Massimo/Destop/" +miofile+".txt";
		FileReader f = new FileReader(percorso);
		BufferedReader reader = new BufferedReader(f);
		ArrayList<String> v = new ArrayList<String>();
		String riga = reader.readLine();
		
		int i = 0;
		while (riga != null)
		{
			v.add(riga);
			System.out.println("Riga: " + i + "| testo: " + riga);
			i++;
			riga = reader.readLine();
		}
		for (int j = 0; j < v.size(); j++) 
		{
			System.out.println("Riga: " + j + "| Testo prova: " + v.get(j));
		}
		f.close();
		reader.close();
		input.close();
     } 

catch (FileNotFoundException e) 
{
	System.out.println("File non trovato ATTENZIONE!!!");
}
/*
finally {
	f.close();
	reader.close()
}
*/
System.out.println("END");
	}

}
