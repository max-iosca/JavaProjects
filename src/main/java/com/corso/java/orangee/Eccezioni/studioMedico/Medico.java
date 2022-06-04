package com.corso.java.orangee.Eccezioni.studioMedico;

import com.corso.java.orangee.ColoringConsole.ColoringConsole;

import java.util.HashSet;
import java.util.Set;

public class Medico {
    private String nome;
    private String specializzazione;
    private Set<Paziente> listaPazienti;

    public Medico(String nome, String specializzazione) {
        this.nome = nome;
        this.specializzazione = specializzazione;
        this.listaPazienti = new HashSet<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSpecializzazione() {
        return specializzazione;
    }

    public void setSpecializzazione(String specializzazione) {
        this.specializzazione = specializzazione;
    }

    public Set<Paziente> getListaPazienti() {
        return listaPazienti;
    }

    public void setListaPazienti(Set<Paziente> listaPazienti) {
        this.listaPazienti = listaPazienti;
    }

    public void stampaListaPazienti(){
        System.out.println(ColoringConsole.YELLOW_BOLD_BRIGHT+"\nELENCO PAZIENTI DEL DOTT: "+getNome());
        if(listaPazienti.size() == 0){
            System.out.println("IL DOTT: "+getNome()+" PER ORA NON HA PAZIENTI");
            return;
        }
        for(Paziente paziente : listaPazienti){
            System.out.println("PAZIENTE: "+paziente.getNome()+" CF: "+paziente.getCf());
        }
        System.out.print(ColoringConsole.RESET);
    }
}
