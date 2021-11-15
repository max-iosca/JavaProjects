package com.corso.java.orange.OtherProjectsAndTest.EserciziRemoBoh.Il_Libro.src;

public class Il_Libro {

	public static void main(String[] args) {
		
		System.out.println("BENVENUTO NELLA LIBRERIA || IL LIBRO ||\n");
		
		//creo oggetto cliente
		
		Cliente cliente1 = new Cliente("Tizio");
		Cliente cliente2 = new Cliente("Caio");
		Cliente cliente3 = new Cliente ("Sempronio");
		
		Libro libro1 = new Libro( "Titolo1" ,"Autore1");
		Libro libro2 = new Libro( "Titolo2" ,"Autore2"  );
		Libro libro3 = new Libro( "Titolo3" ,"Autore3" );
		Libro libro4 = new Libro("Titolo4" ,"Autore4" );
		Libro libro5 = new Libro( "Titolo1" ,"Autore1");
		
		Libro[] libri = new Libro[20];
		libri[0] = libro1;
		libri[1] = libro2;
		libri[2] = libro3;
		libri[3] = libro4;
		libri[4] = libro5;
		
		Libreria libreria = new Libreria(libri);
		
		libreria.affittaLibro(cliente1, libro1);
		libreria.affittaLibro(cliente1, libro2);
		libreria.affittaLibro(cliente1, libro3);
		libreria.affittaLibro(cliente1, libro4);
		//cliente richiede libro
		libreria.affittaLibro(cliente2, libro5);
		libreria.affittaLibro(cliente2, libro5);
		
		
		//verifica se il libro c'è
		//verifica se il cliente gia ne ha una copia
		
		//consegnare libro al cliente, rimuovere num copia dalla lista, aggiungerlo allo "zaino" del cliente
		//riconsegna del libro, aggiungere num copia alla lista, rimuoverlo dallo "zaino" del cliente.
		
		
		

	}

}
