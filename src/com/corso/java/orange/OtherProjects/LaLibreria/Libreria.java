package com.corso.java.orange.OtherProjects.LaLibreria;

public class Libreria {

	public static final int NR_MAX_LIBRI_IN_LIBRERIA = 20;
	private Libro[] libri;

	public Libreria() {
		libri = new Libro[NR_MAX_LIBRI_IN_LIBRERIA];
	}

	public Libreria(Libro[] libri) {
		this.libri = libri;
	}

	public void riconsegnaLibro(Cliente cliente, Libro libro) {
		int contatore = 0;
		boolean trovatoSpazio = false;

		try {
			// cerca uno spazio libero in libreria
			for (Libro item : libri) {
				// se trova lo spazio libero prova a toglierlo dallo zaino del cliente
				if (item == null) {
					cliente.riconsegnaLibro(libro); // qui pu� scatenarsi una eccezione
													// LibroNonInPossessoDelClienteException
					trovatoSpazio = true;
					break; // se ha trovato uno spazio esce dal for per evitare inutili ricerche successive
				}
				contatore++;
			}

			// se non ha trovato spazio stampa l'errore.
			if (!trovatoSpazio) {
				System.out.println("Libro non aggiunto allo scaffale per mancanza di spazio");
			} else {
				// se trova spazio lo rimette in libreria
				libri[contatore] = libro;
			}

			// se il libro non � posseduto dal cliente salta direttamente qui
		} catch (LibroNonInPossessoDelClienteException e) {
			System.out.println("Libro non in possesso del cliente");
		}
	}

	// cliente.proceduraRiconsegnaLibro(libro)
	public void affittaLibro(Cliente cliente, Libro libro) {
		int contatore = 0;
		boolean trovato = false;
		for (Libro item : libri) {
			if (item != null && item.getTitololibro().equals(libro.getTitololibro())) {
				trovato = true;
				break;
			}
			contatore++;
		}

		if (!trovato) {
			System.out.println("libro assente");
		} else {
			try {
				cliente.affittaLibro(libro);
				libri[contatore] = null;
				System.out.println("libro: " + libro.getTitololibro() + " consegnato al ciente: " + cliente.getIdentificativo());

			} catch (LibroGiaInPossessoException e) {

				System.out.println("Hai gia 3 libri prenotati, devi prima effettuare una riconsegna.");
			} catch (NoSpazioLiberoNelloZainoException e) {
				System.out.println("Non c'� spazio libero nello zaino del cliente. \n");

			}

		}
	}

}
