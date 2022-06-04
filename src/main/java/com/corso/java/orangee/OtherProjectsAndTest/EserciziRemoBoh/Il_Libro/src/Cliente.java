package com.corso.java.orangee.OtherProjectsAndTest.EserciziRemoBoh.Il_Libro.src;

public class Cliente {

	// metodi: nodoppilibri, max3libri
	public static final int NR_MAX_LIBRI_PER_CLIENTE = 3;
	private String identificativo;

	private Libro[] libri;

	public Cliente() {
	}

	public Cliente(String identificativo) {
		this.identificativo = identificativo;
		// this.numlibriinaffitto = numlibriinaffitto;
		// numlibriinaffitto = 0;
		libri = new Libro[NR_MAX_LIBRI_PER_CLIENTE];
	}

	public String getIdentificativo() {
		return identificativo;
	}

	public Libro[] getLibri() {
		return libri;
	}

	public void setLibri(Libro[] libri) {
		this.libri = libri;
	}

	public void setIdentificativo(String identificativo) {
		this.identificativo = identificativo;
	}

	// __________________________________________________________________________________

	public void affittaLibro(Libro libro) throws LibroGiaInPossessoException, NoSpazioLiberoNelloZainoException {

		Integer posizioneLibera = ottieniPosizioneLiberaNelloZaino();
		if (posizioneLibera == null) {

			throw new NoSpazioLiberoNelloZainoException();

		}
		for (Libro local : libri) {
			if ((local != null) && (local.getTitololibro().equals(libro.getTitololibro()))) {
				throw new LibroGiaInPossessoException();
			}

		}

		libri[posizioneLibera] = libro;

	}

	public void riconsegnaLibro(Libro libro) throws LibroNonInPossessoDelClienteException { // TOGLIE IL LIBRO DALLO
																							// ZAINO

		int contatore = 0;
		boolean libroTrovato = false;
		for (Libro variable : libri) {

			if (variable.getTitololibro().equals(libro.getTitololibro())) {
				System.out.println("Riconsegna del libro ");
				libri[contatore] = null;
				libroTrovato = true;
				break;
			}
			contatore++;
		}
		if (libroTrovato == false) {
			throw new LibroNonInPossessoDelClienteException();
		}

	}

	private Integer ottieniPosizioneLiberaNelloZaino() {

		int posizione = 0; // inizializzo il contatore

		for (Libro libro : libri) { // ciclo for per la verifica di uno spazio libero nell'array
			if (libri[posizione] == null)
				return posizione;

			posizione++; // indice array +1 prima di rientrare nel vettore
		}

		return null;
	}

}

/*
 * private void ControlloSpazioNelloZaino(Libro libro) throws
 * ZainoDelClientePienoException {
 * 
 * int contatore = 0; int nrSlotLiberi = 0; boolean SegnalaSpazio = false;
 * 
 * 
 * 
 * for (Libro check : libri) { // ??????? if (libri[contatore] == null) {
 * System.out.println("C'è uno spazio vuoto nella posizione: " + contatore +
 * "\n"); nrSlotLiberi++; SegnalaSpazio = true;
 * OttieniPosizioneLiberaNelloZaino(); // ???? } contatore++; }
 * 
 * System.out.println("Numero spazi disponibili: " + nrSlotLiberi + "\n");
 * 
 * if (nrSlotLiberi == 0) { throw new ZainoDelClientePienoException(); }
 * 
 * }
 */
