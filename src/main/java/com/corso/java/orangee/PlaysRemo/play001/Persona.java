package com.corso.java.orangee.PlaysRemo.play001;

public class Persona {

    private String nome;
    private String cogmome;
    private String cf;



    public boolean verificaCf() {
        if (this.cf == null) {
            System.out.println("inserire codice fiscale\n");
            return false;
        }
        if (this.cf.length() != 16) {
            System.out.println("il codice fiscale di " + this.nome + " non è corretto: la lunghezza deve essere di 16 car.\n");
            return false;
        }
        if (this.cf.substring(0, 5).matches("[a-zA-Z]+")) {
            System.out.println("il codice fiscale di " + this.nome + " non è corretto: i primi sei caratteri devono essere lettere dell'alfabeto.\n");
            return false;
        }
        return true;
    }

    public String nomeCognome() {
        return this.nome + " " + this.cogmome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCogmome() {
        return cogmome;
    }

    public void setCogmome(String cogmome) {
        this.cogmome = cogmome;
    }

    public String getCf() {
        return cf;
    }

    public void setCf(String cf) {
        this.cf = cf;
    }
}
