package com.corso.java.orangee.OtherProjectsAndTest.BlackJack;

import java.util.Objects;

public class Carta {
    private int valore;
    private String nome;
    private Seme seme;

   public String getNomeESeme(){
       return nome+" " +seme;
   }

    public int getValore() {
        return valore;
    }

    public void setValore(int valore) {
        this.valore = valore;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Seme getSeme() {
        return seme;
    }

    public void setSeme(Seme seme) {
        this.seme = seme;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carta carta = (Carta) o;
        return Objects.equals(nome, carta.nome) && seme == carta.seme;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, seme);
    }
}
