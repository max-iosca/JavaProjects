package com.corso.java.orange.Collections.Maps.spettacoliTeatro.massimo.v1;

public class Persona {

    private String nome;
    private char sesso;

    public Persona(String nome) {
        this.nome = nome;
    }

    public char getSesso() {
        return sesso;
    }

    public void setSesso(char sesso) {
        this.sesso = sesso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome: "+nome+"\n";
    }
}
