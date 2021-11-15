package com.corso.java.orange.Collections.Maps.capoluogoRegione.massimo;

import java.util.Objects;

public class Regione {

    private String nomeRegione;
    private String cittaCapoluogo;

    public Regione(String nomeRegione, String cittaCapoluogo) {
        this.nomeRegione = nomeRegione;
        this.cittaCapoluogo = cittaCapoluogo;
    }

    public String getNomeRegione() {
        return nomeRegione;
    }

    public void setNomeRegione(String nomeRegione) {
        this.nomeRegione = nomeRegione;
    }

    public String getCittaCapoluogo() {
        return cittaCapoluogo;
    }

    public void setCittaCapoluogo(String cittaCapoluogo) {
        this.cittaCapoluogo = cittaCapoluogo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Regione regione = (Regione) o;
        return Objects.equals(nomeRegione, regione.nomeRegione) && Objects.equals(cittaCapoluogo, regione.cittaCapoluogo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeRegione, cittaCapoluogo);
    }


}
