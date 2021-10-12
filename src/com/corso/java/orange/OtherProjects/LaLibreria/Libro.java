package com.corso.java.orange.OtherProjects.LaLibreria;

public class Libro {

	private String titoloLibro;
	private String autoreLibro;

	public Libro() {
	}

	public Libro(String titoloLibro, String autoreLibro) {
		this.titoloLibro = titoloLibro;
		this.autoreLibro = autoreLibro;
	}

	public String getTitololibro() {
		return titoloLibro;
	}

	public void setTitololibro(String titololibro) {
		this.titoloLibro = titololibro;
	}

	public String getAutoreLibro() {
		return autoreLibro;
	}

	public void setAutoreLibro(String autoreLibro) {
		this.autoreLibro = autoreLibro;
	}

}
