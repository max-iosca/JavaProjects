package com.corso.java.orange.Eccezioni.studioMedico;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Prenotazione {
    private Paziente paziente;
    private Medico medico;
    private String tipoVisita;
    private List<Prenotazione> listaPrenotazioni;

    public Prenotazione(Paziente paziente, Medico medico, String tipoVisita) {
        this.paziente = paziente;
        this.medico = medico;
        this.tipoVisita = tipoVisita;
        this.listaPrenotazioni = new ArrayList<>();
    }

    public Paziente getPaziente() {
        return paziente;
    }

    public void setPaziente(Paziente paziente) {
        this.paziente = paziente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public List<Prenotazione> getListaPrenotazioni() {
        return listaPrenotazioni;
    }

    public void setListaPrenotazioni(List<Prenotazione> listaPrenotazioni) {
        this.listaPrenotazioni = listaPrenotazioni;
    }

    public String getTipoVisita() {
        return tipoVisita;
    }

    public void setTipoVisita(String tipoVisita) {
        this.tipoVisita = tipoVisita;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prenotazione that = (Prenotazione) o;
        return Objects.equals(paziente, that.paziente) && Objects.equals(tipoVisita, that.tipoVisita);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paziente, tipoVisita);
    }
}
